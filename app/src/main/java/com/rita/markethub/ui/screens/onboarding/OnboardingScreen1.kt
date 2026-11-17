package com.rita.markethub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rita.markethub.R
import com.rita.markethub.navigation.ROUT_ONBOARDING2

@Composable //composable functions means we are going to have other functions in it
fun OnboardingScreen1(navController: NavController){
    //first function is for the UI
    //NOW WE START DESIGNING
    Column( //here we pass the styles
        modifier = Modifier.fillMaxSize(), //put commas to move to the next style
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Image( //how we put image in android studio
            painter = painterResource(R.drawable.bizicon),
            contentDescription =  "This is a product",
            modifier = Modifier.height(200.dp).width(150.dp) //dp unit for height
        )

        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces

        Text(
            text = "Shop now. Live better", //comma to move to the next style
            fontSize = 30.sp, //(sp is unit for text)
            fontWeight = FontWeight.Bold,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Mobile commerce accounts for over 60% of global e-commerce sales, driving businesses to adopt dedicated smartphone apps for speed, loyalty, and push-notification engagement",
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate(ROUT_ONBOARDING2)},
            colors = ButtonDefaults.buttonColors(Color.Unspecified),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp),
            ) {
            Text(text = "Get started")
        }














    }






}

@Preview (showBackground = true)    //preview is a function that allows android studio to preview
@Composable
fun OnboardingScreen1Preview(){
    //this for returning the design to the preview
    OnboardingScreen1(rememberNavController()) //this is CALLING the function
    //this function usually has no code
}
