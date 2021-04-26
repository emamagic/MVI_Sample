package com.emamagic.simple_mvi_sample.mvi_live_data

sealed class FetchStatus{
    object Fetching : FetchStatus()
    object Fetched : FetchStatus()
    object NotFetched : FetchStatus()
}
