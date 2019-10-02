package com.raywenderlich.android.rwdc2018.service

import android.app.Service
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder

class LogJobService : JobService() {

  companion object {
    private const val TAG = "LogJobService"
  }

  override fun onStartJob(params: JobParameters?): Boolean {
    return true
  }

  override fun onStopJob(params: JobParameters?): Boolean {
    return false
  }

}
