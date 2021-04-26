package com.emamagic.simple_mvi_sample.mvi2

interface MVIViewModelContract<ViewEvent> {
    fun processEvent(viewEvent: ViewEvent)
}