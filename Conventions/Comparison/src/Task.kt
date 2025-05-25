data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val diffY = year - other.year
        val diffM = month - other.month
        val diffD = dayOfMonth - other.dayOfMonth
        return if (diffY != 0) diffY
        else if (diffM != 0) diffM
        else if (diffD != 0) diffD
        else 0
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
