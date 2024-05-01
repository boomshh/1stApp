package com.example.mvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val _repository : CounterRepository = CounterRepository()

    // viewmodel 안에서만 활용 가능
    private val _count = mutableStateOf(_repository.getCounter().count)

    // 외부에서 접근 가능 immutable
    val count : MutableState<Int> = _count

    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }


}