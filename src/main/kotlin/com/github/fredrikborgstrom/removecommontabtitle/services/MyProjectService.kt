package com.github.fredrikborgstrom.removecommontabtitle.services

import com.intellij.openapi.project.Project
import com.github.fredrikborgstrom.removecommontabtitle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
