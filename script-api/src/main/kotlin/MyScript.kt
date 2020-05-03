package kotlintest

import kotlin.script.experimental.annotations.KotlinScript

@KotlinScript(fileExtension = "myscript.kts")
abstract class MyScript {
    val test: String = "abc"
}