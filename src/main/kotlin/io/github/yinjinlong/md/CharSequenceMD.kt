package io.github.yinjinlong.md


val CharSequence.md2: ByteArray
    get() = toString().toByteArray().md2

val CharSequence.md5: ByteArray
    get() = toString().toByteArray().md5

val CharSequence.sha1: ByteArray
    get() = toString().toByteArray().sha1

val CharSequence.sha224: ByteArray
    get() = toString().toByteArray().sha224

val CharSequence.sha256: ByteArray
    get() = toString().toByteArray().sha256

val CharSequence.sha384: ByteArray
    get() = toString().toByteArray().sha384

val CharSequence.sha512: ByteArray
    get() = toString().toByteArray().sha512

val CharSequence.sha512_224: ByteArray
    get() = toString().toByteArray().sha512_224

val CharSequence.sha512_256: ByteArray
    get() = toString().toByteArray().sha512_256

val CharSequence.sha3_224: ByteArray
    get() = toString().toByteArray().sha3_224

val CharSequence.sha3_256: ByteArray
    get() = toString().toByteArray().sha3_256

val CharSequence.sha3_384: ByteArray
    get() = toString().toByteArray().sha3_384

val CharSequence.sha3_512: ByteArray
    get() = toString().toByteArray().sha3_512


val CharSequence.md2Hex: String
    get() = md2.hex

val CharSequence.md5Hex: String
    get() = md5.hex

val CharSequence.sha1Hex: String
    get() = sha1.hex

val CharSequence.sha224Hex: String
    get() = sha224.hex

val CharSequence.sha256Hex: String
    get() = sha256.hex

val CharSequence.sha384Hex: String
    get() = sha384.hex

val CharSequence.sha512Hex: String
    get() = sha512.hex

val CharSequence.sha512_224Hex: String
    get() = sha512_224.hex

val CharSequence.sha512_256Hex: String
    get() = sha512_256.hex

val CharSequence.sha3_224Hex: String
    get() = sha3_224.hex

val CharSequence.sha3_256Hex: String
    get() = sha3_256.hex

val CharSequence.sha3_384Hex: String
    get() =sha3_384.hex

val CharSequence.sha3_512Hex: String
    get() = sha3_512.hex
