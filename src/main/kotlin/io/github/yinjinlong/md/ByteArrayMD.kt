package io.github.yinjinlong.md

/**
 * 转换成小写十六进制字符串
 * @author YJL
 */
val ByteArray.hex: String
    get() = joinToString("") {
        Integer.toHexString(it.toInt())
    }

val ByteArray.md2: String
    get() = MD.md2.digest(this).hex

val ByteArray.md5: String
    get() = MD.md5.digest(this).hex

val ByteArray.sha1: String
    get() = MD.sha1.digest(this).hex

val ByteArray.sha224: String
    get() = MD.sha224.digest(this).hex

val ByteArray.sha256: String
    get() = MD.sha256.digest(this).hex

val ByteArray.sha384: String
    get() = MD.sha384.digest(this).hex

val ByteArray.sha512: String
    get() = MD.sha512.digest(this).hex

val ByteArray.sha512_224: String
    get() = MD.sha512_224.digest(this).hex

val ByteArray.sha512_256: String
    get() = MD.sha512_256.digest(this).hex

val ByteArray.sha3_224: String
    get() = MD.sha3_224.digest(this).hex

val ByteArray.sha3_256: String
    get() = MD.sha3_256.digest(this).hex

val ByteArray.sha3_384: String
    get() = MD.sha3_384.digest(this).hex

val ByteArray.sha3_512: String
    get() = MD.sha3_512.digest(this).hex
