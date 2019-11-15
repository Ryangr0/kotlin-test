fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter { it [0] == 'p' }
    val filtered = decorations.asSequence().filter { it[0] == 'a' }

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("eager: $eager")
    println("filtered: ${filtered.toList()}")

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${ lazyMap2.toList() }")
}