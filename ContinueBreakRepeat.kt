fun main () {
    /* Exercícios Continue, Break, Repeat
    *   1 - Escreva um programa que imprima todos os números de 0 a 10, exceto o número 5, usando continue.
    *   2 - Escreva um programa que leia números do usuário e pare quando o número digitado for negativo usando break.
    *   3 - Escreva um programa que leia um número inteiro positivo do usuário e imprima todos os números pares de 0 até o número digitado, exceto o número 4, usando continue e break.
    * */

    // Exercício 1
    for (x in 1..10) {
        if (x==5) {
            continue
        } else {
            println(x)
        }
    }
    // Exercício 2
    while (true) {
        print("Digite um número: ")
        var num = readln().toInt()
        if (num<0) {
            break
        } else {
            continue
        }
    }
    // Exercício 3
    print("Digite um número: ")
    var num2 = readln().toInt()
    for (y in 0 .. num2 step 2) {
        println(y)
    }

}