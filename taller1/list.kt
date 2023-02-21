fun main (){
    //lista que no se modifica
    var lista1 = listOf ("Pepito","Julano","Sutano")
    //lista madificable
    var lista2 = mutableListOf(1,2,3,4)

    //agregar
    lista2.add(5)

    println(lista1)
    println(lista2)

    //hallarmeddiante la pisicioon 
    println(lista2.get(1))
    println(lista2[2])

    //remplazar
    lista2[1] = 20
    println(lista2)
    lista2.set(0,8)
    println(lista2)

    //remover
    lista2.removeAt(0)
    println(lista2)
    lista2.remove(5)
    println(lista2)

    // Recorriendo una lista
    for (i in lista2) {
        println(i)
    }
    //ordena de menor a mayor
    lista2.sort()
    //ordena de mayor a menor
    lista2.sortDescending()

    //funciones utiles para listas no mutables
    //verifica que este elemento esté en la lista
    println("esta Pepito: "+lista1.contains("Pepito"))
    println("esta nana: "+lista1.contains("nana"))
    //valor aleatorio
    println("aleatorio: "+lista1.random())

}