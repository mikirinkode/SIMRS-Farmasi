package com.example.simrs.ui.screen.medicalprescription

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
import com.example.simrs.data.model.MedicalPrescription
import com.example.simrs.ui.components.SimpleTextField

@Composable
fun MedicalPrescriptionForm(
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
            title = "Kode Obat",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown
        )
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Nama Obat",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))
        SimpleTextField(title = "Nomor Resep",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Tanggal Resep",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown
        )
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Satuan",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Jenis Obat",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Aturan Pakai",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Jumlah",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Harga",
            keyboardOptions = keyboardNext,
            keyboardActions = focusDown)
        Spacer(modifier = Modifier.height(16.dp))

        SimpleTextField(title = "Sub Jumlah",
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { focusManager.clearFocus() }
            )
        )
    }
}