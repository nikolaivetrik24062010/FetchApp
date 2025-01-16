package com.example.fetch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState

    init {
        fetchItems()
    }

    private fun fetchItems() {
        viewModelScope.launch {
            try {
                _uiState.value = _uiState.value.copy(isLoading = true)
                val items = RetrofitClient.api.getItems()
                    .filter { !it.name.isNullOrBlank() }
                    .sortedWith(compareBy({ it.listId }, { it.name })) 

                _uiState.value = UiState(data = items, isLoading = false)
            } catch (e: Exception) {
                _uiState.value = UiState(error = "Ошибка загрузки данных")
            }
        }
    }
}

data class UiState(
    val isLoading: Boolean = false,
    val data: List<Item> = emptyList(),
    val error: String = ""
)
