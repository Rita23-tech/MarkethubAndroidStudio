package com.rita.markethub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rita.markethub.ui.screens.Home.HomeScreen
import com.rita.markethub.ui.screens.authentication.LoginScreen
import com.rita.markethub.ui.screens.authentication.RegisterScreen
import com.rita.markethub.ui.screens.onboarding.OnboardingScreen1
import com.rita.markethub.ui.screens.onboarding.OnboardingScreen2
import com.rita.markethub.ui.screens.onboarding.OnboardingScreen3


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN) {
           LoginScreen(navController)
        }

        composable(ROUT_REGISTRATION) {
            RegisterScreen(navController)
        }

        composable(ROUT_ONBOARDING1) {
            OnboardingScreen1(navController)
        }

        composable(ROUT_ONBOARDING2) {
            OnboardingScreen2(navController)
        }

        composable(ROUT_ONBOARDING3) {
            OnboardingScreen3(navController)
        }

    }
}