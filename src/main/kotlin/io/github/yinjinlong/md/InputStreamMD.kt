package io.github.yinjinlong.md

import java.io.InputStream
import java.security.MessageDigest

private fun InputStream.md(md: MessageDigest): ByteArray {
    val buffer = ByteArray(MD.DefaultBufferSize)
    var len = read(buffer)
    while (len >= 0) {
        md.update(buffer, 0, len)
        len = read(buffer)
    }
    return md.digest()
}

val InputStream.md2: ByteArray
    get() = md(MD.md2)

val InputStream.md5: ByteArray
    get() = md(MD.md5)

val InputStream.sha1: ByteArray
    get() = md(MD.sha1)

val InputStream.sha224: ByteArray
    get() = md(MD.sha224)

val InputStream.sha256: ByteArray
    get() = md(MD.sha256)

val InputStream.sha384: ByteArray
    get() = md(MD.sha384)

val InputStream.sha512: ByteArray
    get() = md(MD.sha512)

val InputStream.sha512_224: ByteArray
    get() = md(MD.sha512_224)

val InputStream.sha512_256: ByteArray
    get() = md(MD.sha512_256)

val InputStream.sha3_224: ByteArray
    get() = md(MD.sha3_224)

val InputStream.sha3_256: ByteArray
    get() = md(MD.sha3_256)

val InputStream.sha3_384: ByteArray
    get() = md(MD.sha3_384)

val InputStream.sha3_512: ByteArray
    get() = md(MD.sha3_512)


val InputStream.md2Hex: String
    get() = md2.hex

val InputStream.md5Hex: String
    get() = md5.hex

val InputStream.sha1Hex: String
    get() = sha1.hex

val InputStream.sha224Hex: String
    get() = sha224.hex

val InputStream.sha256Hex: String
    get() = sha256.hex

val InputStream.sha384Hex: String
    get() = sha384.hex

val InputStream.sha512Hex: String
    get() = sha512.hex

val InputStream.sha512_224Hex: String
    get() = sha512_224.hex

val InputStream.sha512_256Hex: String
    get() = sha512_256.hex

val InputStream.sha3_224Hex: String
    get() = sha3_224.hex

val InputStream.sha3_256Hex: String
    get() = sha3_256.hex

val InputStream.sha3_384Hex: String
    get() = sha3_384.hex

val InputStream.sha3_512Hex: String
    get() = sha3_512.hex
