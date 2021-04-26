package com.emamagic.simple_mvi_sample.mvi_live_data

class MyViewModel: MVIBaseViewModel<MainViewState ,MainViewEffect ,MainViewEvent>() {

    init {
        viewState = MainViewState(fetchStatus = FetchStatus.NotFetched ,newsList = emptyList())
    }

   // viewState = viewState.copy(fetchStatus = FetchStatus.Fetched, newsList = result.data)

    override fun processEvent(viewEvent: MainViewEvent) {
        super.processEvent(viewEvent)
    }


}