package com.prafullkumar.profile

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.prafullkumar.common.data.local.UserDataDao
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ProfileViewModel : ViewModel(), KoinComponent {

    private val dao by inject<UserDataDao>()
    var userLoggedIn by mutableStateOf<Boolean>(FirebaseAuth.getInstance().currentUser != null)

    val user = FirebaseAuth.getInstance().currentUser

    val userInfo = dao.getUserDataFlow().map { list ->
        list.map { userData ->
            userData.toUserData()
        }
    }
        .stateIn(viewModelScope, started = SharingStarted.WhileSubscribed(500), null)

    fun syncData() {
        viewModelScope.launch {
            // TODO
        }
    }

    fun signInUser() {
        viewModelScope.launch {
            // TODO
        }
    }

    fun logout() {
        viewModelScope.launch {
            // TODO
        }
    }

}