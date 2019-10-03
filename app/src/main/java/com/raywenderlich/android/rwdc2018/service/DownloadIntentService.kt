package com.raywenderlich.android.rwdc2018.service

import android.app.IntentService
import android.content.Intent
import android.util.Log
import com.raywenderlich.android.rwdc2018.app.SongUtils


class DownloadIntentService : IntentService("DownloadIntentService") {

  companion object {
    private const val TAG = "DownloadIntentService"
    private const val ACTION_DOWNLOAD = "ACTION_DOWNLOAD"
    private const val EXTRA_URL = "EXTRA_URL"
  }

  override fun onHandleIntent(intent: Intent?) {
    when (intent?.action) {
      ACTION_DOWNLOAD -> {
        // TODO
      }
    }
  }

  private fun handleActionDownload(param: String) {
    Log.i(TAG, "Starting download for $param")
    SongUtils.download(param)
    Log.i(TAG ,"Ending download for $param")
  }

}
