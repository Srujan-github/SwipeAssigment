package labs.creative.swipeassigment.data.network.api

import labs.creative.swipeassigment.data.network.models.ProjectsDataDto
import retrofit2.http.GET

fun interface ProductsApiService {
    @GET("get-products")
    suspend fun getProducts(): ProjectsDataDto
}