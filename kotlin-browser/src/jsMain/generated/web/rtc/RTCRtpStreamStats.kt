// Automatically generated - do not modify!

package web.rtc

sealed external interface RTCRtpStreamStats :
    RTCStats {
    var codecId: String?
    var kind: String
    var ssrc: Number
    var transportId: String?
}