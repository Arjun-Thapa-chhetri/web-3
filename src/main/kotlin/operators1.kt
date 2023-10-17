fun main() {
    val add = 6 + 2
    print("The sum of the two number= ")
    println(add) // 8

    val minus = 6 - 2
    print("The minus of the two number= ")
    println(minus) // 4

    val mul = 6 * 2
    print("The multiply of 6 * 2 = ")
    println(mul) // 12

    val divide = 6 / 2
    print("The divide of 6/2 = ")
    println(divide) // 3

    val divide2 = 7 / 2 // This will give integer division
    println(divide2) // 3 (!)

    val divide3 = 8 / 2
    print("The divide of 8/2= ")
    println(divide3) // 4

    val divide4 = 7 / 2.0// Use double to get the correct division result
    println(divide4) // 3.5 (!)

    val remainder = 7 % 2 // This will print the remainder when 7 is divided by 2, which is 1
    println(remainder) // 1
}
