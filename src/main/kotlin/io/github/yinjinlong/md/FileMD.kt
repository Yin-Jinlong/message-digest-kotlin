package io.github.yinjinlong.md

import java.io.File


val File.md2: ByteArray
    get() = inputStream().md2

val File.md5: ByteArray
    get() = inputStream().md5

val File.sha1: ByteArray
    get() = inputStream().sha1

val File.sha224: ByteArray
    get() = inputStream().sha224

val File.sha256: ByteArray
    get() = inputStream().sha256

val File.sha384: ByteArray
    get() = inputStream().sha384

val File.sha512: ByteArray
    get() = inputStream().sha512

val File.sha512_224: ByteArray
    get() = inputStream().sha512_224

val File.sha512_256: ByteArray
    get() = inputStream().sha512_256

val File.sha3_224: ByteArray
    get() = inputStream().sha3_224

val File.sha3_256: ByteArray
    get() = inputStream().sha3_256

val File.sha3_384: ByteArray
    get() = inputStream().sha3_384

val File.sha3_512: ByteArray
    get() = inputStream().sha3_512


val File.md2Hex: String
    get() = md2.hex

val File.md5Hex: String
    get() = md5.hex

val File.sha1Hex: String
    get() = sha1.hex

val File.sha224Hex: String
    get() =sha224.hex

val File.sha256Hex: String
    get() = sha256.hex

val File.sha384Hex: String
    get() = sha384.hex

val File.sha512Hex: String
    get() = sha512.hex

val File.sha512_224Hex: String
    get() = sha512_224.hex

val File.sha512_256Hex: String
    get() = sha512_256.hex

val File.sha3_224Hex: String
    get() = sha3_224.hex

val File.sha3_256Hex: String
    get() = sha3_256.hex

val File.sha3_384Hex: String
    get() = sha3_384.hex

val File.sha3_512Hex: String
    get() = sha3_512.hex
