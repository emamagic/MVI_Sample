package com.emamagic.simple_mvi_sample.mvi_live_data

data class MainViewState(val fetchStatus: FetchStatus, val newsList: List<NewsItem>)