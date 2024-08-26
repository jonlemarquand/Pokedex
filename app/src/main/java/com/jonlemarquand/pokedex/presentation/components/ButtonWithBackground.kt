package com.jonlemarquand.pokedex.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jonlemarquand.pokedex.R
import com.jonlemarquand.pokedex.presentation.ui.theme.Green
import com.jonlemarquand.pokedex.presentation.ui.theme.GreenFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.PokedexTheme
import com.jonlemarquand.pokedex.presentation.ui.theme.Red

@Composable
fun ButtonWithBackground(
    modifier: Modifier = Modifier,
    buttonText: String,
    buttonColor: Color,
    buttonIcon: Int,
    buttonIconColor: Color,
) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(containerColor = buttonColor),
        modifier = Modifier.height(48.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = buttonText,
                modifier = modifier
            )
            Icon(
                painter = painterResource(id = buttonIcon),
                contentDescription = "Heart icon",
                modifier = Modifier.height(102.dp),
                tint = buttonIconColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonWithBackgroundPreview() {
    PokedexTheme {
        ButtonWithBackground(
            buttonText = "Grass",
            buttonColor = Green,
            buttonIcon = R.drawable.grass,
            buttonIconColor = GreenFaded
        )
    }
}