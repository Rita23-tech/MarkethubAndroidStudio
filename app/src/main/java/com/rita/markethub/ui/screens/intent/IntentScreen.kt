package com.rita.markethub.ui.screens.intent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rita.markethub.navigation.ROUT_HOME
import com.rita.markethub.navigation.ROUT_ONBOARDING1
import com.rita.markethub.navigation.ROUT_ONBOARDING3

@OptIn(ExperimentalMaterial3Api::class)
@Composable //composable functions means we are going to have other functions in it
fun IntentScreen(navController: NavController){
    //first function is for the UI
    Column( //here we pass the styles
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar( //like the name, this is the top app bar.
            title = { Text(text = "Android intents" ) },
            //navigation icon, are icons at the beginning.
            navigationIcon = {
                IconButton(onClick = { } ) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                } //a clickable icon button
            },
            //icons at the end in a top app bar are called actions
            actions = {


                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "a shopping cart")
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notification place")
                }
                IconButton(onClick = { navController.navigate(ROUT_ONBOARDING3) }) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "To check your account")
                }

                IconButton(onClick = { navController.navigate(ROUT_ONBOARDING1) }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "For going back to initial page")
                }
            }, //b4 u move to the next property, PUT A COMMA

            //To add colors to thr top app bar

            colors = TopAppBarDefaults.topAppBarColors(
                navigationIconContentColor = Color.Cyan, //navigation icon
                containerColor = Color.DarkGray, //the container
                titleContentColor = Color.White, //the title of the top nav bar
                actionIconContentColor = Color.Cyan
            )
        ) //end of top app bar
        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces

        Button(

            onClick = { navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Unspecified),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(text = "Pay Now")
        }
        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces

        Button(

            onClick = { navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Unspecified),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(text = "Call Now")
        }
        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces

        Button(

            onClick = { navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Unspecified),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(text = "Message US")
        }
        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces

        Button(

            onClick = { navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Unspecified),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(text = "Email us")
        }
        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces

        Button(

            onClick = { navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Unspecified),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(text = "Take a picture")
        }
        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces

        Button(

            onClick = { navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Unspecified),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(text = "Share")
        }
        Spacer(modifier = Modifier.height(10.dp)) //used to create spaces









    }


}

@Preview  (showBackground = true) //this is a function that allows android studio to preview
@Composable
fun IntentScreenPreview(){
    //this for returning the design to the preview
    IntentScreen(rememberNavController())
    //this is CALLING the function
    //this function usually has no code
}