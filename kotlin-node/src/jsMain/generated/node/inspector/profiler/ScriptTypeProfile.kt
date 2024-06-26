// Generated by Karakum - do not modify it manually!

package node.inspector.profiler

/**
 * Type profile data collected during runtime for a JavaScript script.
 * @experimental
 */
sealed external interface ScriptTypeProfile {
    /**
     * JavaScript script id.
     */
    var scriptId: node.inspector.runtime.ScriptId

    /**
     * JavaScript script name or url.
     */
    var url: String

    /**
     * Type profile entries for parameters and return values of the functions in the script.
     */
    var entries: js.array.ReadonlyArray<TypeProfileEntry>
}
