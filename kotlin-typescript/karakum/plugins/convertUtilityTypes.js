import ts from "typescript"

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "NonNullable"
    ) {
        return `${render(node.typeArguments[0])} & Any`
    }

    return null
}
