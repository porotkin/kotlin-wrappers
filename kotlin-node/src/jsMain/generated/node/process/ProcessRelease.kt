// Generated by Karakum - do not modify it manually!


package node.process


sealed external interface ProcessRelease {
    var name: String
    var sourceUrl: String?
    var headersUrl: String?
    var libUrl: String?
    var lts: String?
}