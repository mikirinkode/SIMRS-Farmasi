package com.example.simrs.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simrs.ui.theme.SIMRSTheme

@Composable
fun SimpleTextField(
    title: String,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    modifier: Modifier = Modifier
) {
    var value by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = title)
        Spacer(modifier = Modifier.height(8.dp))
//        BasicTextField(
//            value = value,
//            onValueChange = { newValue ->
//                value = newValue
//            },
//            decorationBox = { innerTextField ->
//
//            },
//            modifier = Modifier.border(1.dp, Color.DarkGray, shape = RoundedCornerShape(16.dp))
//        )
        OutlinedTextField(
            value = value,
            onValueChange = { newValue ->
                value = newValue
            },
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SimpleTextFieldPreview() {
    SIMRSTheme() {
//        SimpleTextField(title = "Simple Text Field")
    }
}