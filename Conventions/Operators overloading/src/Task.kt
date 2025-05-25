import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
// Supported intervals that might be added to dates:
data class MultipleTimeIntervals(val timeInterval: TimeInterval, val amount: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(interval: TimeInterval): MyDate {
    return addTimeIntervals(interval, 1)
}

operator fun TimeInterval.times(amount: Int): MultipleTimeIntervals {
    return MultipleTimeIntervals(this, amount)
}

operator fun MyDate.plus(multipleTimeIntervals: MultipleTimeIntervals): MyDate {
    return addTimeIntervals(multipleTimeIntervals.timeInterval, multipleTimeIntervals.amount)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
