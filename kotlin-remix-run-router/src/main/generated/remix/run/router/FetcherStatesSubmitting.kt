package remix.run.router

import web.http.FormData


external interface FetcherStatesSubmitting<TData> {
    var state: String
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var formData: FormData
    var data: TData?
}
