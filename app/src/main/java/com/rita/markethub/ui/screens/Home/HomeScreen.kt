package com.rita.markethub.ui.screens.Home

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

//this first line of code just shows location/path. In android we dont use forward slash/


@Composable //composable functions means we are going to have other functions in it
fun HomeScreen(navController: NavController){
    //first function is for the UI


}

@Preview //this is a function that allows android studio to preview
@Composable
fun HomeScreenPreview(){
    //this for returning the design to the preview
    HomeScreen(rememberNavController()) //this is CALLING the function
    //this function usually has no code
}










