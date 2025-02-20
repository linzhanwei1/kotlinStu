task("openDoor", {
    doFirst { println("开冰箱门") }
})

task("putElephant", {
    doFirst { println("放入大象") }
}).dependsOn("openDoor")

task("closeDoor", {
    doFirst { println("关冰箱门") }
}).dependsOn("putElephant")