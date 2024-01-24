package apportionment

interface ApportionmentMethod {
    fun getRepresentation(states: List<State>, representatives: Int): Representation
}