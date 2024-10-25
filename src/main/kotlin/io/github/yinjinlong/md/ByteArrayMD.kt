package io.github.yinjinlong.md

private val CHARS = "0123456789abcdef".toCharArray()

/**
 * 转换成小写十六进制字符串
 * @author YJL
 */
val ByteArray.hex: String
    get() = joinToString("") { b ->
        val v = b.toInt() and 0xff
        "${CHARS[v.ushr(4)]}${CHARS[v and 0xf]}"
    }

val ByteArray.md2: ByteArray
    get() = MD.md2.digest(this)

val ByteArray.md5: ByteArray
    get() = MD.md5.digest(this)

val ByteArray.sha1: ByteArray
    get() = MD.sha1.digest(this)

val ByteArray.sha224: ByteArray
    get() = MD.sha224.digest(this)

val ByteArray.sha256: ByteArray
    get() = MD.sha256.digest(this)

val ByteArray.sha384: ByteArray
    get() = MD.sha384.digest(this)

val ByteArray.sha512: ByteArray
    get() = MD.sha512.digest(this)

val ByteArray.sha512_224: ByteArray
    get() = MD.sha512_224.digest(this)

val ByteArray.sha512_256: ByteArray
    get() = MD.sha512_256.digest(this)

val ByteArray.sha3_224: ByteArray
    get() = MD.sha3_224.digest(this)

val ByteArray.sha3_256: ByteArray
    get() = MD.sha3_256.digest(this)

val ByteArray.sha3_384: ByteArray
    get() = MD.sha3_384.digest(this)

val ByteArray.sha3_512: ByteArray
    get() = MD.sha3_512.digest(this)


val ByteArray.md2Hex: String
    get() = md2.hex

val ByteArray.md5Hex: String
    get() = md5.hex

val ByteArray.sha1Hex: String
    get() = sha1.hex

val ByteArray.sha224Hex: String
    get() = this.sha224.hex

val ByteArray.sha256Hex: String
    get() = sha256.hex

val ByteArray.sha384Hex: String
    get() = sha384.hex

val ByteArray.sha512Hex: String
    get() = sha512.hex

val ByteArray.sha512_224Hex: String
    get() = sha512_224.hex

val ByteArray.sha512_256Hex: String
    get() = sha512_256.hex

val ByteArray.sha3_224Hex: String
    get() = sha3_224.hex

val ByteArray.sha3_256Hex: String
    get() = sha3_256.hex

val ByteArray.sha3_384Hex: String
    get() = sha3_384.hex

val ByteArray.sha3_512Hex: String
    get() = sha3_512.hex
