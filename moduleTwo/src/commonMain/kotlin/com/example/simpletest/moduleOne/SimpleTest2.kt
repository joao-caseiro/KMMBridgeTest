package com.example.simpletest.moduleOne

data class SimpleTest2Class(val simpleBoolean: Boolean, val simpleString: String)

fun makeSimple2(isSimple: Boolean = false, isSimpleName: String = "Not simple") = SimpleTest2Class(
    simpleBoolean = isSimple,
    simpleString = isSimpleName,
)
