package com.emamagic.simple_mvi_sample.mvi_live_data

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

abstract class MVIBaseActivity<STATE, EFFECT, EVENT, ViewModel : MVIBaseViewModel<STATE, EFFECT, EVENT>> :
    AppCompatActivity() {

    private  val TAG = "MVIBaseFragment"
    abstract val viewModel: ViewModel

    private val viewStateObserver = Observer<STATE> {
        Log.d(TAG, "observed viewState : $it")
        renderViewState(it)
    }

    private val viewEffectObserver = Observer<EFFECT> {
        Log.d(TAG, "observed viewEffect : $it")
        renderViewEffect(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.viewStates().observe(this, viewStateObserver)
        viewModel.viewEffects().observe(this, viewEffectObserver)
    }

    abstract fun renderViewState(viewState: STATE)

    abstract fun renderViewEffect(viewEffect: EFFECT)
}