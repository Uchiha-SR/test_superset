package dev.android.test_superset.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Splash.route
    ) {
        composable(route = AuthScreen.Splash.route) {
            SplashScreen(navController = navController)
            /*       onSignUpClick = {
                       navController.navigate(AuthScreen.SignUp.route)
                   },
                   onForgotClick = {
                       navController.navigate(AuthScreen.Forgot.route)
                   } */
            //  )
        }
           composable(route = AuthScreen.Welcome.route) {

                    Welcome(navController = navController)


            }

    }
}

sealed class AuthScreen(val route: String) {
    object Splash : AuthScreen(route = "SPLASH")
    object Welcome: AuthScreen(route = "WELCOME")
}