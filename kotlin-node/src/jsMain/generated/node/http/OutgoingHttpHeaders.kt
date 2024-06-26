// Generated by Karakum - do not modify it manually!

package node.http

sealed external interface OutgoingHttpHeaders : node.Dict<OutgoingHttpHeader> {
    var accept: Any? /* string | string[] | undefined */

    /* "accept-charset"?: string | string[] | undefined; */
    /* "accept-encoding"?: string | string[] | undefined; */
    /* "accept-language"?: string | string[] | undefined; */
    /* "accept-ranges"?: string | undefined; */
    /* "access-control-allow-credentials"?: string | undefined; */
    /* "access-control-allow-headers"?: string | undefined; */
    /* "access-control-allow-methods"?: string | undefined; */
    /* "access-control-allow-origin"?: string | undefined; */
    /* "access-control-expose-headers"?: string | undefined; */
    /* "access-control-max-age"?: string | undefined; */
    /* "access-control-request-headers"?: string | undefined; */
    /* "access-control-request-method"?: string | undefined; */
    var age: String?
    var allow: String?
    var authorization: String?

    /* "cache-control"?: string | undefined; */
    /* "cdn-cache-control"?: string | undefined; */
    var connection: Any? /* string | string[] | undefined */

    /* "content-disposition"?: string | undefined; */
    /* "content-encoding"?: string | undefined; */
    /* "content-language"?: string | undefined; */
    /* "content-length"?: string | number | undefined; */
    /* "content-location"?: string | undefined; */
    /* "content-range"?: string | undefined; */
    /* "content-security-policy"?: string | undefined; */
    /* "content-security-policy-report-only"?: string | undefined; */
    var cookie: Any? /* string | string[] | undefined */
    var dav: Any? /* string | string[] | undefined */
    var dnt: String?
    var date: String?
    var etag: String?
    var expect: String?
    var expires: String?
    var forwarded: String?
    var from: String?
    var host: String?

    /* "if-match"?: string | undefined; */
    /* "if-modified-since"?: string | undefined; */
    /* "if-none-match"?: string | undefined; */
    /* "if-range"?: string | undefined; */
    /* "if-unmodified-since"?: string | undefined; */
    /* "last-modified"?: string | undefined; */
    var link: Any? /* string | string[] | undefined */
    var location: String?

    /* "max-forwards"?: string | undefined; */
    var origin: String?
    var prgama: Any? /* string | string[] | undefined */

    /* "proxy-authenticate"?: string | string[] | undefined; */
    /* "proxy-authorization"?: string | undefined; */
    /* "public-key-pins"?: string | undefined; */
    /* "public-key-pins-report-only"?: string | undefined; */
    var range: String?
    var referer: String?

    /* "referrer-policy"?: string | undefined; */
    var refresh: String?

    /* "retry-after"?: string | undefined; */
    /* "sec-websocket-accept"?: string | undefined; */
    /* "sec-websocket-extensions"?: string | string[] | undefined; */
    /* "sec-websocket-key"?: string | undefined; */
    /* "sec-websocket-protocol"?: string | string[] | undefined; */
    /* "sec-websocket-version"?: string | undefined; */
    var server: String?

    /* "set-cookie"?: string | string[] | undefined; */
    /* "strict-transport-security"?: string | undefined; */
    var te: String?
    var trailer: String?

    /* "transfer-encoding"?: string | undefined; */
    /* "user-agent"?: string | undefined; */
    var upgrade: String?

    /* "upgrade-insecure-requests"?: string | undefined; */
    var vary: String?
    var via: Any? /* string | string[] | undefined */
    var warning: String?
    /* "www-authenticate"?: string | string[] | undefined; */
    /* "x-content-type-options"?: string | undefined; */
    /* "x-dns-prefetch-control"?: string | undefined; */
    /* "x-frame-options"?: string | undefined; */
    /* "x-xss-protection"?: string | undefined; */
}
