fun main (){
    //map sin cambios posibles
    var maps = mapOf("David" to 12, "Juan" to 13)
    //map con modificaciones 
    var maps2 = mutableMapOf("Daniel" to 12, "Mauricio" to 13)

    // por medio de la llave se obtiene el valor 
    println(maps["David"])
    //todas las llaves
    println(maps.keys)
    //todos los valores
    println(maps.values)

    // Cambia el valor de la llave puesta
    maps2["Daniel"]=20

    // agregar
    maps2.put("Juan", 8)
    println(maps2)

    //eleminar
    maps2.remove("Juan")
    
    println(maps2)

    //recorrer un map
    for (i in maps2) {
        println(i)
    }


}