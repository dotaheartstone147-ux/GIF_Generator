package com.example.gif

data class GiphyResponse(
    val data: List<GifData>
)

data class GifData(
    val id: String,
    val images: GifImages
)

data class GifImages(
    val original: OriginalImage
)

data class OriginalImage(
    val url: String
)

