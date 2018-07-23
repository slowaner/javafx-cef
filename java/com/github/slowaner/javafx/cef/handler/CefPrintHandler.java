// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.handler;

//import java.awt.Dimension;
import com.github.slowaner.javafx.cef.browser.CefBrowser;
import com.github.slowaner.javafx.cef.callback.CefNative;
import com.github.slowaner.javafx.cef.callback.CefPrintDialogCallback;
import com.github.slowaner.javafx.cef.callback.CefPrintJobCallback;
import com.github.slowaner.javafx.cef.misc.CefPrintSettings;

/**
 * Implement this interface to handle printing on Linux. The methods of this
 * class will be called on the browser process UI thread.
 */
public interface CefPrintHandler extends CefNative {
    /**
     * Called when printing has started for the specified |browser|. This method
     * will be called before the other onPrint*() methods and irrespective of how
     * printing was initiated (e.g. CefBrowser::print(), JavaScript window.print()
     * or PDF extension print button).
     */
    void onPrintStart(CefBrowser browser);

    /**
     * Synchronize |settings| with client state. If |get_defaults| is true then
     * populate |settings| with the default print settings. Do not keep a
     * reference to |settings| outside of this callback.
     */
    void onPrintSettings(CefPrintSettings settings, boolean get_defaults);

    /**
     * Show the print dialog. Execute |callback| once the dialog is dismissed.
     * Return true if the dialog will be displayed or false to cancel the
     * printing immediately.
     *
     */
    boolean onPrintDialog(boolean has_selection, CefPrintDialogCallback callback);

    /**
     * Send the print job to the printer. Execute |callback| once the job is
     * completed. Return true if the job will proceed or false to cancel the job
     * immediately.
     */
    boolean onPrintJob(String document_name, String pdf_file_path, CefPrintJobCallback callback);

    /**
     * Reset client state related to printing.
     */
    void onPrintReset();
    
    /**
     * Called when PrintToPDF is requested for a browser. Returns the page size
     * (as measured in microns) to use.
     * @param deviceUnitsPerInch The DPI of the print. Use this to calculate
     *      the page size to use.
     * @return The page size
     */
    Dimension getPdfPaperSize(int deviceUnitsPerInch);
    
}
