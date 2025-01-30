package labs.creative.swipeassigment.data.network.models


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep


@Keep
data class ProjectDto(
    @SerializedName("image")
    val image: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("product_name")
    val productName: String,
    @SerializedName("product_type")
    val productType: String,
    @SerializedName("tax")
    val tax: Double
)