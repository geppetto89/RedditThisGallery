package com.meninno.reddit.gallery.core

data class Result<out T>(val status: Status, val data: T? = null, val message: String? = null) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    companion object {
        fun <T> success(data: T): Result<T> = Result(Status.SUCCESS, data)
        fun <T> error(message: String): Result<T> = Result(Status.ERROR)
        fun <T> loading(): Result<T> = Result(Status.LOADING)
    }

}