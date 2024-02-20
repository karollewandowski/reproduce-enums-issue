package com.github.karollewandowski.reproduceenumsissue.enums

import kotlin.math.min

class Version(val string: String, val description: String? = null) : Comparable<Version> {

    private val segments: Array<String> = string.split('.').toTypedArray()

    override fun compareTo(other: Version): Int {
        val segmentsComparisonsLimit = min(segments.size, other.segments.size) - 1
        for (i in 0..segmentsComparisonsLimit) {
            if (segments[i] != other.segments[i]) {
                return segments[i].compareTo(other.segments[i])
            }
        }
        return 0
    }

    override fun equals(other: Any?): Boolean {
        return string == (other as? Version)?.string
    }

    override fun hashCode(): Int {
        return string.hashCode()
    }

    override fun toString() = string

}
