package com.raywenderlich.android.rwdc2018.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class SongService : Service() {

  override fun onBind(intent: Intent): IBinder? {
    return null // Prevents binding with Activity
  }
}
