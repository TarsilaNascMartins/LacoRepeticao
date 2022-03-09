fun main () {
/*
Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */

    println("Os valores que são  divididos por 11 e obtemos resto = 5, sendo encontrado " +
            "entre os números 1000 a 1999, são:")
    for (i in 1000..1999) {

        if(i %11 == 5) {

            println("$i")

        }


    }
}