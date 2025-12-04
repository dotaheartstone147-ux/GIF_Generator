import com.example.gif.GiphyResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GiflyApi {
    @GET("v1/gifs/search")
    suspend fun searchGifs(
        @Query("api_key") apiKey: String,
        @Query("q") query: String,
        @Query("limit") limit: Int = 1
    ): GiphyResponse
}
