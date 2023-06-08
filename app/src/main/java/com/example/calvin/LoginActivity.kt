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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Registration : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Greeting3()
                }
            }
        }


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting3() {
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF5988B6), Color(0xa8edea)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )
    


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradientBrush)
    )


    Column(

        modifier = Modifier
            .fillMaxSize()
            //           .background(Color.LightGray)

            .border(2.dp, Color.Black),
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Image(painter = painterResource(id = R.drawable.user),

            contentDescription ="login" ,
            modifier = Modifier
                .height(90.dp)
                .width(300.dp)
                .absolutePadding(1.dp,)
                .paddingFromBaseline(100.dp, 20.dp)
            )

        Text(text = "Login",
            modifier = Modifier
 //               .background(Color.LightGray)
//                    .padding(10.dp)
                .width(311.dp)
//                    .height(20.dp)
            ,
            style = TextStyle(
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                textDecoration = TextDecoration.None


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
            label = { Text(text = "Username") },
            onValueChange = { uname=it
            },
                    leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.profile), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "Username Icon"
                )
            }
        )

//        OutlinedTextField(value = text,
//            modifier = Modifier
//                .width(350.dp)
//                .padding(10.dp)
//
//            ,
//            label = { Text(text = "Email") },
//            onValueChange = { text=it
//            })

        var pword by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = pword,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)


            ,
            label = { Text(text = "Password") },
            onValueChange = { pword=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.padlock), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }



        )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(10.dp)
                .width(330.dp)
                .clip(CircleShape)
            ,
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)

        ) {
            Text(text = "Login",
                modifier =  Modifier

                ,
                color = Color.DarkGray,
                style = TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )



                )

        }
        var signup = LocalContext.current
//        onClick = { signup.startActivity(Intent(signup, AboutActivity::class.java)) },
        Text(

            text = "Don't have an account?" ,
        modifier = Modifier
            .padding(10.dp),




//            onClick = { signup.startActivity(Intent(signup, AboutActivity::class.java)) },


        )
        Button(
            onClick = { signup.startActivity(Intent(signup, AboutActivity::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)

            )

        {
            Text(text = "Sign up",modifier =  Modifier

                ,
                color = Color.DarkGray,
                style = TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )


            )


        }



        }




    }




