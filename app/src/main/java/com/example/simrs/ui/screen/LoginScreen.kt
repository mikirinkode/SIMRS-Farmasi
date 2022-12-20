package com.example.simrs.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simrs.R
import com.example.simrs.ui.theme.Pink
import com.example.simrs.ui.theme.Purple
import com.example.simrs.ui.theme.SIMRSTheme

@Composable
fun LoginScreen(
    moveToHome: () -> Unit,
    modifier: Modifier = Modifier
) {

    val focusManager = LocalFocusManager.current
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var passwordVisible by remember {
        mutableStateOf(false)
    }

    val image = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff

    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
            contentScale = ContentScale.Crop
        )
        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter),
            elevation = 8.dp
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(24.dp),
            ) {
                Text(
                    text = "Login",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(24.dp))
                LoginTextField(
                    title = "Username",
                    username = username,
                    onValueChange = { newValue -> username = newValue },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down)
                        }
                    )
                )
                Spacer(modifier = Modifier.height(26.dp))
                PasswordTextField(
                    password = password,
                    passwordVisible = passwordVisible,
                    image = image,
                    onValueChange = { newValue ->
                        password = newValue
                    },
                    onTrailIconClick = { passwordVisible = !passwordVisible },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = { focusManager.clearFocus() }
                    )
                )
                Spacer(modifier = Modifier.height(56.dp))
                LoginButton()
                Spacer(modifier = Modifier.height(8.dp))
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                ) {
                    Text(text = "Lupa Password?")
                }
            }
        }
    }
}

@Composable
fun LoginButton(
    modifier: Modifier = Modifier
) {
    val backgroundColor = Brush.horizontalGradient(0f to Purple, 1000f to Pink)

    Text(
        text = "MASUK",
        modifier = Modifier
            .fillMaxWidth()
            .background(brush = backgroundColor, shape = RoundedCornerShape(20.dp))
            .padding(18.dp)
            .clickable {
                //TODO
            },
        textAlign = TextAlign.Center,
        fontSize = 16.sp
    )
//    Button(
//        onClick = {
//            // TODO: ADD LATER
//        },
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(brush = backgroundColor, shape = RoundedCornerShape(20.dp))
//            .shadow(0.dp),
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color.Transparent,
//        ),
//        contentPadding = PaddingValues(0.dp),
//        elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp)
//    ) {
//        Text(text = "MASUK")
//    }
}

@Composable
fun LoginTextField(
    title: String,
    username: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = username,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.surface
            ),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            maxLines = 1,
        )
    }
}

@Composable
fun PasswordTextField(
    password: String,
    passwordVisible: Boolean,
    image: ImageVector,
    onValueChange: (String) -> Unit,
    onTrailIconClick: () -> Unit,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "Password",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = password,
            onValueChange = onValueChange,
            singleLine = true,

            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            trailingIcon = {
                IconButton(onTrailIconClick) {
                    Icon(
                        imageVector = image,
                        contentDescription = if (passwordVisible) "Hide Password" else "Show Password"
                    )
                }
            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.surface
            )
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    SIMRSTheme {
        LoginScreen({})
    }
}