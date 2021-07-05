import java.util.*

class Main{
      companion object{
          @JvmStatic fun main( vararg args: String){
              val empty= emptyArray<String>() //generamos un array vacio
              var misestrings=Array<String>(size = 5,init = {index ->"item #$index"}) //arayy incializado con su size y su inicializacion
              //println(Arrays.toString(misestrings))
              val otrostring= arrayOf("perro ","caballo ","estupido ","limpieza ")
              for(s : String in otrostring){
                  print(s)  //bucle que imprime diez veces
                  repeat(10) {i->
                      print(s)
                  }
              }
              for(i in  0..9){
                  print(i)
              }
              //hashmap
              var mimapa= hashMapOf(1 to "foo",2  to "pee", 3 to "caa")
              for((key,value)in mimapa){
                  println("Map[$key] =$value")
              }


          }
      }



}