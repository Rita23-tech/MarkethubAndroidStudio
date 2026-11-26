package com.rita.markethub.ui.screens.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rita.markethub.R
import com.rita.markethub.navigation.ROUT_INTENT
import com.rita.markethub.navigation.ROUT_ONBOARDING1
import com.rita.markethub.navigation.ROUT_ONBOARDING2
import com.rita.markethub.navigation.ROUT_ONBOARDING3

//this first line of code just shows location/path. In android we dont use forward slash/


@OptIn(ExperimentalMaterial3Api::class)
@Composable //composable functions means we are going to have other functions in it
fun HomeScreen(navController: NavController){
    //first function is for the UI
    //HomeScreen is the name of the function
    Column( //here we pass the styles. This is the white screen
        modifier = Modifier.fillMaxSize(),

    ) {
        //Top app bar
        TopAppBar( //like the name, this is the top app bar.
            title = { Text(text = "Home" ) },
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
                IconButton(onClick = { navController.navigate(ROUT_INTENT) }) {
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
        //ROW - side by side
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {

            Image( //how we put image in android studio
                painter = painterResource(R.drawable.img),
                contentDescription =  "This is a product",
                modifier = Modifier.height(200.dp).width(130.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp)) //used to create spaces

            Image( //how we put image in android studio
                painter = painterResource(R.drawable.img_2),
                contentDescription =  "This is a product",
                modifier = Modifier.height(200.dp).width(130.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp)) //used to create spaces

            Image( //how we put image in android studio
                painter = painterResource(R.drawable.img_3),
                contentDescription =  "This is a product",
                modifier = Modifier.height(200.dp).width(130.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))

            Image( //how we put image in android studio
                painter = painterResource(R.drawable.img_4),
                contentDescription =  "This is a product",
                modifier = Modifier.height(200.dp).width(130.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

        }

        //end of row layout




















    }


}

@Preview (showBackground = true) //this is a function that allows android studio to preview
@Composable
fun HomeScreenPreview(){
    //this for returning the design to the preview
    HomeScreen(rememberNavController()) //this is CALLING the function
    //this function usually has no code
}










