// Generated by Karakum - do not modify it manually!

package node.process

sealed external interface HRTime {
    @seskar.js.JsNative
    operator fun invoke(time: js.array.JsTuple2<Double, Double> = definedExternally): js.array.JsTuple2<Double, Double>
    fun bigint(): js.core.BigInt
}
