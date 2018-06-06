/*
 * Copyright 2008 Google Inc.
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

/**
 * A widget that implements this interface sources the events defined by the
 * {@link ScrollListener} interface.
 * 
 * @deprecated use {@link com.google.gwt.event.dom.client.HasScrollHandlers}
 * instead
 */
@Deprecated
public interface SourcesScrollEvents {

  /**
   * Adds a listener interface to receive scroll events.
   * 
   * @param listener the listener interface to add
   * @deprecated use
   * {@link com.google.gwt.event.dom.client.HasScrollHandlers#addScrollHandler}
   * instead
   */
  @Deprecated
  void addScrollListener(ScrollListener listener);

  /**
   * Removes a previously added scroll listener.
   * 
   * @param listener the listener interface to remove
   * @deprecated Use the
   * {@link com.google.gwt.event.shared.HandlerRegistration#removeHandler}
   * method on the object returned by
   * {@link com.google.gwt.event.dom.client.HasScrollHandlers#addScrollHandler}
   * instead
   */
  @Deprecated
  void removeScrollListener(ScrollListener listener);
}
