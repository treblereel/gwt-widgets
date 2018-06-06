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

import java.util.EventListener;

/**
 * Event handler interface for {@link DisclosureEvent}.
 * 
 * @deprecated Use {@link com.google.gwt.event.logical.shared.CloseHandler}
 *             and/or {@link com.google.gwt.event.logical.shared.OpenHandler}
 *             instead
 * @see DisclosurePanel
 */
@Deprecated
public interface DisclosureHandler extends EventListener {
  /**
   * Fired when the panel is closed.
   * 
   * @param event event representing this action.
   * @deprecated Use {@link com.google.gwt.event.logical.shared.CloseHandler}
   *             instead
   */
  @Deprecated
  void onClose(DisclosureEvent event);

  /**
   * Fired when the panel is opened.
   * 
   * @param event event representing this action.
   * @deprecated Use {@link com.google.gwt.event.logical.shared.OpenHandler} instead
   */
  @Deprecated
  void onOpen(DisclosureEvent event);
}
