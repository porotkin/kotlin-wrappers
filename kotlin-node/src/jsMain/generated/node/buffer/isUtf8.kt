@file:JsModule("node:buffer")

package node.buffer

import js.buffer.ArrayBuffer

external fun isUtf8(input: Buffer): Boolean

external fun isUtf8(input: ArrayBuffer): Boolean

external fun isUtf8(input: js.typedarrays.TypedArray<*, *>): Boolean