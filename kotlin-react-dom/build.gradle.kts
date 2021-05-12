plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react"))

    api(kotlinxHtml("js"))

    api(npmv("react-dom"))
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(configurations.archives.get())
}