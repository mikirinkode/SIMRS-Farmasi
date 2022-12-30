package com.example.simrs.ui.screen.medicalprescription

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simrs.R
import com.example.simrs.data.model.DummyData
import com.example.simrs.ui.components.DeleteConfirmationMessage
import com.example.simrs.ui.screen.SearchBar
import com.example.simrs.ui.screen.industry.DetailInfoSection
import com.example.simrs.ui.theme.Pink
import com.example.simrs.ui.theme.SIMRSTheme
import com.example.simrs.ui.theme.SecondaryGradient


@Composable
fun ManageMedicalPrescriptionScreen(
    navigateToFormScreen: () -> Unit,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val dataList = ArrayList(DummyData.getDummyMedicalPrescription())
    var selectedIndex by remember {
        mutableStateOf(0)
    }
    var showDetail by remember {
        mutableStateOf(false)
    }
    var showMessage by remember {
        mutableStateOf(false)
    }
    var query by remember {
        mutableStateOf("")
    }


    Box(
        modifier = modifier.background(Color(0xfff5f5f5))
    ) {
        Box(
            modifier = Modifier
                .background(
                    shape = RoundedCornerShape(
                        bottomStart = 69.dp,
                        bottomEnd = 69.dp
                    ),
                    brush = SecondaryGradient
                )
                .fillMaxWidth()
                .height(300.dp)
        )
        Column(
            modifier = modifier
                .padding(24.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "Back Button",
                    tint = Color.White,
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { navigateBack() },
                )
                Spacer(modifier = Modifier.width(16.dp))
                SearchBar(query = query, onValueChange = { newValue -> query = newValue })
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Distribusi Obat", fontSize = 18.sp)
                Button(
                    onClick = navigateToFormScreen,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF49BEFF),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(text = "Input Data")
                }
            }

            if (dataList.size > 0) {
                LazyColumn(
                    contentPadding = PaddingValues(bottom = 16.dp)
                ) {
                    items(dataList) { data ->
                        MedicalPrescriptionCard(
                            patientId = "No " + data.patientId.toString() ,
                            patientName = data.patientName,
                            openDetailCard = {
                                selectedIndex = dataList.indexOf(data)
                                showDetail = true
                            })
                    }
                }
            }
        }

        if (showDetail) {
            dataList[selectedIndex].let { data ->
                MedicalPrescriptionDetailCard(
                    patientNumber = data.patientId.toString(),
                    patientName = data.patientName,
                    doctorName = data.doctorName,
                    patientDateBirth = "05-07-1994",
                    address = "Dummy Address",
                    closeDetailCard = {
                        showDetail = false
                    },
                    onEdit = {

                    },
                    onDelete = {
                        showMessage = true
                    },
                    onPrint = {

                    }
                )
            }
        }
        if (showMessage) {
            DeleteConfirmationMessage(
                onPositiveClick = {
                    dataList.removeAt(selectedIndex)
                },
                onNegativeClick = {
                    showMessage = false
                },
            )
        }
    }
}

@Composable
fun MedicalPrescriptionCard(
    patientId: String,
    patientName: String,
    openDetailCard: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
    ) {
        Card(
            backgroundColor = Color.White,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(16.dp)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = patientName, fontSize = 18.sp)
                IconButton(
                    onClick = { isExpanded = !isExpanded },
                    modifier = Modifier.padding(0.dp)
                ) {
                    Icon(
                        imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = if (isExpanded) "Show Less" else "Show More",
                        modifier = Modifier.padding(0.dp)
                    )
                }
            }
        }

        if (isExpanded) {
            Card(
                backgroundColor = Color.White,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(elevation = 4.dp, shape = RoundedCornerShape(16.dp))
                    .padding(top = 1.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column() {
                            Text(text = "Nomor Rekam Medis", color = Pink, fontSize = 15.sp)
                            Text(text = patientId, fontSize = 18.sp)
                        }
                        TextButton(onClick = openDetailCard) {
                            Text(text = "Lihat Detail")
                        }
                    }
                    Spacer(modifier = Modifier.height(30.dp))
                    Column() {
                        Text(text = "Nama Pasien", color = Pink, fontSize = 15.sp)
                        Text(text = patientName, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

@Composable
fun MedicalPrescriptionDetailCard(
    patientNumber: String,
    patientName: String,
    doctorName: String,
    patientDateBirth: String,
    address: String,
    closeDetailCard: () -> Unit,
    onEdit: () -> Unit,
    onDelete: () -> Unit,
    onPrint: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(0f to Color.Black, 1000f to Color.Black),
                alpha = 0.5f
            )
    ) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Center),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Detail Resep Obat")
                    IconButton(onClick = closeDetailCard) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close),
                            contentDescription = "Close Button",
                            tint = MaterialTheme.colors.primary,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(32.dp))
                DetailInfoSection(title = "Nomor Rekam Medis", value = patientNumber)
                DetailInfoSection(title = "Nama Pasien", value = patientName)
                DetailInfoSection(title = "Nama Dokter", value = doctorName)
                DetailInfoSection(title = "Tanggal Lahir", value = patientDateBirth)
                DetailInfoSection(title = "Alamat", value = address)
                Spacer(modifier = Modifier.height(32.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        onClick = onEdit,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF49BEFF),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "Edit Data")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = onDelete,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF4B93BB),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "Hapus")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = onPrint,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF65AD75),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "Cetak")
                    }
                }
            }
        }
    }
}