package io.github.yinjinlong.md

import java.io.File


val File.md2: String
    get() = readBytes().md2

val File.md5: String
    get() = readBytes().md5

val File.sha1: String
    get() = readBytes().sha1

val File.sha224: String
    get() = readBytes().sha224

val File.sha256: String
    get() = readBytes().sha256

val File.sha384: String
    get() = readBytes().sha384

val File.sha512: String
    get() = readBytes().sha512

val File.sha512_224: String
    get() = readBytes().sha512_224

val File.sha512_256: String
    get() = readBytes().sha512_256

val File.sha3_224: String
    get() = readBytes().sha3_224

val File.sha3_256: String
    get() = readBytes().sha3_256

val File.sha3_384: String
    get() = readBytes().sha3_384

val File.sha3_512: String
    get() = readBytes().sha3_512
