// Generated by Karakum - do not modify it manually!

package node.v8

sealed external interface HeapSpaceStatistics {
    var spaceName: String
    var spaceSize: Double
    var spaceUsedSize: Double
    var spaceAvailableSize: Double
    var physicalSpaceSize: Double
}
