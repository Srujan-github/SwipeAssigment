package labs.creative.swipeassigment.domain.mappers

import com.google.gson.annotations.SerializedName
import labs.creative.swipeassigment.data.network.models.ProjectDto
import labs.creative.swipeassigment.domain.models.Project
import java.util.Locale

fun ProjectDto.toDomain(): Project {
    return Project(
        imageUrl = image,
        price = price,
        productName = productName,
        productType = productType,
        tax = formatDouble(tax)
    )
}
fun formatDouble(number: Double): String {
    return when {
        number >= 10000 -> "%.2f".format(number / 1000)
        number >= 1000 -> "%.2f".format(number / 1000)
        number >= 100 -> "%.1f".format(number / 10)
        else -> "%.1f".format(number)
    }
}
