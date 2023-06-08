package com.example.calvin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.motion.widget.FloatLayout
import androidx.core.view.ViewCompat
import com.example.calvin.ui.theme.CalvinTheme
import org.intellij.lang.annotations.JdkConstants.FlowLayoutAlignment
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting4()

        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting4() {

    val gradientBrush = Brush.verticalGradient(
            colors = listOf(Color(0xFFD7B4EC), Color(0xFFD5C6F0),Color(0xFFDDD2F3)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )
    var signup = LocalContext.current
            Scaffold(
                topBar = {Text(
                    text = "Dream Dwelling",
                    modifier = Modifier
                        .padding(start= 60.dp),
                    style = TextStyle(
                        fontSize = 40.sp,
                        fontFamily  = FontFamily.SansSerif),
                    fontWeight = FontWeight.Bold


                    )  },floatingActionButton = { FloatingActionButton(onClick = {signup.startActivity(
                    Intent(signup, AboutActivity::class.java)
                )}){
                    Icon(painter = painterResource(R.drawable.profile),modifier= Modifier
                        .background(Color(0xFFDDD2F3))
                        .width(80.dp)
                        .height(80.dp),
                         contentDescription = "fab icon")
                } }
            )


            {



                LazyColumn(

                    modifier = Modifier
                        .fillMaxSize()
                        .background(brush = gradientBrush)

                        .border(2.dp, Color.Black),
                    verticalArrangement= Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {

                    item {
                        Spacer(modifier = Modifier.height(40.dp))
                        Row(horizontalArrangement = Arrangement.Center) {
                            Button(onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .padding(start = 35.dp)
                                    .width(150.dp)
                                    .clip(CircleShape)

                                    .border(0.dp, Color.Transparent,)
                                ,
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)

                            ) {
                                Text(text = "For Rent",
                                    modifier = Modifier

                                    ,
                                    color = Color.Black,
                                    style = androidx.compose.ui.text.TextStyle(

                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                    )



                                )

                            }

                            Button(onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .width(150.dp)
                                    .clip(CircleShape)

                                    .border(0.dp, Color.Transparent,)
                                ,
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent
                                )

                            ) {
                                Text(text ="On Sale",
                                    modifier = Modifier

                                    ,
                                    color = Color(0xFF000000),
                                    style = androidx.compose.ui.text.TextStyle(

                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                    )



                                )

                            }
                        }
                    }






                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .fillMaxHeight()
                                .clip(RoundedCornerShape(topStart = 10.dp, ))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier .padding(end = 3.dp), verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth()
                                    ,
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")

                                
                            }
                            
                        }
                    } }
                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)
                                .height(150.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(width = 100.dp, height = 100.dp)
                                        .fillMaxHeight()
                                    // .background(Color(0xFF2196F3))
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.smarthouse),
                                        contentDescription = "Your Image Description",
                                        modifier = Modifier.fillMaxSize()
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .padding(horizontal = 16.dp)
                                        .weight(1f)
                                ) {
                                    Text(
                                        text = "Your Description",
                                        style = TextStyle(
                                            fontFamily = FontFamily.Serif,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 20.sp
                                        )
                                    )
                                    Text(text = "Additional Text")

                                    Row(
                                        modifier = Modifier.padding(top = 8.dp),
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Button(
                                            onClick = { /* Handle button click */ },
                                            modifier = Modifier.padding(end = 8.dp)
                                        ) {
                                            Text(text = "Button 1")
                                        }

                                        Button(
                                            onClick = { /* Handle button click */ },
                                            modifier = Modifier.padding(start = 8.dp)
                                        ) {
                                            Text(text = "Button 2")
                                        }
                                    }
                                }
                            }
                        }


                    }

                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }
                    item { Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
//                        .background()
                        .height(100.dp),
                        //shape = RoundedCornerShape(20.dp),// elevation = CardElevation(10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(id = R.drawable.smarthouse), contentDescription = "hello",modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                                .padding(end = 30.dp))
                            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                                Text(
                                    text = "Smart House",
                                    modifier = Modifier
                                        .height(30.dp)
                                        .fillMaxWidth(),
                                    style = TextStyle(
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                                Text(text = "Bedrooms:4")
                                Text(text = "Bathrooms:3")
                                Text(text = "Location:Nairobi,Westlands.")


                            }

                        }
                    } }



                }
            }
    }




