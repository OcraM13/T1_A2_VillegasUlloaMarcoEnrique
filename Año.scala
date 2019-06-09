import scala.io.StdIn._

object Año {
  def main(args: Array[String]): Unit = {
    println("Ingrese un año")
    var año = readInt()
    fecha(año)
  }
  
  def fecha(año:Int): Unit ={
    if(año % 400 == 0)
      println("Es año Bisiesto")
    else 
      if(año % 4 == 0 && año % 100 != 0)
        println("Es año Bisiesto")
      else
        println("No es año Bisiesto")
  }
}