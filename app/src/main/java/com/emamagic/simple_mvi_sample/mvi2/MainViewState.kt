package com.emamagic.simple_mvi_sample.mvi2

data class MainViewState(val fetchStatus: FetchStatus, val newsList: List<NewsItem>)