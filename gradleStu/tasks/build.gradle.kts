tasks {
    "openDoor"{

    }
    "putElephont"{

    }.dependsOn("openDoor")
    "closeDoor" {

    }.dependsOn("putElephont")
}

task("printProperties", {
    project.properties.forEach {
        t, any -> println("$t : $any")
    }
})

task("defaultTasks", { println("this is a default task.") })

defaultTasks("defaultTasks")