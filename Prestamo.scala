import scala.io.StdIn._

object Prestamo {
  def main(args: Array[String]): Unit = {
    println("Ingresa el nombre")
    var n = readLine()
    println("Ingresa el historial crediticia(‘b’buena o ‘m’ mala)")
    var c = readLine()
    println("Ingresa la cantidad pedida")
    var p = readDouble()
    println("Ingresa el salario anual")
    var s = readDouble()
    println("Ingresa el valor de otras propiedades")
    var v = readDouble()
    
    if(otorgar(c,p,s,v) >= 6){
      println("Prestamo otorgado a " + n)
    }else{
      println("Prestamo no otorgado a " + n)
    }
  }
  
  def otorgar(c:String,p:Double,s:Double,v:Double): Int ={
    var puntos = 0
    
    if(c.equals("b")){
      if(s >= (p*.5)){
        puntos = puntos+5
      }else if((s>=(p*.75)) && (s<p*.5)){
        puntos = puntos+3
      }else if((s>=(p*.90)) && (s<p*.75)){
        puntos = puntos+1
      }
      
      if((v*2)>p){
        puntos = puntos+5
      }else if(v == p  &&  v<=(p*2)){
        puntos = puntos+3
      }
    }else{
      puntos = 0
    }
  }
}