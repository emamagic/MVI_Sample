package com.emamagic.simple_mvi_sample.mvi_coroutines

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): BaseViewModel<MainContract.Event ,MainContract.State ,MainContract.Effect>() {

    override fun createInitialState(): MainContract.State {
        return MainContract.State(
            MainContract.RandomNumberState.Idle
        )
    }

    override fun handleEvent(event: MainContract.Event) {
        when (event) {
            is MainContract.Event.OnRandomNumberClicked -> { generateRandomNumber() }
            is MainContract.Event.OnShowToastClicked -> {
                setEffect { MainContract.Effect.ShowToast }
            }
        }
    }



    /**
     * Generate a random number
     */
    private fun generateRandomNumber() {
        viewModelScope.launch {
            // Set Loading
            setState { copy(randomNumberState = MainContract.RandomNumberState.Loading) }
            try {
                // Add delay for simulate network call
                delay(5000)
                val random = (0..10).random()
                if (random % 2 == 0) {
                    // If error happens set state to Idle
                    // If you want create a Error State and use it
                    setState { copy(randomNumberState = MainContract.RandomNumberState.Idle) }
                    throw RuntimeException("Number is even")
                }
                // Update state
                setState { copy(randomNumberState = MainContract.RandomNumberState.Success(number = random)) }
            } catch (exception : Exception) {
                // Show error
                setEffect { MainContract.Effect.ShowToast }
            }
        }
    }
}