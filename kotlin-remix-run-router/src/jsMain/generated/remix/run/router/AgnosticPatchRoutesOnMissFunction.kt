// Generated by Karakum - do not modify it manually!

package remix.run.router

external interface AgnosticPatchRoutesOnMissFunction<M : AgnosticRouteMatch<*> /* default is AgnosticRouteMatch<*> */> {
    @seskar.js.JsNative
    operator fun invoke(opts: AgnosticPatchRoutesOnMissFunctionOpts<M>): js.promise.PromiseResult<Unit>
}
