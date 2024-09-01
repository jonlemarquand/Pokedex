package com.jonlemarquand.pokedex.domain.utils

import androidx.compose.ui.graphics.Color
import com.jonlemarquand.pokedex.R
import com.jonlemarquand.pokedex.presentation.ui.theme.Blue
import com.jonlemarquand.pokedex.presentation.ui.theme.BlueFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Brown
import com.jonlemarquand.pokedex.presentation.ui.theme.BrownFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Cyan
import com.jonlemarquand.pokedex.presentation.ui.theme.CyanFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Gold
import com.jonlemarquand.pokedex.presentation.ui.theme.GoldFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Green
import com.jonlemarquand.pokedex.presentation.ui.theme.GreenFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Grey
import com.jonlemarquand.pokedex.presentation.ui.theme.GreyFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Lilac
import com.jonlemarquand.pokedex.presentation.ui.theme.LilacFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Mauve
import com.jonlemarquand.pokedex.presentation.ui.theme.MauveFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Mustard
import com.jonlemarquand.pokedex.presentation.ui.theme.MustardFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Orange
import com.jonlemarquand.pokedex.presentation.ui.theme.OrangeFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Pink
import com.jonlemarquand.pokedex.presentation.ui.theme.PinkFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Purple
import com.jonlemarquand.pokedex.presentation.ui.theme.PurpleFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Red
import com.jonlemarquand.pokedex.presentation.ui.theme.RedFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Rose
import com.jonlemarquand.pokedex.presentation.ui.theme.RoseFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Sage
import com.jonlemarquand.pokedex.presentation.ui.theme.SageFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Teal
import com.jonlemarquand.pokedex.presentation.ui.theme.TealFaded
import com.jonlemarquand.pokedex.presentation.ui.theme.Yellow
import com.jonlemarquand.pokedex.presentation.ui.theme.YellowFaded

data class Type(
    val name: String,
    val color: Color,
    val fadedColor: Color,
    val icon: Int
)

val typesList = listOf(
    Type(
        name = "Normal",
        color = Grey,
        fadedColor = GreyFaded,
        icon = R.drawable.normal,
    ),
    Type(
        name = "Fire",
        color = Orange,
        fadedColor = OrangeFaded,
        icon = R.drawable.fire,
    ),
    Type(
        name = "Fighting",
        color = Red,
        fadedColor = RedFaded,
        icon = R.drawable.fighting,
    ),
    Type(
        name = "Water",
        color = Blue,
        fadedColor = BlueFaded,
        icon = R.drawable.water,
    ),
    Type(
        name = "Flying",
        color = Lilac,
        fadedColor = LilacFaded,
        icon = R.drawable.flying,
    ),
    Type(
        name = "Grass",
        color = Green,
        fadedColor = GreenFaded,
        icon = R.drawable.grass,
    ),
    Type(
        name = "Poison",
        color = Purple,
        fadedColor = PurpleFaded,
        icon = R.drawable.poison,
    ),
    Type(
        name = "Electric",
        color = Yellow,
        fadedColor = YellowFaded,
        icon = R.drawable.electric,
    ),
    Type(
        name = "Ground",
        color = Mustard,
        fadedColor = MustardFaded,
        icon = R.drawable.ground,
    ),
    Type(
        name = "Psychic",
        color = Pink,
        fadedColor = PinkFaded,
        icon = R.drawable.psychic,
    ),
    Type(
        name = "Rock",
        color = Gold,
        fadedColor = GoldFaded,
        icon = R.drawable.rock,
    ),
    Type(
        name = "Ice",
        color = Cyan,
        fadedColor = CyanFaded,
        icon = R.drawable.ice,
    ),
    Type(
        name = "Bug",
        color = Sage,
        fadedColor = SageFaded,
        icon = R.drawable.bug,
    ),
    Type(
        name = "Dragon",
        color = Grey,
        fadedColor = GreyFaded,
        icon = R.drawable.grass,
    ),
    Type(
        name = "Ghost",
        color = Mauve,
        fadedColor = MauveFaded,
        icon = R.drawable.ghost,
    ),
    Type(
        name = "Dark",
        color = Brown,
        fadedColor = BrownFaded,
        icon = R.drawable.steel,
    ),
    Type(
        name = "Steel",
        color = Teal,
        fadedColor = TealFaded,
        icon = R.drawable.steel,
    ),
    Type(
        name = "Fairy",
        color = Rose,
        fadedColor = RoseFaded,
        icon = R.drawable.fairy,
    )
)