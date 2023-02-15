fun main (){
    checkNumber()
}

fun checkNumber() {
var num=0
    when (num) {
        0 -> println("El numero es 0")
        1, 2, 3 -> println("El numero esta entre 1 y 3")
        in 4..10 -> println("El numero está entre 4 y 10")
        else -> println("El numero no se encuentra")
    }
}

