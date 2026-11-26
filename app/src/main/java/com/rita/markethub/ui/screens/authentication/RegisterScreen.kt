package com.rita.markethub.ui.screens.authentication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable //composable functions means we are going to have other functions in it
fun RegisterScreen(navController: NavController){
    //first function is for the UI
    Column( //here we pass the styles
        modifier = Modifier.fillMaxSize()


    ) {










    }


}

@Preview  (showBackground = true) //this is a function that allows android studio to preview
@Composable
fun RegisterScreenPreview(){
    //this for returning the design to the preview
    RegisterScreen(rememberNavController())
    //this is CALLING the function
    //this function usually has no code
}











