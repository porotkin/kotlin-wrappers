@file:JsModule("@jetbrains/ring-ui/components/tabs/tabs")

package ringui

import react.ComponentClass
import react.Props
import react.PropsWithChildren
import react.PropsWithClassName

//https://github.com/JetBrains/ring-ui/blob/master/components/tabs/tabs.js
external interface TabsProps : PropsWithChildren, PropsWithClassName {
    var theme: String
    var selected: String
    var onSelect: (String) -> Unit
    var href: String
    var autoCollapse: Boolean
}

external val Tabs: ComponentClass<TabsProps>

external interface TabProps : PropsWithChildren, PropsWithClassName {
    var title: Any // PropTypes.oneOfType([PropTypes.node, PropTypes.func]).isRequired,
    var id: String
}

external val Tab: ComponentClass<TabProps>

external interface SmartTabsProps : Props {
    var initSelected: String
}

external val SmartTabs: ComponentClass<SmartTabsProps>

external interface CustomItemProps : PropsWithChildren

external val CustomItem: ComponentClass<CustomItemProps>
