/*
 * Copyright 2007 Google Inc.
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
package org.gwtproject.user.client.ui;

import java.util.ArrayList;

/**
 * A helper class for implementers of the SourcesClickEvents interface. This
 * subclass of {@link ArrayList} assumes that all objects added to it will be of
 * type {@link ClickListener}.
 * 
 * @deprecated As of GWT 1.6, call
 *             <code>{@link Widget#addDomHandler(com.google.gwt.event.shared.EventHandler, com.google.gwt.event.dom.client.DomEvent.Type) addDomHandler}(myHandler, ClickEvent.getType())</code>
 *             to manage handlers for your widget instead
 */
@Deprecated
public class ClickListenerCollection extends ArrayList<ClickListener> {

  /**
   * Fires a click event to all listeners.
   * 
   * @param sender the widget sending the event.
   */
  public void fireClick(Widget sender) {
    for (ClickListener listener : this) {
      listener.onClick(sender);
    }
  }
}
