package js.collections

import kotlinx.js.HasSymbol
import kotlinx.js.JsIterable
import kotlinx.js.JsTuple2

external interface ReadonlySet<T> :
    HasSymbol.iterator<() -> JsIterable.Iterator<T>> {

    val size: Int

    fun entries(): JsIterable.Iterator<JsTuple2<T, T>>
    fun forEach(action: (value: T) -> Unit)
    fun has(value: T): Boolean
    fun keys(): JsIterable.Iterator<T>
    fun values(): JsIterable.Iterator<T>
}