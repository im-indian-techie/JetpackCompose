package com.acemoney.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VerticalScreen()
{
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(10.dp))
        {
        SimpleTextField()
            Spacer(modifier = Modifier.height(40.dp))
        SimpleButton()
            ImageComponent()
    }
}

@Preview(showSystemUi = true)
@Composable
fun VerticalScreenPreview()
{
    VerticalScreen()
}