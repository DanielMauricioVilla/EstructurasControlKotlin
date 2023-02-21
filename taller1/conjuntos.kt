fun main (){
    // creando un conjunto inmutable
    var conjunto = setOf(1,2,3,4,5)
    // creando un conjunto mutable
    var conjunto2 = mutableSetOf<Int>(6,7,8,9)

    //Accediendo al conjunto, puede lanzar un error si no se encuentra en el rango
    println (conjunto.elementAt(0))
    //Accediendo al conjunto, puede lanzar un Null si no se encuentra en el rango
    println (conjunto.elementAtOrNull(5))

    // agregar 
    conjunto2.add(10)
    // Agregar cantidades mas grandes
    conjunto2.addAll(conjunto)

    println("Se agregaron: "+conjunto2)

    println("")

    //recorriendo conjunto
    println("Recorrido")
    var i = 0
    do{
        println (conjunto2.elementAt(i))
        i++
    }while (i < (conjunto2.size))

    //funciones utiles
    //imprime el primer valor
    println("Primero: "+conjunto.first())
    //imprime el ultimo valor
    println("Ultimo: "+conjunto.last())
    //suma los valores
    println("Suma: "+conjunto.sum())
    //hece el promedio de los valores
    println("Promedio: "+conjunto.average())

}