package apportionment

import kotlin.math.sqrt

class HuntingtonHillMethod: ApportionmentMethod {
    override fun getRepresentation(states: List<State>, representatives: Int): Representation {
        if (states.isEmpty()) {
            throw IllegalArgumentException("Empty states list - cannot perform apportionment")
        }
        if (representatives < states.size) {
            throw IllegalArgumentException("Cannot apportion $representatives reps to ${states.size} states using Huntington Hill")
        }

        val representation = Representation()

        // allocate one representative to every state

        // add each remaining state one at a time to the state with the highest priority

        return representation
    }

    fun priority(state: State, currentRepresentatives: Int): Double {
        return state.population / sqrt(currentRepresentatives * (currentRepresentatives + 1.0))
    }
}