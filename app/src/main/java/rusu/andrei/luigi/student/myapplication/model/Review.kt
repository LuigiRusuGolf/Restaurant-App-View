package rusu.andrei.luigi.student.myapplication.model

import java.io.File

public class Review(
    var reviewerName: String,
    val restaurantRef: String,
    val restaurantName: String,
    var description: String,
    var rating: String,
    var photo: File?,
    var latitude: Double?,
    var longitude: Double?,
    var location: String?,
    ) {
}