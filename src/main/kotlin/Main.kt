import com.github.salomonbrys.kotson.jsonObject
import com.github.salomonbrys.kotson.string
import com.google.gson.JsonObject

fun main(args : JsonObject): JsonObject {
    val name = args["name"].string

    return jsonObject(
            "message" to "Hello $name"
    )
}