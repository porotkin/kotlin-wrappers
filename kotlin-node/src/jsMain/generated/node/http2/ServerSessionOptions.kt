// Generated by Karakum - do not modify it manually!

package node.http2

import node.http.IncomingMessage
import node.http.ServerResponse

sealed external interface ServerSessionOptions : SessionOptions {
    var Http1IncomingMessage: (JsClass<IncomingMessage>)?
    var Http1ServerResponse: (JsClass<ServerResponse<*>>)?
    var Http2ServerRequest: (JsClass<Http2ServerRequest>)?
    var Http2ServerResponse: (JsClass<Http2ServerResponse>)?
}
