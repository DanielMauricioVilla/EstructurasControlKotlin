// 1. Haga un algoritmo que solicite el ingreso de 2 números, valide cual es mayor o si son iguales

fun main (){
    print("Ingrese el valor de a: ")
    val a = readLine()!!.toInt()
    print("Ingrese el valor de b: ")
    val b = readLine()!!.toInt()

    if (a > b){
        println("$a es mayor que $b")
    }else{
        if (b > a){
        println("$b es mayor que $a")
        }else{
            println("$a y $b son iguales")
        }
    }
    println("\n\nTermino la lectura")
}