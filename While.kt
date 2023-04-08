fun main () {
    /* Exercício While
    *   1 - Faça um loop while que imprima todos os números de 1 a 10:
    *   2 - Faça um loop while que imprima todos os números pares de 0 a 20:
    *   3 - Faça um loop while que imprima todos os números ímpares de 10 a 0:
    * */

    // Exercício 1
    var count:Int = 1
    while (count < 11) {
        println(count)
        count += 1
    }
    // Exercício 2
    var count2:Int = 0
    while (count2 < 21) {
        println(count2)
        count2 += 2
    }
    // Exercício 3
    var count3:Int = 9
    while (count3 > 0) {
        println(count3)
        count3 -= 2
    }

}