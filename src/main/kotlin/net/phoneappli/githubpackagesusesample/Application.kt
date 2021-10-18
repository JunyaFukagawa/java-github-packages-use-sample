package net.phoneappli.githubpackagesusesample

import com.fasterxml.jackson.databind.ObjectMapper
import net.phoneappli.githubpackagessample.Sample

fun main() {
    val mapper = ObjectMapper()
    println(mapper.version())

    val sample = Sample()
    sample.printJacksonVersion()
}
