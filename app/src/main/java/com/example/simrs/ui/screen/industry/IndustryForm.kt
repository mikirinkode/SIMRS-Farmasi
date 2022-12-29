package com.example.simrs.ui.screen.industry

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simrs.R
import com.example.simrs.ui.components.GradientButton
import com.example.simrs.ui.components.SimpleTextField
import com.example.simrs.ui.theme.BlueGradient
import com.example.simrs.ui.theme.PrimaryGradient
import com.example.simrs.ui.theme.SIMRSTheme
import com.example.simrs.ui.theme.SecondaryGradient

@Composable
fun IndustryForm(
    modifier: Modifier = Modifier
) {

    val focusManager = LocalFocusManager.current
    val keyboardNext = KeyboardOptions(
        imeAction = ImeAction.Next
    )

    Column() {
        SimpleTextField(
            title = "Kode Industri",
            keyboardOptions = keyboardNext,
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Nama Industri",
            keyboardOptions = keyboardNext,
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            ))
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Alamat",
            keyboardOptions = keyboardNext,
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            ))
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Asal Kota",
            keyboardOptions = keyboardNext,
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            ))
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Nomor Telepon",
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { focusManager.clearFocus() }
            )
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IndustryFormPreview() {
    SIMRSTheme {
        IndustryForm()
    }
}