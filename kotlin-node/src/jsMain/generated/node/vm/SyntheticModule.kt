// Generated by Karakum - do not modify it manually!

@file:JsModule("node:vm")

package node.vm


external class SyntheticModule : Module {
    /**
     * Creates a new `SyntheticModule` instance.
     * @param exportNames Array of names that will be exported from the module.
     * @param evaluateCallback Called when the module is evaluated.
     */
    constructor (
        exportNames: js.array.ReadonlyArray<String>,
        evaluateCallback: (`this`: SyntheticModule) -> Unit,
        options: SyntheticModuleOptions = definedExternally,
    )

    /**
     * This method is used after the module is linked to set the values of exports.
     * If it is called before the module is linked, an `ERR_VM_MODULE_STATUS` error will be thrown.
     * @param name
     * @param value
     */
    fun setExport(name: String, value: Any?): Unit
}
