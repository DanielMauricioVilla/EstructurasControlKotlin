
fun main (){

    //Creacion de un arreglo
    var array1 = arrayOf("Daniel", "Yuly", "Nicol", "Sharis")
    println("Cantidad: "+array1.size)

    //Accediendo a los elementos 
    println("Simple:  "+array1[2])
    println("Con .get:  "+array1.get(1))

    //Modificando los elementos de un arreglo
    array1.set(0,"Sara")

    //Recorriendo un arreglo  
    for (i in array1) {
        println(i)
    }

    println("Utilizando funcines utiles")

    //funciones utiles
    //el tipo es entero, solo recibira valores enteros
    var declarandoTipo = intArrayOf(1,2,3,4)

    //igual que el anterior, pero como no se le an asignado valores da 
    //como outdefault 0 o el que se elija colocando en las llaves
    var declarandoTipo2 = IntArray(4) {1}

    for (i in declarandoTipo) {
    println(i)
    }
    for (i in declarandoTipo2) {
    println(i)
    }
}
