package labs.creative.swipeassigment.domain.repository

import labs.creative.swipeassigment.data.network.models.ProjectsDataDto
import labs.creative.swipeassigment.domain.models.Project

fun interface ProductsRepository {
    suspend fun getProducts(): List<Project>
}