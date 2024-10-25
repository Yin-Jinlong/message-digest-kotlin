package io.github.yinjinlong.md

import java.security.MessageDigest
import kotlin.reflect.KProperty

/**
 * @author YJL
 */
object MD {

    private val reg = Regex("^([A-Z]+)(\\d+)")

    private val cachedName = mutableMapOf<String, String>()

    var DefaultBufferSize = 4096

    operator fun get(algorithm: String): MessageDigest? {
        return MessageDigest.getInstance(algorithm)
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): MessageDigest {
        return MessageDigest.getInstance(cachedName[property.name] ?: run {
            // A:算法 V:算法版本 S:尺寸
            // AV-S1/S2... =>
            // v1 => AS1_S2...
            // v[2-9] => AV_S1_S2...

            val name = property.name.uppercase()
            val parts = name.split("_")

            val r1 = reg.find(parts[0]) ?: throw RuntimeException("Invalid property name: $name")

            val sList = if (parts.size > 1)
                parts.subList(1, parts.size)
            else
                arrayListOf()

            val a = r1.groupValues[1]
            val vOrS = r1.groupValues[2]
            // v1 直接跟尺寸
            if (vOrS.length > 1) {
                val l = if (sList.isEmpty()) "" else "/"
                val ss = sList.joinToString("/")
                "$a-$vOrS$l$ss"
            } else {
                val l = if (sList.isEmpty()) "" else "-"
                val ss = sList.joinToString("/")
                "$a$vOrS$l$ss"
            }.apply {
                cachedName[property.name] = this
            }
        })

    }

    val md2 by this
    val md5 by this
    val sha1 by this
    val sha224 by this
    val sha256 by this
    val sha384 by this
    val sha512 by this
    val sha512_224 by this
    val sha512_256 by this
    val sha3_224 by this
    val sha3_256 by this
    val sha3_384 by this
    val sha3_512 by this

}
