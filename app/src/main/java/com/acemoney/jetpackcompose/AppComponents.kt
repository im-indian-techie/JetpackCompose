package com.acemoney.jetpackcompose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Helloworld(params:String){
    TextComponent(params,50.sp, Color.Blue, FontWeight.Light, FontStyle.Italic,2)
}
@Preview(showBackground = true)
@Composable
fun HelloworldPreview(params: String="ashin")
{
    Helloworld(params = params)
}

@Composable
fun TextComponent(params:String,
                  size: TextUnit=10.sp,
                  color: Color= Color.Magenta,
                  fontWeight: FontWeight = FontWeight.Bold,
                  fontStyle: FontStyle= FontStyle.Italic,
                  maxLines:Int= Int.MAX_VALUE)
{
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .background(Color.White)
            .padding(15.dp),

        text = params,
        fontSize = size,
        color = color,
        fontWeight=fontWeight,
        fontStyle = fontStyle,
        maxLines = maxLines ?: Int.MAX_VALUE,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun SimpleButton()
{
    Button(modifier = Modifier.fillMaxWidth(), onClick = {
        Log.d("clicked","Button Clicked")
    }, shape = RoundedCornerShape(10)) {
         NormalText("Click")
    }
}
@Preview
@Composable
fun SimpleButtonPreview()
{
    SimpleButton()
}


@Composable
fun NormalText(params: String)
{
   Text(text = params)
}

@Composable
fun SimpleTextField()
{
    var text by remember {
        mutableStateOf("")
    }
    TextField(modifier = Modifier.fillMaxWidth(), value = text, onValueChange ={ newText->
        text=newText

    }, textStyle = TextStyle(fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Magenta),
        label = {NormalText("Enter name") },
        placeholder = {
        Text(text = "Enter name")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}
@Preview
@Composable
fun SimpleTextFieldPreview()
{
    SimpleTextField()
}

@Composable
fun ImageComponent()
{
    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "yuiyiuy")
}

@Preview(showSystemUi =true, showBackground = true)
@Composable
fun ImageComponentPreview()
{
    ImageComponent()
}
