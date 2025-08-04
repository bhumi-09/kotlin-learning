// Real-Life Example – Generic Repository

class Repository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items
}

fun main() {
    val userRepo = Repository<String>()
    userRepo.add("Alice")
    userRepo.add("Bob")
    println(userRepo.getAll())              // Output: [Alice, Bob]

    val intRepo = Repository<Int>()
    intRepo.add(1)
    intRepo.add(2)
    println(intRepo.getAll())               // Output: [1, 2]
}
