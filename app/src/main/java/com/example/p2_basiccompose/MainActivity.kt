package com.example.p2_basiccompose

import android.media.Image
import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p2_basiccompose.ui.theme.P2_BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2_BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicColumn(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize())
    {
        Text("Login",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Ini adalah halaman login",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.padding(20.dp))
        Image( painter = painterResource(id = R.drawable.umy),
            contentDescription = "",
            modifier = Modifier
                .size(260.dp)
        )
        Text(text = "Nama",
            fontSize = 30.sp
        )
        Text(text = "Safinatun Naja",
            fontSize = 15.sp,
            color = Color.Red
        )
        Text(text = "20220140184",
            fontSize = 40.sp
        )
        Image(
            painter = painterResource(id = R.drawable.fotosaya),
            contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .size(250.dp, 420.dp)
                .clip(RoundedCornerShape(150.dp))
                .fillMaxSize(),
            contentScale = ContentScale.Crop)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2_BasicComposeTheme {
        BasicColumn()
        }
}


