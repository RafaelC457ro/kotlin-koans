package iii_conventions

import util.TODO

class Invokable(private var invokations: Int = 0) {
    operator fun invoke(): Invokable {
        invokations++
        return this
    }
    fun getNumberOfInvocations() = invokations
}

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Change the class 'Invokable' to count the number of invocations:
        for 'invokable()()()()' it should be 4.
    """,
    references = { invokable: Invokable -> })

fun task31(invokable: Invokable): Int {
    //odoTask31()
    return invokable()()()().getNumberOfInvocations()
}
