fun main() {
    /* Desafio Semanal
    *   1 - Permitir ao usuário adicionar uma nova pessoa ao array, informando o nome e a idade.
    *   2 - Exibir a lista de todas as pessoas adicionadas ao array, mostrando o nome e a idade de cada uma.
    *   3 - Exibir a média de idade das pessoas adicionadas ao array.
    *   4 - Permitir ao usuário buscar uma pessoa pelo nome, exibindo o nome e a idade correspondentes.
    *   5 - Permitir ao usuário remover uma pessoa pelo nome, atualizando o array e exibindo a lista atualizada.
    * */

    var pessoas = arrayOf<Array<String>>()
    var mediaIdade = 0.0

    while (true) {
        println("O que deseja fazer?")
        println("1 - Adicionar nova pessoa")
        println("2 - Listar pessoas")
        println("3 - Calcular média de idade")
        println("4 - Buscar pessoa por nome")
        println("5 - Remover pessoa por nome")
        println("6 - Sair")
        print("Digite sua escolha: ")

        var escolha = readln().toInt()

        when (escolha) {
            1 -> {
                print("Digite o nome da pessoa: ")
                var nome = readln()
                print("Digite a idade da pessoa: ")
                val idade = readln().toInt()

                val novaPessoa = arrayOf(nome, idade.toString())
                pessoas += novaPessoa

                println("Pessoa adicionada com sucesso!")
            }
            2 -> {
                if (pessoas.isEmpty()) {
                    println("Não há pessoas adicionadas!")
                } else {
                    println("Lista de pessoas:")
                    for (pessoa in pessoas) {
                        println("${pessoa[0]} - ${pessoa[1]} anos")
                    }
                }
            }
            3 -> {
                if (pessoas.isEmpty()) {
                    println("Não há pessoas adicionadas!")
                } else {
                    mediaIdade = pessoas.map { it[1].toIntOrNull() ?: 0 }.average()
                    println("Média de idade das pessoas: ${mediaIdade}")
                }
            }
            4 -> {
                if (pessoas.isEmpty()) {
                    println("Não há pessoas adicionadas!")
                } else {
                    print("Digite o nome da pessoa: ")
                    val nome = readln()

                    val pessoaEncontrada = pessoas.find { it[0] == nome }

                    if (pessoaEncontrada != null) {
                        println("${pessoaEncontrada[0]} - ${pessoaEncontrada[1]} anos")
                    } else {
                        println("Pessoa não encontrada!")
                    }
                }
            }
            5 -> {
                if (pessoas.isEmpty()) {
                    println("Não há pessoas adicionadas!")
                } else {
                    print("Digite o nome da pessoa: ")
                    val nome = readln()

                    val novaLista = pessoas.filter { it[0] != nome }

                    if (novaLista.size < pessoas.size) {
                        pessoas = novaLista.toTypedArray()
                        println("Pessoa removida com sucesso!")
                    } else {
                        println("Pessoa não encontrada!")
                    }
                }
            }
            6 -> {
                println("Saindo...")
                break
            }
            else -> {
                println("Escolha inválida! Tente novamente.")
            }
        }
    }
}
