fun main () {
    /* Exercícios For
    *   1 - Faça um loop for que imprima todos os números de 1 a 10:
    *   2 - Faça um loop for que imprima todos os números pares de 0 a 20:
    *   3 - Faça um loop for que imprima todos os números ímpares de 10 a 0:
    * */

    // Exercício 1
    for (x in 1.. 10) {
        println(x)
    }
    // Exercício 2
    for (y in 0.. 20 step 2) {
        println(y)
    }
    // Exercício 3
    for (z in 9 downTo  0 step 2) {
        println(z)
    }

}