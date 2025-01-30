package labs.creative.swipeassigment.domain.repository

import labs.creative.swipeassigment.data.network.api.ProductsApiService
import labs.creative.swipeassigment.data.network.models.ProjectsDataDto
import labs.creative.swipeassigment.domain.mappers.toDomain
import labs.creative.swipeassigment.domain.models.Project

class ProductsRepositoryImpl(
    private val productsApiService: ProductsApiService
) : ProductsRepository {
    override suspend fun getProducts(): List<Project> {
       return  productsApiService.getProducts().map { it.toDomain() }
    }
}