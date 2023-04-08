fun main () {
    /* Exercícios Range
    *   1 - Crie um range de números de 1 a 10 e imprima cada número:
    *   2 - Crie um range de letras de 'a' a 'z' e imprima cada letra:
    *   3 - Crie um range de números de 1 a 100 e imprima apenas os números pares:
    * */

    // Exercício 1
    var range = 1..10
    for (x in range) {
        println(x)
    }
    // Exercício 2
    for (y in 'a'..'z') {
        println(y)
    }
    // Exercício 3
    for (z in 2 .. 98 step 2) {
        println(z)
    }
}