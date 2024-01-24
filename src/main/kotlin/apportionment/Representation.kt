package apportionment

class Representation(
    private val representationMap: MutableMap<State, Int>
) {
    constructor() : this(mutableMapOf())

    val size: Int
        get() = representationMap.size

    val states: Set<State>
        get() = representationMap.keys

    val totalRepresentatives: Int
        get() = representationMap.values.sum()

    fun setRepresentatives(state: State, count: Int) {
        representationMap[state] = count
    }

    fun getRepresentatives(state: State): Int {
        return representationMap.getOrDefault(state, 0)
    }

    fun addRepresentatives(state: State, count: Int) {
        representationMap[state] = count + getRepresentatives(state)
    }

    override fun toString(): String {
        return representationMap.keys.sortedBy { state -> state.name.uppercase() }
            .joinToString("\n") { state ->  "${state.name} - ${getRepresentatives(state)}"}
    }
}