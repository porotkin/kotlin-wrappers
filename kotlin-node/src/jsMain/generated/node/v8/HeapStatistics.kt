// Generated by Karakum - do not modify it manually!

package node.v8

sealed external interface HeapStatistics {
    var totalHeapSize: Double
    var totalHeapSizeExecutable: Double
    var totalPhysicalSize: Double
    var totalAvailableSize: Double
    var totalGlobalHandlesSize: Double
    var usedGlobalHandlesSize: Double
    var usedHeapSize: Double
    var heapSizeLimit: Double
    var mallocedMemory: Double
    var externalMemory: Double
    var peakMallocedMemory: Double
}
