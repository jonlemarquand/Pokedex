package com.jonlemarquand.pokedex.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jonlemarquand.pokedex.R
import com.jonlemarquand.pokedex.presentation.ui.theme.PokedexTheme
import com.jonlemarquand.pokedex.presentation.ui.theme.Red

@Composable
fun ButtonWithIcon(
    modifier: Modifier = Modifier,
    buttonText: String,
    buttonColor: Color,
    buttonIcon: Int
) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
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
                modifier = Modifier.size(28.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonWithIconPreview() {
    PokedexTheme {
        ButtonWithIcon(
            buttonText = "Locations",
            buttonColor = Red,
            buttonIcon = R.drawable.pokeball
        )
    }
}