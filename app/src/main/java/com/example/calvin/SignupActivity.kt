package com.example.calvin

import android.content.Intent
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Greeting2()

                }
            }
        }

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting2() {
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF5988B6), Color(0xa8edea)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradientBrush)
    ) {
        ScrollableColumn(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) }

//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(brush = gradientBrush)
//
//    )


    Column(

        modifier = Modifier
            .fillMaxSize()
 //           .background(Color.LightGray)

            .border(2.dp, Color.Black),
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(id = R.drawable.user),

            contentDescription ="Sign up" ,
            modifier = Modifier
                .height(90.dp)
                .width(300.dp).absolutePadding(1.dp,)
                .paddingFromBaseline(100.dp,20.dp)
        )
        Text(text = "Sign up",
                modifier = Modifier
//                    .background(Color.LightGray)
//                    .padding(10.dp)
                    .width(311.dp)
//                    .height(20.dp)
                    ,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,


            ),
            textAlign = TextAlign.Center,
            )

        var uname by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = uname,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)

                ,
            label = {Text(text = "Username")},
            onValueChange = { uname=it
        },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.profile), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }

        )
        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }


        OutlinedTextField(value = email,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)
            ,
            label = {Text(text = "Email")},
            onValueChange = { email=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.mail), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }

        )
        var pnumber by remember {
            mutableStateOf(TextFieldValue(""))
        }


        OutlinedTextField(value = pnumber,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)
            ,
            label = {Text(text = "Phone number")},
            onValueChange = { pnumber=it
            }
            ,
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.smartphone), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            })


        var pword by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = pword,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)


            ,
            label = {Text(text = "Password")},
            onValueChange = { pword=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.padlock), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }

        )
        var cpword by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = cpword,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)


            ,
            label = {Text(text = "Confirm Password")},
            onValueChange = { cpword=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.key), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }
        )

        Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(10.dp)
                    .width(330.dp)
                    .clip(CircleShape)

                    .border(0.dp, Color.Transparent,)
                    ,
                shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)

        ) {
            Text(text = "Sign up!",
                modifier = Modifier

                ,
                color = Color.DarkGray,
                style = androidx.compose.ui.text.TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )



            )
            
        }

        Text(

            text = "Already have an account?")


        var login = LocalContext.current
        Button(
            onClick = { login.startActivity(Intent(login,Registration::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)

        )

        {
            Text(text = "Login",modifier =  Modifier

                ,
                color = Color.DarkGray,
                style = androidx.compose.ui.text.TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )


            )


        }






    }


}

@Composable
fun ScrollableColumn(modifier: Modifier, contentAlignment: Alignment) {

}

//@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
//@Composable
//fun registration()
//
//{
//
//
//}

