package remix.run.router


sealed external interface FetcherStatesIdle<TData> {
    var state: String
    var formMethod: Nothing?
    var formAction: Nothing?
    var formEncType: Nothing?
    var formData: Nothing?
    var data: TData?
    var String: Boolean?
}
