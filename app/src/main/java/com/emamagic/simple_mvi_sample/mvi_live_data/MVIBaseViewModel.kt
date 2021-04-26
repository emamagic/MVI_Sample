package com.emamagic.simple_mvi_sample.mvi_live_data

import android.util.Log
import androidx.annotation.CallSuper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emamagic.simple_mvi_sample.util.SingleLiveEvent

abstract class MVIBaseViewModel<ViewState, ViewEffect, ViewEvent> :
    ViewModel(), MVIViewModelContract<ViewEvent> {


    private val _viewStates: MutableLiveData<ViewState> = MutableLiveData()
    fun viewStates(): LiveData<ViewState> = _viewStates

    private var _viewState: ViewState? = null
    protected var viewState: ViewState
        get() = _viewState
            ?: throw UninitializedPropertyAccessException(
                "\"viewState\" was queried before being initialized"
            )
        set(value) {
            _viewState = value
            _viewStates.value = value
        }




    private val _viewEffects: SingleLiveEvent<ViewEffect> = SingleLiveEvent()
    fun viewEffects(): SingleLiveEvent<ViewEffect> = _viewEffects

    private var _viewEffect: ViewEffect? = null
    protected var viewEffect: ViewEffect
        get() = _viewEffect
            ?: throw UninitializedPropertyAccessException(
                "\"viewEffect\" was queried before being initialized"
            )
        set(value) {
            _viewEffect = value
            _viewEffects.value = value
        }



    @CallSuper
    override fun processEvent(viewEvent: ViewEvent) {
        Log.e("TAG", "processEvent: $viewEvent")
    }

}