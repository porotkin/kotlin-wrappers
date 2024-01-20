// Generated by Karakum - do not modify it manually!


package node.inspector.runtime


sealed external interface AwaitPromiseParameterType {
    /**
     * Identifier of the promise.
     */
    var promiseObjectId: RemoteObjectId

    /**
     * Whether the result is expected to be a JSON object that should be sent by value.
     */
    var returnByValue: Boolean?

    /**
     * Whether preview should be generated for the result.
     */
    var generatePreview: Boolean?
}