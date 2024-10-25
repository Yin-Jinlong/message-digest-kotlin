package io.github.yinjinlong.md

import java.nio.ByteBuffer
import java.nio.channels.FileChannel
import java.security.MessageDigest

private fun FileChannel.md(md: MessageDigest): ByteArray {
    val buffer = ByteBuffer.allocate(MD.DefaultBufferSize)
    var len = read(buffer)
    while (len >= 0) {
        buffer.flip()
        md.update(buffer)
        buffer.clear()
        len = read(buffer)
    }
    return md.digest()
}

val FileChannel.md2: ByteArray
    get() = md(MD.md2)

val FileChannel.md5: ByteArray
    get() = md(MD.md5)

val FileChannel.sha1: ByteArray
    get() = md(MD.sha1)

val FileChannel.sha224: ByteArray
    get() = md(MD.sha224)

val FileChannel.sha256: ByteArray
    get() = md(MD.sha256)

val FileChannel.sha384: ByteArray
    get() = md(MD.sha384)

val FileChannel.sha512: ByteArray
    get() = md(MD.sha512)

val FileChannel.sha512_224: ByteArray
    get() = md(MD.sha512_224)

val FileChannel.sha512_256: ByteArray
    get() = md(MD.sha512_256)

val FileChannel.sha3_224: ByteArray
    get() = md(MD.sha3_224)

val FileChannel.sha3_256: ByteArray
    get() = md(MD.sha3_256)

val FileChannel.sha3_384: ByteArray
    get() = md(MD.sha3_384)

val FileChannel.sha3_512: ByteArray
    get() = md(MD.sha3_512)


val FileChannel.md2Hex: String
    get() = md2.hex

val FileChannel.md5Hex: String
    get() = md5.hex

val FileChannel.sha1Hex: String
    get() = sha1.hex

val FileChannel.sha224Hex: String
    get() = sha224.hex

val FileChannel.sha256Hex: String
    get() = sha256.hex

val FileChannel.sha384Hex: String
    get() = sha384.hex

val FileChannel.sha512Hex: String
    get() = sha512.hex

val FileChannel.sha512_224Hex:String
    get() = sha512_224.hex

val FileChannel.sha512_256Hex: String
    get() = sha512_256.hex

val FileChannel.sha3_224Hex: String
    get() = sha3_224.hex

val FileChannel.sha3_256Hex: String
    get() = sha3_256.hex

val FileChannel.sha3_384Hex: String
    get() = sha3_384.hex

val FileChannel.sha3_512Hex: String
    get() = sha3_512.hex
