package com.jonlemarquand.pokedex.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.graphics.shapes.CornerRounding
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath
import com.jonlemarquand.pokedex.R
import com.jonlemarquand.pokedex.presentation.components.ButtonWithIcon
import com.jonlemarquand.pokedex.presentation.ui.theme.Blue
import com.jonlemarquand.pokedex.presentation.ui.theme.Green
import com.jonlemarquand.pokedex.presentation.ui.theme.Orange
import com.jonlemarquand.pokedex.presentation.ui.theme.PokedexTheme
import com.jonlemarquand.pokedex.presentation.ui.theme.Red
import com.jonlemarquand.pokedex.presentation.ui.theme.RedFaded

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Red)
                .padding(16.dp, 0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.pokeball),
                contentDescription = "Logo",
                tint = Color.White,
                modifier = Modifier.size(32.dp)
                    .padding(0.dp, 0.dp, 8.dp, 0.dp)
            )
            Text(
                text = "Pokedex",
                modifier = modifier,
                color = Color.White
            )
        }
        Box(
            modifier = Modifier
                .height(350.dp)
                .fillMaxWidth()
                .background(color = Red),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(
                id = R.drawable.pokeball),
                contentDescription = "Pokeball",
                tint = RedFaded,
                modifier = modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                Text(
                    text = "Find your favourite pokemon",
                    color = Color.White,
                    fontSize = 40.sp,
                    lineHeight = 40.sp
                )
                Spacer(modifier = modifier.size(24.dp))
                SearchBar(
                    placeholder = {"Search"},
                    query = "" ,
                    onQueryChange = { /*TODO*/ } ,
                    onSearch = { /*TODO*/ } ,
                    active = false ,
                    onActiveChange = { /*TODO*/ }
                ) {
                    
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color = Red)
                .drawWithCache {
                    // Cache the path for drawing the semicircle
                    val semicirclePath = androidx.compose.ui.graphics
                        .Path()
                        .apply {
                            arcTo(
                                rect = androidx.compose.ui.geometry.Rect(
                                    0f,
                                    0f,
                                    size.width,
                                    size.height * 2
                                ),
                                startAngleDegrees = 180f,
                                sweepAngleDegrees = 180f,
                                forceMoveTo = false
                            )
                            lineTo(size.width, size.height)
                            lineTo(0f, size.height)
                            close()
                        }

                    // Use the cached path for drawing
                    onDrawWithContent {
                        drawIntoCanvas { canvas ->
                            canvas.drawPath(
                                semicirclePath,
                                androidx.compose.ui.graphics
                                    .Paint()
                                    .apply {
                                        color = Color.White
                                    })
                        }
                    }
                }
        )
        Column(
            modifier = modifier.padding(24.dp, 16.dp)
        ) {
            ButtonWithIcon(
                buttonText = "Types",
                buttonColor = Green,
                buttonIcon = R.drawable.pokeball
            )
            Spacer(modifier = modifier.size(16.dp))
            ButtonWithIcon(
                buttonText = "Locations",
                buttonColor = Orange,
                buttonIcon = R.drawable.location
            )
            Spacer(modifier = modifier.size(16.dp))

            ButtonWithIcon(
                buttonText = "Moves and Abilities",
                buttonColor = Blue,
                buttonIcon = R.drawable.star
            )
            Spacer(modifier = modifier.size(16.dp))
            ButtonWithIcon(
                buttonText = "Favourites",
                buttonColor = Red,
                buttonIcon = R.drawable.heart
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PokedexTheme {
        HomeScreen()
    }
}