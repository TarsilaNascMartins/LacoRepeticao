fun main () {
/*
    Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
      // Int// MODULO 3 // MEDIA// 0
     */

    //var somaimparcont = 0
    var imparcont: Int = 0
    var media: Int = 0
    var somanumdig : Int= 0

    do {
        print("Digite os valores: ")
        val num = readLine()!!.toInt()

        if (num % 3 == 0 && num != 0) {

            somanumdig = somanumdig + num
            imparcont= imparcont + 1

        }
       // else {println("Esse numero é par")}

    }
    while (num != 0)

    println(
        "A média dos número ímpares é de: ${somanumdig/imparcont}" +
                "\nA quantidade de números digitados foi de: $imparcont"
    )


}