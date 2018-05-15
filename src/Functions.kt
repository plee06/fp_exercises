package orig

/**
 * Exclusively pattern matching or recursion
 *
 *
 * */

/**
 *
 * tail:
 *  takes a list and returns all but the first element. This isn’t a recursive function, but you still need to
 *  use pattern matching to catch when the input is the empty list. Calling tail on an empty list throws an
 *  IllegalArgumentException.
 *  Example: tail(listOf(1,2,3)) = listOf(2,3)
 *
 * Utilizes Pattern matching with the when statement.
 * On emptyList, return an emptyList
 * otherwise, we drop the first element and returns the rest of the list 
 * */
fun <T> tail(l: List<T>): List<T> = when (l) {
    emptyList<T>() -> emptyList()
    else -> l.drop(1)
}

fun <T> setHead(l: List<T>, item: T): List<T> = TODO()

fun <T> drop(l: List<T>, n: Int): List<T> = TODO()

fun <T> init(l: List<T>): List<T> = TODO()

fun <T> foldLeft(l: List<T>, initial : T, f: (T, T) -> T): T = TODO()

fun <T> sum(l: List<T>) : T = TODO()

fun <T> product(l: List<T>) : T = TODO()

fun <T> length(l: List<T>) : Int = TODO()

fun <T> reverse(l: List<T>): List<T> = TODO()

fun <T> flatten(l: List<List<T>>): List<T> = TODO()

fun <T> map(l: List<T>, f: (T) -> T): List<T> = TODO()

fun <T> filter(l: List<T>, f: (T) -> Boolean): List<T> = TODO()

fun <T> flatMap(l: List<T>, f:(T) -> List<T>): List<T> = TODO()

fun <T> maxAverage(l: List<Triple<T, T, T>>): T = TODO()

fun <T> variance(l: List<T>): T = TODO()