// Generated by Karakum - do not modify it manually!


package node.stream


sealed external interface DuplexOptions : ReadableOptions, WritableOptions {
    var allowHalfOpen: Boolean?
    var readableObjectMode: Boolean?
    var writableObjectMode: Boolean?
    var readableHighWaterMark: Double?
    var writableHighWaterMark: Double?
    var writableCorked: Double?
    override fun construct(/* this: Duplex, */ callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit): Unit
    override fun read(/* this: Duplex, */ size: Number): Unit
    override fun write(
        /* this: Duplex, */ chunk: Any?,
        encoding: node.buffer.BufferEncoding,
        callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    )

    override fun writev(
        /* this: Duplex, */ chunks: Array<WritableOptionsWritevChunksItem>,
        callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    ): Unit

    override fun final(/* this: Duplex, */ callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit): Unit
    override fun destroy(
        /* this: Duplex, */ error: Throwable /* JsError */?,
        callback: (error: Throwable /* JsError */?) -> Unit,
    ): Unit
}