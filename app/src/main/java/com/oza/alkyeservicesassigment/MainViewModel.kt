package com.oza.alkyeservicesassigment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _isReady = MutableStateFlow(false)
    val isReady = _isReady

    init {
        viewModelScope.launch {
            delay(3000)
            _isReady.value = true
        }
    }

}