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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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


import com.example.calvin.ui.theme.CalvinTheme
import com.google.android.filament.Box

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Greeting()
                }
            }
        }

@Preview(showBackground = true)
@Composable
fun Greeting() {
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF0E0497), Color(0xa8edea)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )

    Box(modifier = Modifier
        .fillMaxSize()
//        .border(2.dp, Color.Blue)

        .background(brush = gradientBrush))
    {
        Image(
            painter = painterResource(id = R.drawable.houselistinglogo),
            contentDescription = "logo",
//            colorFilter = ColorFilter.tint(Color.Black),

            modifier = Modifier

                .fillMaxWidth()
                .shadow(10.dp)
                .padding(1.dp)

                .fillMaxSize(0.3f),
            contentScale = ContentScale.FillBounds


        )}

        Column(
            modifier = Modifier
                .fillMaxSize()
                //           .background(Color.LightGray)

                .border(2.dp, Color.Black),
            verticalArrangement= Arrangement.Center,
            horizontalAlignment = Alignment.Start)




         {
            Text(
                text = "Welcome to Dream Dwelling",
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .paddingFromBaseline(top = 64.dp)
                    .padding(start = 10.dp)
            )


            Text(
                text = "Where Imagination Becomes Reality",
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .paddingFromBaseline(top = 10.dp)
                    .padding(start = 10.dp)
            )
            Spacer(modifier = Modifier .padding(20.dp))

             var rent = LocalContext.current
            Button(
                onClick = {rent.startActivity(Intent(rent, HomeActivity::class.java))},
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .padding(top = 8.dp, start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(
                     Color(0xFF0000A3),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Looking to Buy/Rent a house",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )


            }

            Spacer(modifier = Modifier .padding(15.dp))
             var signup = LocalContext.current
            Button(
                onClick = { signup.startActivity(Intent(signup, AboutActivity::class.java))},
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .padding(top = 8.dp, start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0xFF3CFF05),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Want to sell a House/Rent it out",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )



            }
             Spacer(modifier = Modifier .padding(top=60.dp,end=100.dp))
             Text(text = "Wanna Know more about us?", modifier = Modifier.padding(start = 120.dp))
             var about = LocalContext.current
             Button(
                 onClick = {  },modifier=Modifier.padding(start=150.dp),
                 colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)

             )

             {
                 Text(text = "About us",modifier =  Modifier.padding(start = 10.dp)

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
