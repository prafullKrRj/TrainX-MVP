package com.prafullkumar.foodlog.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.prafullkumar.foodlog.domain.MealType
import org.koin.androidx.compose.getViewModel

@Composable
fun FoodLogMain(
    navController: NavController
) {
    val mainViewModel = getViewModel<FoodLogMainViewModel>()
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            CalorieDetails(viewModel = mainViewModel)
        }
        MealType.entries.forEach { mealType ->
            item {
                MealTypeSection(
                    mealType = mealType,
                    viewModel = mainViewModel,
                    navController
                )
            }
        }
    }
}

@Composable
fun MealTypeSection(
    mealType: MealType,
    viewModel: FoodLogMainViewModel,
    navController: NavController
) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {

        },
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Row {
                    Icon(
                        painter = painterResource(id = mealType.icon),
                        contentDescription = mealType.name
                    )
                    Text(
                        text = mealType.name, color = Color(0xFF3F3F3F)
                    )
                }
                Text("0 kcal", color = Color(0xFF3F3F3F))
            }
            FilledIconButton(
                onClick = {

                },
                shape = CircleShape,
                colors = IconButtonDefaults.filledIconButtonColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = mealType.name
                )
            }
        }
    }
}

@Composable
fun CalorieDetails(
    viewModel: FoodLogMainViewModel
) {
    val currentEatenCalories by viewModel.currentEatenCalories.collectAsState()
    Card(
        shape = RoundedCornerShape(15), modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    AnnotatedString(
                        text = "\uD83D\uDD25", spanStyle = SpanStyle(
                            background = Color(0xFFFFEFC8),
                        )
                    ) + AnnotatedString(
                        text = "  Calories",
                    )
                )
                Row {
                    Text(
                        text = viewModel.goalCalories, color = Color(0xFF3F3F3F)
                    )
                }
            }
            CurrentEatenCaloriesBox(currentEatenCalories)
            CurrentMacrosSection(0, 0, 0)
        }
    }
}

@Composable
private fun CurrentMacrosSection(
    carbs: Int, protein: Int, fat: Int
) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Macros", color = Color(0xFF3F3F3F)
        )
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            MacroBox("Carbs", carbs)
            MacroBox("Protein", protein)
            MacroBox("Fat", fat)
        }
    }
}

@Composable
fun MacroBox(
    macroName: String, macroValue: Int
) {
    Box(
        Modifier
            .size(104.dp)
            .clip(CircleShape)
            .border(
                width = 2.dp, color = Color(0xFFD9DFC6), shape = CircleShape
            ), contentAlignment = Alignment.Center
    ) {
        Box(
            Modifier
                .size(99.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp, color = Color(0xFFEFF3EA), shape = CircleShape
                ), contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = macroName, color = Color(0xFF3F3F3F)
                )
                Text(
                    text = AnnotatedString(
                        text = macroValue.toString(), spanStyle = SpanStyle(
                            fontWeight = FontWeight.Bold, fontSize = 32.sp
                        )
                    ) + AnnotatedString(
                        text = " g", spanStyle = SpanStyle(
                            fontWeight = FontWeight.Normal, fontSize = 16.sp
                        )
                    ), color = Color(0xFF3F3F3F), fontWeight = FontWeight.Bold, fontSize = 32.sp
                )
            }
        }
    }
}

@Composable
private fun CurrentEatenCaloriesBox(
    currentEatenCalories: Int
) {
    Box(
        Modifier
            .size(104.dp)
            .clip(CircleShape)
            .border(
                width = 2.dp, color = Color(0xFFD9DFC6), shape = CircleShape
            ), contentAlignment = Alignment.Center
    ) {
        Box(
            Modifier
                .size(99.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp, color = Color(0xFFEFF3EA), shape = CircleShape
                ), contentAlignment = Alignment.Center
        ) {
            Text(
                text = AnnotatedString(
                    text = currentEatenCalories.toString(), spanStyle = SpanStyle(
                        fontWeight = FontWeight.Bold, fontSize = 32.sp
                    )
                ) + AnnotatedString(
                    text = " kcal", spanStyle = SpanStyle(
                        fontWeight = FontWeight.Normal, fontSize = 16.sp
                    )
                ), color = Color(0xFF3F3F3F), fontWeight = FontWeight.Bold, fontSize = 32.sp
            )
        }
    }
}