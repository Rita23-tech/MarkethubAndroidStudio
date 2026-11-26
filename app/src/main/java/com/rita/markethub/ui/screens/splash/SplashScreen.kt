package com.rita.markethub.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rita.markethub.R
import com.rita.markethub.navigation.ROUT_ONBOARDING1
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable //composable functions means we are going to have other functions in it
fun SplashScreen(navController: NavController){
    //Navigation
    var coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(3000)
        navController.navigate(ROUT_ONBOARDING1)
    }




    Column( //here we pass the styles
        modifier = Modifier.fillMaxSize().background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ) {

        Image( //how we put image in android studio
            painter = painterResource(R.drawable.img_5),
            contentDescription =  "This is a product",
            modifier = Modifier.height(200.dp).width(150.dp) //dp unit for height
        )

        LinearProgressIndicator()











    }


}

@Preview  (showBackground = true) //this is a function that allows android studio to preview
@Composable
fun SplashScreenPreview(){
    //this for returning the design to the preview
    SplashScreen(rememberNavController())
    //this is CALLING the function
    //this function usually has no code
}