// 2. Algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique es la persona es menor de edad, de lo
// contrario indique que es mayor de edad

fun main (){
    println("Igrese la edad: ")
    var edad = readLine()!!.toInt()
    
    if(edad < 18){
        println("La persona es menor de edad")
    }else {
        println("La persona es mayor de edad de edad")
    }

    println("La edad es: $edad")
}