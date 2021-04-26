package com.emamagic.simple_mvi_sample

import android.os.Bundle
import androidx.activity.viewModels
import com.emamagic.simple_mvi_sample.mvi2.*

class SecondActivity : MVIBaseActivity<MainViewState ,MainViewEffect ,MainViewEvent ,MyViewModel>() {

    override val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // mvi 2 ->

    }


    override fun renderViewState(viewState: MainViewState) {
        //Handle new viewState
    }

    override fun renderViewEffect(viewEffect: MainViewEffect) {
        //Show effects
    }
}