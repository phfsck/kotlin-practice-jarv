package com.kotlin.practice.jarv.kotlinpracticejarv.temp

class UserPayload(data: LinkedHashMap<String, Any>): LinkedHashMap<String, Any>() {

    private val ID = "id"
    private val USERNAME = "username"
    private val APPLICATION = "application"

    constructor(): this(LinkedHashMap())

    init {
        putAll(data)
        if(getApplication().isNullOrEmpty()) {
            put(APPLICATION, HashMap<String, Any?>())
        }
    }

    private fun getApplication(): HashMap<String, Any?> {
        return getOrDefault(APPLICATION, HashMap<String, Any>()) as HashMap<String, Any?>
    }

    fun putApplicationAttributes(attributes: HashMap<String, Any?>?) {
        getApplication().putAll(attributes!!)
    }

    fun removeApplicationAttributes() {
        remove(APPLICATION)
    }
}