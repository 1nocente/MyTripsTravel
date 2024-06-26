package br.senai.sp.jandira.games

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.EditLocation
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.games.ui.theme.GamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GamesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AnotherComposablePreview() {

    @Composable
    fun AnotherComposable() {

        Column {

            Card(
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {

                Box(modifier = Modifier.fillMaxSize()) {


                    Image(
                        modifier = Modifier
                            .fillMaxSize(),
                        painter = painterResource(id = R.drawable.paris),
                        contentDescription = "Imagem de fundo",
                        contentScale = ContentScale.Crop

                    )
                    Column {

                        Image(
                            painter = painterResource(id = R.drawable.account),
                            contentDescription = "Account",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(110.dp)
                                .padding(16.dp),
                            alignment = Alignment.TopEnd
                        )
                        Text(text = "Susanna Hoffs", fontSize = 16.sp, color = Color.White, modifier = Modifier
                            .padding(start = 270.dp)
                            .shadow(16.dp, shape = CircleShape, clip = true))


                        Column {


                            Row(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            ) {

                                Icon(
                                    imageVector = Icons.Default.EditLocation,
                                    contentDescription = "emogi",
                                    tint = Color.White
                                )

                                Text(
                                    text = "You're in Paris",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold
                                )

                            }

                            Text(text = "My Trips",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 26.sp,
                                modifier = Modifier.padding(start = 16.dp))
                        }

                    }


                }





            }

            Text(text = "Categories", fontSize = 18.sp)

            LazyRow{
                item(1){
                    Card (
                        modifier = Modifier
                            .height(90.dp)
                            .width(130.dp)
                            .padding(10.dp),
                        colors = CardDefaults.cardColors(Color.Magenta)
                    ){
                        Column {
                            Icon(imageVector = Icons.Default.Landscape, contentDescription ="Montanha",
                                tint = Color.White, modifier = Modifier
                                    .padding(start = 40.dp, top = 10.dp))
                            Text(text = "Mountain", color = Color.White, modifier = Modifier
                                .padding(start = 20.dp))
                        }



                    }
                    Card (
                        modifier = Modifier
                            .height(90.dp)
                            .width(130.dp)
                            .padding(10.dp),
                        colors = CardDefaults.cardColors(Color.Magenta)
                    ) {
                        Column {
                            Icon(imageVector = Icons.Default.Snowboarding, contentDescription ="Neve",
                                tint = Color.White, modifier = Modifier
                                    .padding(start = 40.dp, top = 10.dp))
                            Text(text = "Snow", color = Color.White, modifier = Modifier
                                .padding(start = 35.dp))
                        }

                    }
                    Card (
                        modifier = Modifier
                            .height(90.dp)
                            .width(130.dp)
                            .padding(10.dp),
                        colors = CardDefaults.cardColors(Color.Magenta)
                    ) {
                        Column {
                            Icon(imageVector = Icons.Default.BeachAccess, contentDescription ="Praia",
                                tint = Color.White, modifier = Modifier
                                    .padding(start = 40.dp, top = 10.dp))
                            Text(text = "Beach", color = Color.White, modifier = Modifier
                                .padding(start = 30.dp))
                        }

                    }







                }
            }

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(380.dp)
                    .padding(start = 10.dp),
                shape = RoundedCornerShape(32.dp),

                placeholder = {
                    Text(text = "Search Your destiny",
                        color = Color.Gray)
                },
                trailingIcon = {
                    IconButton(onClick = { }) {

                        Icon(imageVector = Icons.Default.Search,
                            contentDescription = "Botão Buscar",
                            tint = Color.Gray)

                    }
                },

            )
            Text(text = "Past Trips", modifier = Modifier
                .padding(15.dp))

            LazyColumn{
                item(1){
                    Card (
                        modifier = Modifier
                            .height(230.dp)
                            .width(390.dp)
                            .padding(10.dp)
                            .shadow(20.dp),
                        colors = CardDefaults.cardColors(Color.White)
                    ) {
                        Column {
                            Image(painterResource(id = R.drawable.london),
                                contentDescription = "London",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(125.dp))

                            Text(text = "London, 2019", color = Color.Magenta,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp))
                            Text(text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                fontSize = 12.sp, lineHeight = 10.sp, color = Color.Gray, modifier = Modifier
                                    .padding(start = 10.dp))

                            Text(text = "18 Feb - 21 Feb", fontSize = 12.sp, color = Color.Magenta, modifier = Modifier
                                .padding(start = 260.dp, top = 5.dp))
                        }


                    }

                    Card (
                        modifier = Modifier
                            .height(230.dp)
                            .width(390.dp)
                            .padding(10.dp)
                            .shadow(20.dp),
                        colors = CardDefaults.cardColors(Color.White)
                    ) {
                        Column {
                            Image(painterResource(id = R.drawable.porto),
                                contentDescription = "Porto",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(125.dp))

                            Text(text = "Porto, 2022", color = Color.Magenta,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp))
                            Text(text = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
                                fontSize = 12.sp, lineHeight = 10.sp, color = Color.Gray, modifier = Modifier
                                    .padding(start = 10.dp))

                            Text(text = "18 Feb - 21 Feb", fontSize = 12.sp, color = Color.Magenta, modifier = Modifier
                                .padding(start = 260.dp, top = 5.dp))
                        }


                    }

                }
            }

        }





    }

    GamesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AnotherComposable()
        }
    }
}


