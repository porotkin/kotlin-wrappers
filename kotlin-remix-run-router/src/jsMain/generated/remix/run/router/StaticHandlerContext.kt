// Generated by Karakum - do not modify it manually!

package remix.run.router

import web.http.Headers

/**
 * State returned from a server-side query() call
 */
sealed external interface StaticHandlerContext {
    var basename: String?
    var location: Location<Any?>
    var matches: js.array.ReadonlyArray<AgnosticDataRouteMatch>
    var loaderData: RouteData
    var actionData: RouteData?
    var errors: RouteData?
    var statusCode: Double
    var loaderHeaders: js.objects.ReadonlyRecord<String, Headers>
    var actionHeaders: js.objects.ReadonlyRecord<String, Headers>
    var activeDeferreds: js.objects.ReadonlyRecord<String, DeferredData>?
    var _deepestRenderedBoundaryId: String?
}
