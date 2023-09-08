package dev.android.test_superset.navigation.graphs

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.android.test_superset.R
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavHostController,) {
    val scale = remember {
        Animatable(0f)
    }

    // AnimationEffect
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                })
        )
        delay(1000L)
        navController.navigate("Welcome")
    }

    // Image
    Box(contentAlignment = Alignment.Center,

        modifier = Modifier.fillMaxSize().
        background(
            color = colorResource(R.color.green)
        ) ){
        Image(painter = painterResource(id = R.drawable.ic_carrot),
            contentDescription = "Logo",
            modifier = Modifier.size(48.dp)
        )
    }
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Superest_ComposeTheme {
        SplashScreen()
    }

 */