import java.io.File
import java.util.*


object Props {

    val props = Properties()

    fun init(dir: File) {
        File(dir, "local.properties").inputStream().use {
            props.load(it)
        }
    }

    operator fun get(key: String): String? {
        return props[key] as String?
    }

    operator fun getValue(thisRef: Any?, property: kotlin.reflect.KProperty<*>): String? {
        return get(property.name)
    }

}