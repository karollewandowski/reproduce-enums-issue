package com.github.karollewandowski.reproduceenumsissue.enums

enum class FrameworkVersion(val version: Version, val subFramework: SubFrameworkVersion) {

    FRAMEWORK_1_0(
        version = Version("1.0", "1.0 description"),
        subFramework = SubFrameworkVersion.SUB_FRAMEWORK_1_0
    ),

    FRAMEWORK_1_1(
        version = Version("1.1", "1.1 description"),
        subFramework = SubFrameworkVersion.SUB_FRAMEWORK_1_1
    );

    companion object {
        fun defaultVersion(): FrameworkVersion = FRAMEWORK_1_0
    }

}
