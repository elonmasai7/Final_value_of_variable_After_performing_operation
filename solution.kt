class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var X = 0

        for (operation in operations) {
            when (operation) {
                "++X", "X++" -> X++
                "--X", "X--" -> X--
            }
        }
        return X
    }
}

fun main() {
    val solution = Solution()

    val operations1 = arrayOf("--X", "X++", "X++")
    val output1 = solution.finalValueAfterOperations(operations1)
    println("Input: ${operations1.joinToString(", ")}")
    println("Output: $output1") 

    val operations2 = arrayOf("++X", "++X", "X++")
    val output2 = solution.finalValueAfterOperations(operations2)
    println("Input: ${operations2.joinToString(", ")}")
    println("Output: $output2") 

    val operations3 = arrayOf("X++", "++X", "--X", "X--")
    val output3 = solution.finalValueAfterOperations(operations3)
    println("Input: ${operations3.joinToString(", ")}")
    println("Output: $output3") 
}
