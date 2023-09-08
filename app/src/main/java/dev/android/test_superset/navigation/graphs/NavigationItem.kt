package dev.android.test_superset.navigation.graphs

import dev.android.test_superset.R


sealed class NavigationItem(var route:String, var icon:Int, var title:String){
    object Shop: NavigationItem("shop", R.drawable.ic_shop,"Shop")
    object Explore: NavigationItem("explore",R.drawable.ic_shop,"Explore")
    object Cart: NavigationItem("cart", R.drawable.ic_cart,"Cart")
    object Favourite: NavigationItem("favorite",R.drawable.ic_baseline_favorite_border_24,"Favourite")
    //  object Account:  NavigationItem("Account",R.drawable.)
}