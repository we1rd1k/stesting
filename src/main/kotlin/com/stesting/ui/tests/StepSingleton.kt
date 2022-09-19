package com.stesting.ui.tests

import lombok.SneakyThrows


class StepSingleton private constructor() {
    @SuppressWarnings("rawtypes")
    private val mapHolder: MutableMap<Class<*>, Any> = HashMap()

    companion object {
        private val instance = StepSingleton()
        @SneakyThrows
        @SuppressWarnings("unchecked")
        fun <T : Any> getInstance(classOf: Class<T>): T? {
            synchronized(instance) {
                if (!instance.mapHolder.containsKey(classOf)) {
                    val `object` = classOf.getDeclaredConstructor().newInstance()
                    instance.mapHolder[classOf] = `object`
                }
                return instance.mapHolder[classOf] as T?
            }
        }
    }
}