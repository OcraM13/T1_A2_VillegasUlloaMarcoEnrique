import scala.io.StdIn._

object A�o {
  def main(args: Array[String]): Unit = {
    println("Ingrese un a�o")
    var a�o = readInt()
    fecha(a�o)
  }
  
  def fecha(a�o:Int): Unit ={
    if(a�o % 400 == 0)
      println("Es a�o Bisiesto")
    else 
      if(a�o % 4 == 0 && a�o % 100 != 0)
        println("Es a�o Bisiesto")
      else
        println("No es a�o Bisiesto")
  }
}