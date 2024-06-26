// Generated by Karakum - do not modify it manually!

package node.module

/**
 * The `load` hook provides a way to define a custom method of determining how a URL should be interpreted, retrieved, and parsed.
 * It is also in charge of validating the import assertion.
 *
 * @param url The URL/path of the module to be loaded
 * @param context Metadata about the module
 * @param nextLoad The subsequent `load` hook in the chain, or the Node.js default `load` hook after the last user-supplied `load` hook
 */
typealias LoadHook = (url: String, context: LoadHookContext, nextLoad: (url: String, context: LoadHookContext? /* use undefined for default */) -> js.promise.PromiseResult<LoadFnOutput>) -> js.promise.PromiseResult<LoadFnOutput>
