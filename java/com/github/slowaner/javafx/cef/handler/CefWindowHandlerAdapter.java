// Copyright (c) 2015 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.handler;

//import java.awt.Rectangle;

import com.github.slowaner.javafx.cef.browser.CefBrowser;
import javafx.scene.shape.Rectangle;

/**
 * An abstract adapter class for receiving windowed render events.
 * The methods in this class are empty.
 * This class exists as convenience for creating handler objects.
 */
public abstract class CefWindowHandlerAdapter implements CefWindowHandler {
    @Override
    public Rectangle getRect(CefBrowser browser) {
        return new Rectangle(0, 0, 0, 0);
    }

    @Override
    public void onMouseEvent(
            CefBrowser browser, int event, int screenX, int screenY, int modifier, int button) {}
}
