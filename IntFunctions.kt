package ktop

private fun Int.countDigits(previouslyCountedDigits: Int): Int {
    val reducedValue: Int = this / 10
    return if (reducedValue > 0)
        reducedValue.countDigits(previouslyCountedDigits + 1)
    else previouslyCountedDigits
}

val Int.numDigits: Int
    get() = countDigits(1)