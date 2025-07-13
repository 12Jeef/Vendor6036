package com.peninsula.jni;

public class VendorJNI {
  static boolean libraryLoaded = false;

  static {
    forceLoad();
  }

  public static synchronized void forceLoad() {
    if (libraryLoaded) {
      return;
    }
    System.loadLibrary("VendorDriver");
    libraryLoaded = true;
  }

  public static native int initialize();
}
