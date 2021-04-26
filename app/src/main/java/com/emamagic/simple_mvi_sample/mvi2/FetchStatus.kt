package com.emamagic.simple_mvi_sample.mvi2

sealed class FetchStatus{
    object Fetching : FetchStatus()
    object Fetched : FetchStatus()
    object NotFetched : FetchStatus()
}
