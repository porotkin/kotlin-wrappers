// Generated by Karakum - do not modify it manually!

package node.inspector.debugger

sealed external interface GetPossibleBreakpointsReturnType {
    /**
     * List of the possible breakpoint locations.
     */
    var locations: js.array.ReadonlyArray<BreakLocation>
}
