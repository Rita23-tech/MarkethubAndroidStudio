package com.rita.markethub.ui.screens.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rita.markethub.navigation.ROUT_HOME
import com.rita.markethub.navigation.ROUT_ONBOARDING1
import com.rita.markethub.navigation.ROUT_ONBOARDING2


@OptIn(ExperimentalMaterial3Api::class)
@Composable //composable functions means we are going to have other functions in it
fun OnboardingScreen3(navController: NavController){
    //first function is for the UI
    Column( //here we pass the styles
        modifier = Modifier.fillMaxSize()


    ) {
        //Top app bar
        TopAppBar( //like the name, this is the top app bar.
            title = { Text(text = "Welcome" ) },
            //navigation icon, are icons at the beginning.
            navigationIcon = {
                IconButton(onClick = { } ) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                } //a clickable icon button
            },
            //icons at the end in a top app bar are called actions
            actions = {
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "The like part")
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "sharing place")
                }
                IconButton(onClick = { navController.navigate(ROUT_HOME) }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "To go to home")
                }

                IconButton(onClick = { navController.navigate(ROUT_ONBOARDING1) }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "for going back to initial page")
                }
            }, //b4 u move to the next property, PUT A COMMA

            //To add colors to thr top app bar

            colors = TopAppBarDefaults.topAppBarColors(
                navigationIconContentColor = Color.Cyan, //navigation icon
                containerColor = Color.DarkGray, //the container
                titleContentColor = Color.White, //the title of the top nav bar
                actionIconContentColor = Color.Cyan
            )


        )


















    }


}

@Preview (showBackground = true) //this is a function that allows android studio to preview
@Composable
fun OnboardingScreen3Preview(){
    //this for returning the design to the preview
    OnboardingScreen3(rememberNavController()) //this is CALLING the function
    //this function usually has no code
}
