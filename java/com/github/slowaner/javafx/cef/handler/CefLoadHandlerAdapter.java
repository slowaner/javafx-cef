// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.handler;

import com.github.slowaner.javafx.cef.network.CefRequest;
import com.github.slowaner.javafx.cef.browser.CefBrowser;
import com.github.slowaner.javafx.cef.browser.CefFrame;

/**
 * An abstract adapter class for receiving load events.
 * The methods in this class are empty.
 * This class exists as convenience for creating handler objects.
 */
public abstract class CefLoadHandlerAdapter implements CefLoadHandler {
    @Override
    public void onLoadingStateChange(
            CefBrowser browser, boolean isLoading, boolean canGoBack, boolean canGoForward) {}

    @Override
    public void onLoadStart(CefBrowser browser, CefFrame frame, CefRequest.TransitionType transitionType) {}

    @Override
    public void onLoadEnd(CefBrowser browser, CefFrame frame, int httpStatusCode) {}

    @Override
    public void onLoadError(CefBrowser browser, CefFrame frame, ErrorCode errorCode,
            String errorText, String failedUrl) {}
}
