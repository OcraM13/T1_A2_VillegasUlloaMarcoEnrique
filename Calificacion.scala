import scala.io.StdIn._

object Calificacion {
  def main(args: Array[String]): Unit = {
    println("Ingresa calificacion 1")
    var cal1 = readDouble()
    println("Ingresa calificacion 2")
    var cal2 = readDouble()
    println("Ingresa calificacion 3")
    var cal3 = readDouble()
    println("Ingresa calificacion 4")
    var cal4 = readDouble()
    println("Ingresa calificacion 5")
    var cal5 = readDouble()
    
    masa(cal1,cal2,cal3,cal4,cal5)
  }
  
  def masa(c1:Double,c2:Double,c3:Double,c4:Double,c5:Double): Unit = {
    var prom = c1+c2+c3+c4+c5;
    prom = prom/5;
    
    if(prom <= 69){
      println("Terrible")
    }else if((prom <= 79) && (prom >= 70)){
      println("Regular")
    }else if((prom <= 89) && (prom >= 80)){
      println("Bien")
    }else if((prom <= 100) && (prom >= 90)){
      println("Ecelente")
    }
  }
}