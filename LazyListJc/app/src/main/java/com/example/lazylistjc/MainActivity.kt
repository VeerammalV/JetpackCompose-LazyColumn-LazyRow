package com.example.lazylistjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.lazylistjc.ui.theme.LazyListJcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyListJcTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    val fruitsList = listOf("Papaya", "Apple", "Mango", "Strawberry", "Orange", "Blueberry", "Banana", "WaterMelon", "Muskmelon", "Dragon fruit", "Fig", "Kiwi", "Cherry", "Raspberry", "Guava", "Grape", "Pomegranate", "Peach")
                    DisplayLists(fruitsList)
                }
            }
        }
    }
}

@Composable
fun DisplayLists(fruitsLists : List<String>) {

    // Displays list (no scrolling)

//    Column {
//        fruitsLists.forEach{
//            Text(text = it, fontSize = 30.sp, color = Color.Red)
//        }
//    }


    // Displays lists vertically

//    LazyColumn {
//        items(fruitsLists){
//            Text(text = it, fontSize = 30.sp, color = Color.Red)
//        }
//    }


    // Displays list horizontally

    LazyRow {
        items(fruitsLists){
            Text(text = it, fontSize = 30.sp, color = Color.Red)
        }
    }
}

