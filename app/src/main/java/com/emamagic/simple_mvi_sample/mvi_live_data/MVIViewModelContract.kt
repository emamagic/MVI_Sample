package com.emamagic.simple_mvi_sample.mvi_live_data

interface MVIViewModelContract<ViewEvent> {
    fun processEvent(viewEvent: ViewEvent)
}