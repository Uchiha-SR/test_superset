package dev.android.test_superset.navigation.graphs

import androidx.compose.runtime.Composable

import androidx.navigation.NavGraphBuilder


import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation


@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = NavigationItem.Shop.route
    ) {
        composable(route = NavigationItem.Shop.route) {
            HomePage()

        }
        composable(route = NavigationItem.Explore.route) {
            ScreenContent(
                name = NavigationItem.Explore.route,
                onClick = { }
            )
        }
        composable(route = NavigationItem.Cart.route) {
            ScreenContent(
                name = NavigationItem.Cart.route,
                onClick = { }
            )
        }
        detailsNavGraph(navController = navController)
    }
}

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Information.route
    ) {
        composable(route = DetailsScreen.Information.route) {
            ScreenContent(name = DetailsScreen.Information.route) {
                navController.navigate(DetailsScreen.Overview.route)
            }
        }
        composable(route = DetailsScreen.Overview.route) {
            ScreenContent(name = DetailsScreen.Overview.route) {
                navController.popBackStack(
                    route = DetailsScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}

sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = "INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW")
}