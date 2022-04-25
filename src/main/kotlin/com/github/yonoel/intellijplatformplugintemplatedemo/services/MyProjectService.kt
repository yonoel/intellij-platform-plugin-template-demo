package com.github.yonoel.intellijplatformplugintemplatedemo.services

import com.intellij.openapi.project.Project
import com.github.yonoel.intellijplatformplugintemplatedemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
