package com.nopx.manunitedplayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nopx.manunitedplayer.data.DataPlayer
import com.nopx.manunitedplayer.model.Gallery

@Composable
fun GalleryScreen(
    modifier: Modifier = Modifier,
    gallery: List<Gallery> = DataPlayer.manUtdGallery
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing =4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .fillMaxSize()
    ) {
        items(gallery, key = { it.id }) {
            Image(
                painter = painterResource(id = it.photo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()

            )
        }
    }
}

@Preview
@Composable
fun GalleryScreenPreview() {
    GalleryScreen(gallery = DataPlayer.manUtdGallery)
}