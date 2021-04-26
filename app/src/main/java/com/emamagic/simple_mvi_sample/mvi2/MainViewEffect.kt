package com.emamagic.simple_mvi_sample.mvi2

sealed class MainViewEffect{
    data class ShowSnackbar(val message: String) : MainViewEffect()
    data class ShowToast(val message: String) : MainViewEffect()
}
