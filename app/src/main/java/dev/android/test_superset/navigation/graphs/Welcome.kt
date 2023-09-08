package dev.android.test_superset.navigation.graphs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import dev.android.test_superset.R


@Composable
fun Welcome(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            //  .background(LightGray)
            .paint(
                painterResource(id = R.drawable.welcome_image),
                contentScale = ContentScale.FillBounds
            )

            .padding(top=120.dp,bottom = 24.dp)
        //.size(88.dp),
    ) {
        Column(
            modifier= Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Image(
                painter = painterResource(
                    id = R.drawable.ic_carrot,
                ),
                contentDescription = "",
                modifier = Modifier
                    //    .align(Alignment.Center)
                    //  .clip(RoundedCornerShape(16.dp))
                    //   .background(Black)
                    .size(80.dp),
                contentScale = ContentScale.Crop,
            )

            Text(
                text = "Welcome",
                //    modifier = Modifier.align(Alignment.Center),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.W500,
                    fontStyle = FontStyle.Normal,
                    letterSpacing = 0.5.em,
                    //  background = Color.LightGray,
                )
            )

            Text(
                text = "To Our Store",
                //     modifier = Modifier.align(Alignment.Center),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.W500,
                    fontStyle = FontStyle.Normal,
                    letterSpacing = 0.5.em,
                    //  background = Color.LightGray,
                )
            )

            Text(
                text = "Get your groceries in as fast as one hour",
                //      modifier = Modifier.align(Alignment.Center),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 10.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                    letterSpacing = 0.5.em,
                    //  background = Color.LightGray,
                )
            )


            Button(
                //   modifier = Modifier
                //          .align(Alignment.BottomCenter)
                // .background(
                //    color = colorResource(R.color.green)
                //     )
                //    .size(120.dp),
                onClick = { /* ... */

                    navController.navigate(NavigationItem.Shop.route)},
                //   colors = ButtonDefaults.buttonColors(backgroundColor =  colorResource(R.color.green)),
                // Uses ButtonDefaults.ContentPadding by default


            ) {
                // Inner content including an icon and a text label

                Text("GET  STARTED")
            }
        }
    }

    /*
    Box(
        modifier = with(Modifier) {
            fillMaxSize()

                .paint(
                    // Replace with your image id
                    painterResource(id = R.drawable.welcome_image),
                    contentScale = ContentScale.FillBounds
                )

        })
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
          //  horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Image(
               // modifier =Modifier.,
                painter = painterResource(id = R.drawable.ic_carrot),
                contentDescription = "",
                Modifier.size(98.dp).align( Alignment.Center)

            )
            // Add more views here!
            Text(
                text = "Welcome",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.W500,
                    fontStyle = FontStyle.Normal,
                    letterSpacing = 0.5.em,
                    //  background = Color.LightGray,
                )
            )

            Text(
                text = "To Our Store",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.W500,
                    fontStyle = FontStyle.Normal,
                    letterSpacing = 0.5.em,
                    //  background = Color.LightGray,
                )
            )

            Text(
                text = "Get your groceries in as fast as one hour",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 10.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.W500,
                    fontStyle = FontStyle.Normal,
                    letterSpacing = 0.5.em,
                    //  background = Color.LightGray,
                )
            )

            Button(

                onClick = { /* ... */ },
                // Uses ButtonDefaults.ContentPadding by default
                contentPadding = PaddingValues(
              //      start = 20.dp,
                //    top = 120.dp,
                 //   end = 20.dp,
                 //   bottom = 12.dp
                ),

                ) {
                // Inner content including an icon and a text label
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Favorite",
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )
                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                Text("Like")
            }
        }
    } */
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
    Superest_ComposeTheme {
        Welcome()
    }
}*/