package com.example.simrs.ui.screen.distribution

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.simrs.ui.components.SimpleTextField


@Composable
fun DistributionForm(
    modifier: Modifier = Modifier
) {

    val focusManager = LocalFocusManager.current
    val keyboardNext = KeyboardOptions(
        imeAction = ImeAction.Next
    )
    val focusDown = KeyboardActions(
        onNext = {
            focusManager.moveFocus(FocusDirection.Down)
        }
    )

    Column() {
        SimpleTextField(
            title = "Nama Unit",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown
        )
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Nama Petugas",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Tanggal",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Asal Permintaan",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown
        )
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Kode Obat",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Nama Obat",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Jenis Obat",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Satuan",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Jumlah Barang",
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { focusManager.clearFocus() }
            )
        )
    }
}