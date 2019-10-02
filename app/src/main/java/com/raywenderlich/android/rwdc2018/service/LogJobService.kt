package com.raywenderlich.android.rwdc2018.service

import android.app.Service
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder

class LogJobService : JobService() {

  override fun onBind(intent: Intent): IBinder {
    TODO("Return the communication channel to the service.")
  }
}
