fun main (){

    /*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
    Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
     */

    var cont21 : Int = 1
    var somacont21 : Int =0
    var cont50 : Int = 1
    var somacont50 : Int = 0
     var idade : Int = 0

    while(idade != -99){

        print("Digite sua idade: ")
        idade = readLine()!!.toInt()

        if (idade <= 21) {

           somacont21 = somacont21 + cont21

        }
       else if (idade >= 50) {

            somacont50 = somacont50 + cont50

        }
        println("A quantidade de pessoas com até 21 anos é de $somacont21")
        println("A quantidade de pessoas com mais de 50 anos é de $somacont50")

    }




}