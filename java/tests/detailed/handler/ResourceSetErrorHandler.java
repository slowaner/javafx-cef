package tests.detailed.handler;

import com.github.slowaner.javafx.cef.callback.CefCallback;
import com.github.slowaner.javafx.cef.handler.CefLoadHandler.ErrorCode;
import com.github.slowaner.javafx.cef.handler.CefResourceHandlerAdapter;
import com.github.slowaner.javafx.cef.misc.IntRef;
import com.github.slowaner.javafx.cef.misc.StringRef;
import com.github.slowaner.javafx.cef.network.CefRequest;
import com.github.slowaner.javafx.cef.network.CefResponse;

public class ResourceSetErrorHandler extends CefResourceHandlerAdapter {
    @Override
    public boolean processRequest(CefRequest request, CefCallback callback) {
        System.out.println("processRequest: " + request);
        callback.Continue();
        return true;
    }

    @Override
    public void getResponseHeaders(
            CefResponse response, IntRef response_length, StringRef redirectUrl) {
        response.setError(ErrorCode.ERR_NOT_IMPLEMENTED);
        System.out.println("getResponseHeaders: " + response);
    }
}