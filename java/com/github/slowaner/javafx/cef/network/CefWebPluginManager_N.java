// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package com.github.slowaner.javafx.cef.network;

import com.github.slowaner.javafx.cef.callback.CefNative;
import com.github.slowaner.javafx.cef.callback.CefWebPluginInfoVisitor;
import com.github.slowaner.javafx.cef.callback.CefWebPluginUnstableCallback;

class CefWebPluginManager_N extends CefWebPluginManager implements CefNative {
    // Used internally to store a pointer to the CEF object.
    private long N_CefHandle = 0;
    private static CefWebPluginManager_N instance = null;

    @Override
    public void setNativeRef(String identifer, long nativeRef) {
        N_CefHandle = nativeRef;
    }

    @Override
    public long getNativeRef(String identifer) {
        return N_CefHandle;
    }

    CefWebPluginManager_N() {
        super();
    }

    public static synchronized CefWebPluginManager_N getInstance() {
        if (instance == null) instance = new CefWebPluginManager_N();
        return instance;
    }

    @Override
    public void visitPlugins(CefWebPluginInfoVisitor visitor) {
        try {
            N_VisitPlugins(visitor);
        } catch (UnsatisfiedLinkError ule) {
            ule.printStackTrace();
        }
    }

    @Override
    public void refreshPlugins() {
        try {
            N_RefreshPlugins();
        } catch (UnsatisfiedLinkError ule) {
            ule.printStackTrace();
        }
    }

    @Override
    public void unregisterInternalPlugin(String path) {
        try {
            N_UnregisterInternalPlugin(path);
        } catch (UnsatisfiedLinkError ule) {
            ule.printStackTrace();
        }
    }

    @Override
    public void registerPluginCrash(String path) {
        try {
            N_RegisterPluginCrash(path);
        } catch (UnsatisfiedLinkError ule) {
            ule.printStackTrace();
        }
    }

    @Override
    public void isWebPluginUnstable(String path, CefWebPluginUnstableCallback callback) {
        try {
            N_IsWebPluginUnstable(path, callback);
        } catch (UnsatisfiedLinkError ule) {
            ule.printStackTrace();
        }
    }

    private final native void N_VisitPlugins(CefWebPluginInfoVisitor visitor);
    private final native void N_RefreshPlugins();
    private final native void N_UnregisterInternalPlugin(String path);
    private final native void N_RegisterPluginCrash(String path);
    private final native void N_IsWebPluginUnstable(
            String path, CefWebPluginUnstableCallback callback);
}
