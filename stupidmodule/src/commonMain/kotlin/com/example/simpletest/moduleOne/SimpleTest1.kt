package com.example.simpletest.moduleOne

data class SimpleTestClass(val simpleBoolean: Boolean, val simpleString: String)

fun makeSimple(isSimple: Boolean = false, isSimpleName: String = "Not simple") = SimpleTestClass(
    simpleBoolean = isSimple,
    simpleString = isSimpleName,
)
