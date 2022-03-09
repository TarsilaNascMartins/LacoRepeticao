fun main(){
    /*
    2 Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    */

    var par : Int = 0
    var impar : Int = 0
    for(i in 1..10){
        print("Digite um número:")
        val i = readLine()!!.toInt()

        //qtd
        if(i %2 == 0) {
            par++

        }
        else {
            impar ++

        }

    }
    println("A quantidade número pares digitados foi de $par")
    println("A quantidade número ímpares digitados foi de $impar")


}
