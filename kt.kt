import kotlin.math.ceil

fun binPackingApproximation(items: IntArray, binCapacity: Int): Int {
    items.sortDescending()
    var numBins = 0
    var currentBinCapacity = binCapacity
    for (item in items) {
        if (item > binCapacity) {
            return -1
        }
        if (item > currentBinCapacity) {
            numBins++
            currentBinCapacity = binCapacity
        }
        currentBinCapacity -= item
    }
    return ceil(numBins.toDouble() / binCapacity).toInt()
}

//This code implements the First Fit Decreasing (FFD) algorithm for the Bin Packing problem. The FFD algorithm is an approximation algorithm that provides a solution close to the optimal one. It sorts the items in descending order, and then places each item in the first bin that has enough capacity for it. If an item cannot fit in any of the current bins, a new bin is created. The function returns the minimum number of bins required to pack all the items, rounded up to the nearest integer. The FFD algorithm is not guaranteed to find the optimal solution, but it is fast and provides a solution close to the optimal one in many cases.


