// Generated by Karakum - do not modify it manually!

package node.net

sealed external interface SocketReadyState {
    companion object {
        @seskar.js.JsValue("opening")
        val opening: SocketReadyState

        @seskar.js.JsValue("open")
        val open: SocketReadyState

        @seskar.js.JsValue("readOnly")
        val readOnly: SocketReadyState

        @seskar.js.JsValue("writeOnly")
        val writeOnly: SocketReadyState

        @seskar.js.JsValue("closed")
        val closed: SocketReadyState
    }
}
