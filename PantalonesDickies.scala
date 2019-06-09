import scala.io.StdIn._

object PantalonesDickies {
  def main(args: Array[String]): Unit = {
    println("numero de panalones")
    var num = readInt()
    descuento(num)
  }
  
  def descuento(num:Int): Unit ={
    var precio = 356.82;
    if(num < 5){
      var total = precio * num;
      
      println("No tienes descuento")
      println("El total es: $"+total)
    }else if((num < 12) && (num >= 5)){
      var total = precio * num;
      total = total - (total * .15)
      
      println("Tienes descuento de 15%")
      println("El total es: $"+total)
    }else if(num >= 12){
      var total = precio * num;
      total = total - (total * .15)
      
      println("Tienes descuento de 30%")
      println("El total es: $"+total)
    }
  }
}