// Generated by Karakum - do not modify it manually!

@file:JsModule("node:v8")

package node.v8

/**
 * A subclass of `Serializer` that serializes `TypedArray`(in particular `Buffer`) and `DataView` objects as host objects, and only
 * stores the part of their underlying `ArrayBuffer`s that they are referring to.
 * @since v8.0.0
 */
external class DefaultSerializer : Serializer
