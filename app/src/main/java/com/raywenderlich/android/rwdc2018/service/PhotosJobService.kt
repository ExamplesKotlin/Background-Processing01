package com.raywenderlich.android.rwdc2018.service

import android.app.Service
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder

class PhotosJobService : JobService() {

  companion object {
    private const val TAG = "PhotosJobService"
  }
}
