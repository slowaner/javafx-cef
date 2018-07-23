// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.callback;

import com.github.slowaner.javafx.cef.misc.CefPrintSettings;

/**
 * Callback interface for asynchronous continuation of print dialog requests.
 */
public interface CefPrintDialogCallback {
    /**
     * Continue printing with the specified |settings|.
     */
    void Continue(CefPrintSettings settings);

    /**
     * Cancel the printing.
     */
    void cancel();
}
