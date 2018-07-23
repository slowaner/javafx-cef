// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.handler;

import com.github.slowaner.javafx.cef.browser.CefBrowser;
import com.github.slowaner.javafx.cef.callback.CefBeforeDownloadCallback;
import com.github.slowaner.javafx.cef.callback.CefDownloadItem;
import com.github.slowaner.javafx.cef.callback.CefDownloadItemCallback;

/**
 * An abstract adapter class for receiving download events.
 * The methods in this class are empty.
 * This class exists as convenience for creating handler objects.
 */
public abstract class CefDownloadHandlerAdapter implements CefDownloadHandler {
    @Override
    public void onBeforeDownload(CefBrowser browser, CefDownloadItem downloadItem,
            String suggestedName, CefBeforeDownloadCallback callback) {}

    @Override
    public void onDownloadUpdated(
            CefBrowser browser, CefDownloadItem downloadItem, CefDownloadItemCallback callback) {}
}
