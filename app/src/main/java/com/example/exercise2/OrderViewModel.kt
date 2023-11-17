package com.example.exercise2

import androidx.lifecycle.ViewModel
import com.example.exercise2.data.FormUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel {
    class OrderViewModel : ViewModel() {
        private val _stateUI = MutableStateFlow(FormUIState())
        val stateUI: StateFlow<FormUIState> = _stateUI.asStateFlow()
        fun setCustomerDetails(nama: String, nim: String, konsentrasi: String, judul: String) {
            _stateUI.update { stateSaatIni ->
                stateSaatIni.copy(
                    nama = nama,
                    nim = nim,
                    konsentrasi = konsentrasi,
                    judul = judul
                )
            }
        }
    }
}