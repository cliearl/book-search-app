package com.qualitybitz.booksearchapp.worker

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class CacheDeleteWorker(
    context: Context,
    workerParams: WorkerParameters,
) : Worker(context, workerParams) {
    
    override fun doWork(): Result {
        return try {
            Log.d("WorkManager", "Cache has successfully deleted")
            Result.success()
        } catch (exception: Exception) {
            exception.printStackTrace()
            Result.failure()
        }
    }
}