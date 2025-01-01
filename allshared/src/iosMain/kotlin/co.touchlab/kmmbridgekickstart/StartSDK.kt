package co.touchlab.kmmbridgekickstart

import com.example.simpletest.moduleOne.makeSimple

fun startSDK(): SDKHandle {
    return SDKHandle(
        simpleClass = makeSimple(true, sayHello())
    )
}

fun sayHello() = "Hello from Kotlin!"