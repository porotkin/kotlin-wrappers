// Automatically generated - do not modify!

package typescript

sealed external interface DiagnosticMessage {
    var key: String
    var category: DiagnosticCategory
    var code: Double
    var message: String
    var reportsUnnecessary: (Any)?
    var reportsDeprecated: (Any)?
}
