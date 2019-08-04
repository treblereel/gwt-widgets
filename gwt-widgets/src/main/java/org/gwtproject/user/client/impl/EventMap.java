/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.user.client.impl;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;

/**
 * A simple helper class to abstract event maps.
 */
class EventMap extends JavaScriptObject {

    @JsConstructor
    protected EventMap() { /* Mandatory constructor for JSO */}

    /**
     * Returns a function that copies the passed key-value to target object.
     */
    private static JavaScriptObject copyTo(EventMap target) {
        FnVarArgs func = (key, value) -> {
            Js.asPropertyMap(target).set(key.toString(), value);
        };
        return Js.uncheckedCast(func);
    }

    /**
     * Executes a provided function over the key-value pairs of the map object.
     */
    static void foreach(JavaScriptObject map, JavaScriptObject fn) {
        JsPropertyMap _map = map.cast();
        _map.forEach(cb -> {
            FnVarArgs func = fn.cast();
            func.onInvoke(cb, _map.get(cb));
        });
    }

    /**
     * Merges the key-value pairs from the parameter into this object. If a key already exists, then
     * it will be overridden by the new value.
     */
    public final void merge(JavaScriptObject eventMap) {
        foreach(eventMap, copyTo(this));
    }

    @FunctionalInterface
    @JsFunction
    interface FnVarArgs {

        void onInvoke(Object key, Object value);
    }
}
