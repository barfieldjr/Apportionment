package apportionment

import java.io.File

class CSVReader(
    private val filename: String
) {
    private val states: MutableList<State> = mutableListOf()

    fun getStates(): List<State> {
        if (states.isNotEmpty()) return states

        var lines = File(filename).readLines()

        //skip header row

        //populate states field with entries

        return states
    }
}