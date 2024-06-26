// Automatically generated - do not modify!

package typescript

/**
 * A set of edits to make in response to a refactor action, plus an optional
 * location where renaming should be invoked from
 */
sealed external interface RefactorEditInfo {
    var edits: js.array.ReadonlyArray<FileTextChanges>
    var renameFilename: String?
    var renameLocation: Double?
    var commands: js.array.ReadonlyArray<CodeActionCommand>?
    var notApplicableReason: String?
}
