// Generated by Karakum - do not modify it manually!

package node.net

sealed external interface IPVersion {
    companion object {
        @seskar.js.JsValue("ipv4")
        val ipv4: IPVersion

        @seskar.js.JsValue("ipv6")
        val ipv6: IPVersion
    }
}
