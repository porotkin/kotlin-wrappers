// Generated by Karakum - do not modify it manually!

package node.inspector.runtime

/**
 * Call frames for assertions or error messages.
 */
sealed external interface StackTrace {
    /**
     * String label of this stack trace. For async traces this may be a name of the function that initiated the async call.
     */
    var description: String?

    /**
     * JavaScript function name.
     */
    var callFrames: js.array.ReadonlyArray<CallFrame>

    /**
     * Asynchronous JavaScript stack trace that preceded this stack, if available.
     */
    var parent: StackTrace?

    /**
     * Asynchronous JavaScript stack trace that preceded this stack, if available.
     * @experimental
     */
    var parentId: StackTraceId?
}
