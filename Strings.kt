fun main () {
    /* Exercícios Strings
    *   1 - Escreva um programa que leia uma frase do usuário e imprima quantos caracteres ela possui usando length.
    *   2 - Escreva um programa que leia uma frase do usuário e imprima a mesma frase em ordem inversa usando loop for.
    *   3 - Escreva um programa que leia uma frase do usuário e imprima apenas as vogais da frase usando loop for e if.
    * */

    // Exercício 1
    print("Escreva uma frase bonita: ")
    var frase = readln()
    var semEspaco = frase.replace(" ", "")
    print("A frase possui ${semEspaco.length} caracteres")

    // Exercício 2
    print("Escreva uma frase bonita:: ")
    var frase2 = readln()

    var fraseInvertida = ""
    if (frase2 != null) {
        for (i in frase2.length - 1 downTo 0) {
            fraseInvertida += frase2[i]
        }
    }
    println("A frase invertida é: $fraseInvertida")

    // Exercício 3
    print("Escreva uma frase bonita: ")
    var frase3 = readln()

    var vogais = arrayOf('a', 'e', 'i', 'o', 'u')

    for (caractere in frase3) {
        if (caractere in vogais) {
            print(caractere)
        } else {
            continue
        }
    }
}