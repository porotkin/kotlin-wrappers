// Generated by Karakum - do not modify it manually!

@file:JsModule("@remix-run/router")

package remix.run.router

import web.http.ResponseInit

external class DataWithResponseInit<D> {
    constructor (data: D, init: ResponseInit = definedExternally)

    var type: String
    var data: D
    var init: ResponseInit?
}
