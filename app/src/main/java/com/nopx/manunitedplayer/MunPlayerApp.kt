package com.nopx.manunitedplayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PhotoAlbum
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.nopx.manunitedplayer.navigation.NavItem
import com.nopx.manunitedplayer.ui.theme.poppinsFamily
import com.nopx.manunitedplayer.navigation.Screen1
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MunPlayerApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.manutd),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .size(50.dp)
                            .padding(start = 16.dp)
                    )
                },
                title = {
                    Text(
                        text = "Manchester United Player",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 6.dp)
                    )
                }
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen1.Home.route,
            modifier = Modifier
                .padding(contentPadding)
        ) {
            composable(Screen1.Home.route) {
                HomeScreen(navController)
            }
            composable(Screen1.Gallery.route) {
                GalleryScreen()
            }
            composable(Screen1.About.route) {
                AboutScreen()
            }

            composable(
                Screen1.Detail.route + "/{playerId}",
                arguments = listOf(navArgument("playerId") {type = NavType.IntType})
            ) { navBackStackEntry ->
                DetailCurrentPlayer(
                    navController = navController,
                    playerId = navBackStackEntry.arguments?.getInt("playerId")
                )
            }
            composable(
                Screen1.DetailOldPlayer.route + "/{oldPlayerId}",
                arguments = listOf(navArgument("oldPlayerId") {type = NavType.IntType})
            ) { navBackStackEntry ->
                DetailOldPlayer(
                    navController = navController,
                    oldPlayerId = navBackStackEntry.arguments?.getInt("oldPlayerId")
                )
            }
        }
    }
}

@Composable
fun BottomBar(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
            .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavItem(
                title = "Home",
                icon = Icons.Default.Home,
                screen = Screen1.Home
            ),
            NavItem(
                title = "Gallery",
                icon = Icons.Default.PhotoAlbum,
                screen = Screen1.Gallery
            ),
            NavItem(
                title = "About",
                icon = Icons.Outlined.Info,
                screen = Screen1.About
            ),
        )

        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = Color(0xFFDA291C)
                    )
                },
                label = {
                    Text(text = item.title)
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MunPlayerAppPreview() {
    MunPlayerApp()
}