// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.handler;

import com.github.slowaner.javafx.cef.network.CefRequest;
import com.github.slowaner.javafx.cef.browser.CefBrowser;
import com.github.slowaner.javafx.cef.browser.CefFrame;
import com.github.slowaner.javafx.cef.callback.CefAuthCallback;
import com.github.slowaner.javafx.cef.callback.CefRequestCallback;
import com.github.slowaner.javafx.cef.misc.BoolRef;
import com.github.slowaner.javafx.cef.misc.StringRef;
import com.github.slowaner.javafx.cef.network.CefResponse;
import com.github.slowaner.javafx.cef.network.CefURLRequest;

/**
 * An abstract adapter class for receiving browser request events.
 * The methods in this class are empty.
 * This class exists as convenience for creating handler objects.
 */
public abstract class CefRequestHandlerAdapter implements CefRequestHandler {
    @Override
    public boolean onBeforeBrowse(CefBrowser browser, CefFrame frame, CefRequest request,
            boolean user_gesture, boolean is_redirect) {
        return false;
    }

    @Override
    public boolean onBeforeResourceLoad(CefBrowser browser, CefFrame frame, CefRequest request) {
        return false;
    }

    @Override
    public CefResourceHandler getResourceHandler(
            CefBrowser browser, CefFrame frame, CefRequest request) {
        return null;
    }

    @Override
    public void onResourceRedirect(CefBrowser browser, CefFrame frame, CefRequest request,
            CefResponse response, StringRef new_url) {}

    @Override
    public boolean onResourceResponse(
            CefBrowser browser, CefFrame frame, CefRequest request, CefResponse response) {
        return false;
    }

    @Override
    public void onResourceLoadComplete(CefBrowser browser, CefFrame frame, CefRequest request,
            CefResponse response, CefURLRequest.Status status, long receivedContentLength) {}

    @Override
    public boolean getAuthCredentials(CefBrowser browser, CefFrame frame, boolean isProxy,
            String host, int port, String realm, String scheme, CefAuthCallback callback) {
        return false;
    }

    @Override
    public boolean onQuotaRequest(
            CefBrowser browser, String origin_url, long new_size, CefRequestCallback callback) {
        return false;
    }

    @Override
    public void onProtocolExecution(CefBrowser browser, String url, BoolRef allow_os_execution) {}

    @Override
    public boolean onCertificateError(CefBrowser browser, CefLoadHandler.ErrorCode cert_error, String request_url,
                                      CefRequestCallback callback) {
        return false;
    }

    @Override
    public void onPluginCrashed(CefBrowser browser, String pluginPath) {}

    @Override
    public void onRenderProcessTerminated(CefBrowser browser, TerminationStatus status) {}
}
