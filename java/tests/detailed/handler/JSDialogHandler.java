// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package tests.detailed.handler;

import com.github.slowaner.javafx.cef.browser.CefBrowser;
import com.github.slowaner.javafx.cef.callback.CefJSDialogCallback;
import com.github.slowaner.javafx.cef.handler.CefJSDialogHandlerAdapter;
import com.github.slowaner.javafx.cef.misc.BoolRef;

public class JSDialogHandler extends CefJSDialogHandlerAdapter {
    @Override
    public boolean onJSDialog(CefBrowser browser, String origin_url, JSDialogType dialog_type,
            String message_text, String default_prompt_text, CefJSDialogCallback callback,
            BoolRef suppress_message) {
        if (message_text.equalsIgnoreCase("Never displayed")) {
            suppress_message.set(true);
            System.out.println(
                    "The " + dialog_type + " from origin \"" + origin_url + "\" was suppressed.");
            System.out.println(
                    "   The content of the suppressed dialog was: \"" + message_text + "\"");
        }
        return false;
    }
}
