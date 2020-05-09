package ktop

data class S(val str: String) {
    init {
        require(str != "") { "Empty String passed to S" }
        /**
         * Explanation: A string (the general programming concept) is supposed to be a string (a thing you can string
         * things together with) of characters. If there are no characters on the string, is it really a string (the
         * programming concept) (if a tree falls in woods...)? The answer is no. You should use null instead. null,
         * an empty string, and an empty list or set of data, are all the same concept. There is no good reason to
         * represent the same thing in so many different ways, and null has the best compiler support. If you try to use
         * an empty string, this is usually a special case/value, but the compiler doesn't treat it that way, it treats
         * it just like any other String. If you use null, the compiler makes sure you do proper null checking, so it is
         * better to just use null. If a function/method can accept/return either a string or null, it should use an S?
         * type.
         */
    }

    fun dropLast(count: Int = 1): S? {
        if (str.length == count)
            return null
        require(str.length > count)
        return S(str.dropLast(count))
    }

    fun toInt(): Int = str.toInt()

    fun toUpperCase(): S = S(str.toUpperCase())
}
