package com.example.exercise2

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons. Icons
import androidx.compose.material.icons.filled. ArrowBack
import androidx.compose.material3. ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3. IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3. Text
import androidx.compose.material3. TopAppBar
import androidx.compose.material3. TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class PengelolaHalaman {
    Home,
    CustomerDetails,
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise(

    navController: NavHostController = rememberNavController()
) {
    Scaffold(

    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = PengelolaHalaman.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = PengelolaHalaman.Home.name) {
                HalamanHome(onNextButtonClicked = {
                    navController.navigate(PengelolaHalaman.CustomerDetails.name)
                }
                )
            }
            composable(route = PengelolaHalaman.CustomerDetails.name) {
                HalamanDua(onSubmitButtonClicked = {})
            }
        }
    }
}



