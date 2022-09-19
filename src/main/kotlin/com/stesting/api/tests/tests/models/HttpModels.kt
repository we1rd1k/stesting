package com.stesting.api.tests.tests.models

import com.github.kittinunf.fuel.core.HeaderValues

data class HttpResponse<T>(
    val code: Int,
    val body: T,
    val cookies: String? = null,
    val headers: Map<String, HeaderValues>? = null
)