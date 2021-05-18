package com.github.hscoo.actiondemo.services

import com.github.hscoo.actiondemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
