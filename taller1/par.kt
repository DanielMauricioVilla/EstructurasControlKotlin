fun main(){
    // se crea un par de datos
    var pair1 = Pair("Daniel", 18)

    //accede a los elementos 
    println(pair1.first)
    println(pair1.second)
    
    //recorrer a los elementos
    for (i in pair1.toList()){
        println(i)
    }
    //nuevo obgeto para asi actualizar un dato par
    var update = pair1.copy(first = "Adios")

    println(pair1)
    println(update)

    // funciones utiles
    // retorna primer el elemento
    var elemento1 = update.component1()
    // retorna segundo elemento
    var elemento2 = update.component2()
    // convierte en lista
    var list = update.toList()
    // convierte en cadena
    var cadena = update.toString()

    println(elemento1)
    println(elemento2)
    println(list)
    println(cadena)
}