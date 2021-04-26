package com.emamagic.simple_mvi_sample.mvi_live_data

sealed class MainViewEffect{
    data class ShowSnackbar(val message: String) : MainViewEffect()
    data class ShowToast(val message: String) : MainViewEffect()
}
