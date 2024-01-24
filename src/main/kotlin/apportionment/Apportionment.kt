package apportionment

const val DEFAULT_REPRESENTATIVES_COUNT = 435

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        throw IllegalArgumentException("Command line arguments required:\n<filename.txt> [number of reps]")
    }
    val filename: String = args[0]
    var representatives: Int = 435
    if (args.size > 1) {
        representatives = args[1].toInt()
    }

    val csvReader = CSVReader(filename)
    val states = csvReader.getStates()
    val method: ApportionmentMethod = HuntingtonHillMethod()
    val representation = method.getRepresentation(states, representatives)
    println(representation)
}