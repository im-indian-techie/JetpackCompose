package com.acemoney.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalScreen()
{
  Row(modifier = Modifier.fillMaxWidth().height(400.dp).background(Color.Black),
      horizontalArrangement = Arrangement.SpaceEvenly,
      verticalAlignment = Alignment.CenterVertically
  ) {
      TextComponent(params = "Text 1")
      TextComponent(params = "Text 1")
      TextComponent(params = "Text 1")
      TextComponent(params = "Text 1")
      TextComponent(params = "Text 1")

  }
}
@Preview(showBackground = true)
@Composable
fun HorizontalScreenPreview()
{
    HorizontalScreen()
}