class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++;
        println("Invoked $numberOfInvocations")
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()
