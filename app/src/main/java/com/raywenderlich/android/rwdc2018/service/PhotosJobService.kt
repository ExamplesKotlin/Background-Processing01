package com.raywenderlich.android.rwdc2018.service

import android.app.Service
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder
import android.util.Log

class PhotosJobService : JobService() {

  companion object {
    private const val TAG = "PhotosJobService"
  }

  override fun onStartJob(params: JobParameters?): Boolean {
    return true
  }

  override fun onStopJob(params: JobParameters?): Boolean {
    Log.i(TAG, "Job stopped: " + params?.jobId)
    return false
  }


}
