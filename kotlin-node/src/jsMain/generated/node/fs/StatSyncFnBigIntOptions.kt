// Generated by Karakum - do not modify it manually!

package node.fs


sealed external interface StatSyncFnBigIntOptions : StatSyncOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean

    @JsName("throwIfNoEntry")
    var requiredThrowIfNoEntry: Boolean
}