// Generated by Karakum - do not modify it manually!


package node.events


// Any EventTarget with a Node-style `once` function

sealed external interface _NodeEventTarget {
    fun once(eventName: EventType, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


}