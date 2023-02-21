
fun main (){
    // ejercicio1 ()
    // ejercicio2 ()
    // ejercicio3 ()
    ejercicio4 ()
    // ejercicio5 ()
}

// pepe quiere saber cual es su promedio en matematicas ya que sus notas son 3,4,5 y 2.
fun ejercicio1 (){
    var notas = arrayOf (3.0,4.0,5.0,2.0)
    var suma = 0.0;
    for (i in notas) {
        suma += i;
    }
    var prom: Double = suma/notas.size;
    println ("El promedio de pepe es: "+prom)
}

// se necesita saber el listado de personas registradas, cantidad de personas, verificar 
// si esta Daniel y Diego, en caso de no estar ninguno agregarlo.
fun ejercicio2 (){
    var nombres = mutableListOf ("Daniel","Sara","Mauricio","Susana")
    println("Lista personas: ")
    for (i in nombres) {
        println(i)
    }
    println("Cantidad de personas registradas: "+nombres.size)

    if (nombres.contains("Daniel") == false){
        println ("Daniel no esta registrado, se registrará inmediatamente")
        nombres.add("Daniel")
        println(nombres)
    } else {
        println("Daniel esta registrado")  
    }

    if (nombres.contains("Diego") == false){
        println ("Diego no esta registrado, se registrara inmediatamente")
        nombres.add("Diego")
        println(nombres)
    } else {
        println("Diego esta registrado")  
    }

    println("Cantidad de personas registradas: "+nombres.size)
}

// en la tienda de maria manejan dos cuentas de empleados, las cuales se tienen que fucionar y 
// hacer un conteo de personal. tambien hay que agregar  2 nit que se le olvido a maria poner en 
// la cuenta de empleados. cada empleadoo le pagan 100,000 al dia, cuanto dinero tiene que apartar
//  maria para pagar sus empleados

fun ejercicio3 (){
    var cuenta1 = setOf(1,2,3,4)
    var cuenta2 = mutableSetOf (5,6,7)
    println("Cuenta nit #1: ")
    for (i in cuenta1) {
        println(i)
    }
    println("Cuenta nit #2: ")
    for (i in cuenta2) {
        println(i)
    }
    cuenta2.add(9)
    cuenta2.add(8)
    cuenta2.addAll(cuenta1)

    var suma = 0;
    for (i in cuenta2) {
        suma ++
    }

    println("Cuenta completa de empleados: "+cuenta2)
    println("La suma total de los empleados es: "+suma)
    println("El dinero total a apartar para sus empleados es de: "+(suma*100000))
}

// paula decea saber que edad tiene Daniel y Juan, tambien busca actulizar la edad de salome a 24,
//  si hay menores de edad se eliminaran.

fun ejercicio4 (){
    var personas = mutableMapOf("Daniel" to 18,"Juan" to 15,"Salome" to 23)
    println("Daniel tiene una edad de: "+personas["Daniel"])
    println("Juan tiene una edad de: "+personas["Juan"])
    personas["Salome"] = 24
    println("")
    println("Personas")
    println(personas)

    val person1 = personas["Daniel"]
    val person2 = personas["Juan"]
    val person3 = personas["Salome"]

    println("Se elimina los menores de edad")

    if (person1 != null && person1 < 18){
        personas.remove("Daniel")
        println(personas)
    } else if (person2 != null && person2 < 18) {
        personas.remove("Juan")
        println(personas)
    }else if (person3 != null && person3 < 18){
        personas.remove("Salome")
        println(personas)
    } 


}

//hacer un elemento que pida el nombre y la edad y que calcule cuanto tendra en 45 años
fun ejercicio5 (){
    println("Ingrese su nombre: ")
    var nombre = readLine()

    println("Ingrese su edad: ")
    var edad = readLine()!!.toInt()

    var datos = Pair(nombre,edad)
    var edadFuturo = Pair("futuro",45)

    var edadF = datos.second + edadFuturo.second
    // var nombrePair =  
    // var edad =  

    println(datos.first+", tiene una edad de "+datos.second+" en 45 años tendrá una edad de $edadF")
}

