package com.stesting.ui.tests.utils

fun trimSearchStats(element: String): String {
    val regex = """.*(?=\()""".toRegex()
    return regex.find(element)?.value ?: throw Exception("ClipBoardButton returns null")
}
