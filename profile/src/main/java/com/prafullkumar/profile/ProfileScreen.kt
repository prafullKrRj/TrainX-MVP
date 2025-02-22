package com.prafullkumar.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.prafullkumar.common.domain.enums.Gender
import com.prafullkumar.common.domain.enums.Goal
import com.prafullkumar.common.domain.model.UserData
import com.tdee.profile.R
import org.koin.androidx.compose.getViewModel

@Composable
fun ProfileScreen(
    navController: NavController
) {
    val viewModel = getViewModel<ProfileViewModel>()
    ProfileScreenContent(viewModel, navController)
}

@Composable
fun ProfileScreenContent(
    viewModel: ProfileViewModel,
    navController: NavController
) {
    val userData by viewModel.userInfo.collectAsState()
    if (userData.isNullOrEmpty()) {
        Text(text = "No Data")
    } else {
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(Modifier.fillMaxSize()) {
                Text(text = "ME", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                ProfileLoginHeader(viewModel, userData!![0])
                Spacer(modifier = Modifier.height(16.dp))
                SettingsCard(navController, viewModel, userData!![0])
                Spacer(modifier = Modifier.height(16.dp))
                if (viewModel.userLoggedIn) {
                    FilledTonalButton(onClick = viewModel::logout) {
                        Text("Logout")
                    }
                }
            }
        }
    }
}

@Composable
fun SettingsCard(navController: NavController, viewModel: ProfileViewModel, userInfo: UserData) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(
            16.dp
        )
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Settings", fontWeight = FontWeight.SemiBold, fontSize = 18.sp)

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    Text("Goal")
                    Row(
                        Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(Goal.valueOf(userInfo.userGoal).value, fontWeight = FontWeight.Bold)
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                contentDescription = "Edit Goal"
                            )
                        }
                    }
                }
            }

            PersonalInfoRow(
                infoType = "Gender",
                value = Gender.valueOf(userInfo.userGender).value
            ) { }
            PersonalInfoRow(
                infoType = "Current Weight",
                value = userInfo.userWeight.toString() + " kg"
            ) { }

            PersonalInfoRow(
                infoType = "Height",
                value = userInfo.userHeight.toDouble().toString() + " cm"
            ) { }
        }
    }
}

@Composable
fun PersonalInfoRow(
    infoType: String,
    value: String,
    onClick: () -> Unit
) {
    Card(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(infoType, fontWeight = W400)
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(value)
                IconButton(onClick = onClick) {
                    Icon(
                        Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = "Change Info"
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileLoginHeader(
    viewModel: ProfileViewModel,
    userInfo: UserData
) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (viewModel.userLoggedIn) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(viewModel.user?.photoUrl)
                        .build(),
                    contentDescription = "Profile Picture",
                    alpha = 1f,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .alpha(1f)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.tertiaryContainer),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = userInfo.userName.first().uppercase(),
                        fontSize = 25.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = userInfo.userName,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                if (viewModel.userLoggedIn) {
                    Text("Last Synced")
                }
            }
            IconButton(onClick = viewModel::syncData) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.baseline_sync_24),
                    contentDescription = "Logout"
                )
            }
        }
    }
}