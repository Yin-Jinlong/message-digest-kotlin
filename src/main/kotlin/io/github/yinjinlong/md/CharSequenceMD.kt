package io.github.yinjinlong.md


val CharSequence.md2: String
    get() = toString().toByteArray().md2

val CharSequence.md5: String
    get() = toString().toByteArray().md5

val CharSequence.sha1: String
    get() = toString().toByteArray().sha1

val CharSequence.sha224: String
    get() = toString().toByteArray().sha224

val CharSequence.sha256: String
    get() = toString().toByteArray().sha256

val CharSequence.sha384: String
    get() = toString().toByteArray().sha384

val CharSequence.sha512: String
    get() = toString().toByteArray().sha512

val CharSequence.sha512_224: String
    get() = toString().toByteArray().sha512_224

val CharSequence.sha512_256: String
    get() = toString().toByteArray().sha512_256

val CharSequence.sha3_224: String
    get() = toString().toByteArray().sha3_224

val CharSequence.sha3_256: String
    get() = toString().toByteArray().sha3_256

val CharSequence.sha3_384: String
    get() = toString().toByteArray().sha3_384

val CharSequence.sha3_512: String
    get() = toString().toByteArray().sha3_512
