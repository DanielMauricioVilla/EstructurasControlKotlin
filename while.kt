// 5. Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso
// hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron

fun main (){
var respuesta : String = "SI"
var cont = 0

while (respuesta.uppercase() == "SI"){
    print("\nIngrese su nombre: ")
    val nombre = readLine()!!

    println("Hola $nombre bienvenido a la clase!\n")
    cont ++

    print("Ingrese si, si hay mas personas: ")
    respuesta = readLine()!!
}

println ("Llegaron $cont Personas")
println("Fin del ciclo")
}
