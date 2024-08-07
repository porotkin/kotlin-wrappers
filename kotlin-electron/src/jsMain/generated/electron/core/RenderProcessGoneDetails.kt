// Generated by Karakum - do not modify it manually!

package electron.core

external interface RenderProcessGoneDetails {
// Docs: https://electronjs.org/docs/api/structures/render-process-gone-details
    /**
     * The exit code of the process, unless `reason` is `launch-failed`, in which case
     * `exitCode` will be a platform-specific launch failure error code.
     */
    var exitCode: Double

    /**
     * The reason the render process is gone.  Possible values:
     */
    var reason: (RenderProcessGoneDetailsReason)
}
