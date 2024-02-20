package com.github.karollewandowski.reproduceenumsissue.enums

import com.intellij.openapi.components.BaseState
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.Service.Level.PROJECT
import com.intellij.openapi.components.State
import com.intellij.util.xmlb.XmlSerializerUtil
import com.intellij.util.xmlb.annotations.OptionTag

@Service(PROJECT)
@State(name = "FrameworkSettings")
class FrameworkSettings : PersistentStateComponent<FrameworkSettings>, BaseState() {

    @get:OptionTag("frameworkSupportEnabled")
    var frameworkSupportEnabled: Boolean by property(true)

    @get:OptionTag("frameworkVersion")
    var frameworkVersion: FrameworkVersion by enum(FrameworkVersion.defaultVersion())

    override fun getState() = this

    override fun loadState(state: FrameworkSettings) = XmlSerializerUtil.copyBean(state, this)

}
