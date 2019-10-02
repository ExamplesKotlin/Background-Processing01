package com.raywenderlich.android.rwdc2018.service

import android.util.Log
import androidx.work.Worker
import com.raywenderlich.android.rwdc2018.app.PhotosUtils

class DownloadWorker : Worker() {

  companion object {
    private const val TAG = "DownloadWorker"
  }

  override fun doWork(): WorkerResult {
    val needsRetry = try {
      val jsonString = PhotosUtils.fetchJsonString()
      (jsonString == null)
    } catch (e: InterruptedException) {
      Log.e(TAG, "Error downloading JSON: " + e.message)
      true
    }

    if (needsRetry) {
      Log.i(TAG, "WorkerResult.RETRY")
//      return WorkerResult.retry()
      return WorkerResult.RETRY
    }

    Log.i(TAG, "WorkerResult.SUCCESS")
//    return WorkerResult.success()
    return return WorkerResult.SUCCESS
  }

}