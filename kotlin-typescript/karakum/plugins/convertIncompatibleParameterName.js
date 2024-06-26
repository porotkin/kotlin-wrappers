import ts from "typescript";

const incompatibleParameterNames = {
    "LanguageServiceHost": {
        "fileExists": {
            "path": "fileName",
        },
        "getDirectories": {
            "directoryName": "path",
        },
    },

    "ParseConfigHost": {
        "fileExists": {
            "path": "fileName",
        },
        "readFile": {
            "path": "fileName",
        },
    },
}

export default function (node) {
    if (
        ts.isIdentifier(node)
        && ts.isParameter(node.parent)
        && node.parent.name === node
        && ts.isMethodDeclaration(node.parent.parent)
        && ts.isClassDeclaration(node.parent.parent.parent)

        && node.parent.parent.parent.name
        && node.parent.parent.parent.name.text in incompatibleParameterNames
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text in incompatibleParameterNames[node.parent.parent.parent.name.text]
        && node.text in incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text]
    ) {
        const method = node.parent.parent
        const renameConfig = incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text][node.text]

        let alias
        let test = () => true

        if (Array.isArray(renameConfig)) {
            [alias, test] = renameConfig
        } else {
            alias = renameConfig
        }

        if (test(method)) {
            return alias
        }
    }

    if (
        ts.isIdentifier(node)
        && ts.isParameter(node.parent)
        && node.parent.name === node
        && ts.isMethodSignature(node.parent.parent)
        && ts.isInterfaceDeclaration(node.parent.parent.parent)

        && node.parent.parent.parent.name.text in incompatibleParameterNames
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text in incompatibleParameterNames[node.parent.parent.parent.name.text]
        && node.text in incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text]
    ) {
        const method = node.parent.parent
        const renameConfig = incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text][node.text]

        let alias
        let test = () => true

        if (Array.isArray(renameConfig)) {
            [alias, test] = renameConfig
        } else {
            alias = renameConfig
        }

        if (test(method)) {
            return alias
        }
    }
    return null
}
