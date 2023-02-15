// 2. Haga un algoritmo que solicite un numero y si este es negativo lo convierta en positivo y 
// lo imprima, realice este proceso n cantidad de veses.

fun main (){
    var numero: Int
    var continuar: String
    do {
        print("Ingrese un numero: ")
        numero = readLine()!!.toInt()
        if (numero < 0){
            numero = numero * -1
        }
        println("El numero positivo es: $numero")
        print("¿Desea ingresar otro numero? (si/no): ")
        continuar = readLine()!!
    }while (continuar.uppercase() == "SI")
}