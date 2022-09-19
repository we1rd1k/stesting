package com.stesting.api.tests.tests.assertions


const val ANY_DIGITS = "regexp: [\\d]+"
const val EMPTY = "regexp: ^\$"
const val EMPTY_OR_NULL = "regexp: ^\$|null"
const val NOT_EMPTY = "regexp: ^(?!\\s*\$).+"
const val ANY_STRING = "regexp: .*"
const val ANY_STRING_OR_NULL = "regexp: .*|null"
const val ANY_URL = "regexp: ^http[s]?:(?!\\s*\$).+"

