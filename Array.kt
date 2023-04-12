fun main () {
    /* Exercício Array
    *   1 - Escreva um programa que crie um array de 10 números inteiros aleatórios e imprima o maior número do array.
    *   2 - Escreva um programa que crie um array de 10 números inteiros digitados pelo usuário e imprima a média dos números do array.
    *   3 - Escreva um programa que crie um array de 10 strings com nomes de frutas e imprima somente as frutas que começam com a letra "a" usando loop for e if.
    * */

    // Exercício 1
    var lista = Array(10) { (0..100).random() }
    var maior:Int = lista[0]
    for (x in lista) {
        if (x > maior) {
            maior = x
        }
    }
    println(lista.contentToString())
    println("O maior é $maior")
    println(maior)
    // Exercício 2
    var arrayInteiro = intArrayOf()
    for (x in 0 .. 9) {
        print("Digite o ${x+1}º Número: ")
        var num = readln().toInt()
        arrayInteiro = arrayInteiro.plus(num)
    }
    val soma = arrayInteiro.sum()
    val media = soma/10

    print("A média dos números fonercidos é igual a $media")

    // Exercício 3
    var frutas = arrayOf("banana", "maçã", "melancia", "abacaxi", "abacate",
    "jabuticaba", "laranja", "nectarina", "manga", "uva")

    var listaFrutas = emptyArray<String>()

    for (x in frutas) {
        if (x[0] == 'a') {
            listaFrutas += x
        } else {
            continue
        }
    }

    println("Essas são as frutas que iniciam com \"a\": \n ${listaFrutas.contentToString()}")

}