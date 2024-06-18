package com.acemoney.jetpackcompose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListExample()
{
    var list= listOf("text1","text2","text3","text4",
        "text1","text2","text3","text4",
        "text1","text2","text3","text4")
    LazyColumn{
        items(list)
        {
            item:String->
            TextComponent(params = item)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ListExamplePreview()
{
   ListExample()
}