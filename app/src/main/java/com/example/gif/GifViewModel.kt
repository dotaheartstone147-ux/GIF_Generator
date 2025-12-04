package com.example.gif

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class GifViewModel : ViewModel() {
    var gifUrl by mutableStateOf<String?>(null)
        private set

    fun searchGif(query: String) {
        viewModelScope.launch {
            try {
                val response = ApiClient.api.searchGifs(
                    apiKey = "YOUR API KEY",
                    query = query,
                    limit = 2
                )
                gifUrl = response.data.firstOrNull()?.images?.original?.url
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
