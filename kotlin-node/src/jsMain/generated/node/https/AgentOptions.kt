// Generated by Karakum - do not modify it manually!

package node.https

sealed external interface AgentOptions : node.http.AgentOptions, node.tls.ConnectionOptions {
    override var rejectUnauthorized: Boolean?
    var maxCachedSessions: Double?
    override var port: dynamic
}
