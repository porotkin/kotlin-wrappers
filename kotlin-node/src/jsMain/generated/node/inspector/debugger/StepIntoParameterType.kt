// Generated by Karakum - do not modify it manually!

package node.inspector.debugger

sealed external interface StepIntoParameterType {
    /**
     * Debugger will issue additional Debugger.paused notification if any async task is scheduled before next pause.
     * @experimental
     */
    var breakOnAsyncCall: Boolean?
}
