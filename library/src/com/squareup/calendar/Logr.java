package com.squareup.calendar;

import android.util.Log;

/** Log utility class to handle the log tag and DEBUG-only logging. */
final class Logr {
  public static void d(String message) {
    if (BuildConfig.DEBUG) {
      Log.d("CalendarPicker", message);
    }
  }
}
