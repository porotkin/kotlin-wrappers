// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface ClearStorageDataOptionsStorage {
    companion object {
        @seskar.js.JsValue("cookies")
        val cookies: ClearStorageDataOptionsStorage

        @seskar.js.JsValue("filesystem")
        val filesystem: ClearStorageDataOptionsStorage

        @seskar.js.JsValue("indexdb")
        val indexdb: ClearStorageDataOptionsStorage

        @seskar.js.JsValue("localstorage")
        val localstorage: ClearStorageDataOptionsStorage

        @seskar.js.JsValue("shadercache")
        val shadercache: ClearStorageDataOptionsStorage

        @seskar.js.JsValue("websql")
        val websql: ClearStorageDataOptionsStorage

        @seskar.js.JsValue("serviceworkers")
        val serviceworkers: ClearStorageDataOptionsStorage

        @seskar.js.JsValue("cachestorage")
        val cachestorage: ClearStorageDataOptionsStorage
    }
}
