fun main () {
    /* Exercícios Do-While
    *   1 - Faça um loop do-while que imprima todos os números de 1 a 10:
    *   2 - Faça um loop do-while que peça ao usuário para digitar um número até que ele digite um número negativo:
    *   3 - Faça um loop do-while que peça ao usuário para digitar um número de 1 a 10 até que ele acerte o número sorteado:
    * */

    // Exercício 1
    var count:Int = 1
    do {
        println(count)
        count += 1
    } while (count<11)
    // Exercício 2
    do {
        print("Digite um número: ")
        var num = readln().toInt()
    } while (num>0)
    // Exercício 3
    var numSorteado:Int = 4
    do {
        print("Digite um número de 1 a 10: ")
        var num2 = readln().toInt()
    } while (num2!=numSorteado)
    println("Parábens você acertou o número sorteado!")
}