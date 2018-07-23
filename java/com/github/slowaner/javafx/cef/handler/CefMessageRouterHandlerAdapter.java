// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.handler;

import com.github.slowaner.javafx.cef.browser.CefBrowser;
import com.github.slowaner.javafx.cef.browser.CefFrame;
import com.github.slowaner.javafx.cef.callback.CefNativeAdapter;
import com.github.slowaner.javafx.cef.callback.CefQueryCallback;

/**
 * An abstract adapter class for receiving message router events.
 * The methods in this class are empty.
 * This class exists as convenience for creating handler objects.
 */
public abstract class CefMessageRouterHandlerAdapter
        extends CefNativeAdapter implements CefMessageRouterHandler {
    @Override
    public boolean onQuery(CefBrowser browser, CefFrame frame, long query_id, String request,
            boolean persistent, CefQueryCallback callback) {
        return false;
    }

    @Override
    public void onQueryCanceled(CefBrowser browser, CefFrame frame, long query_id) {
        return;
    }
}
