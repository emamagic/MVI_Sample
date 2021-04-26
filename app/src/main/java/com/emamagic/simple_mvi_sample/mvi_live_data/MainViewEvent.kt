package com.emamagic.simple_mvi_sample.mvi_live_data

sealed class MainViewEvent {
    data class NewsItemClicked(val newsItem: NewsItem) : MainViewEvent()
    object FabClicked : MainViewEvent()
    object OnSwipeRefresh : MainViewEvent()
    object FetchNews : MainViewEvent()
}