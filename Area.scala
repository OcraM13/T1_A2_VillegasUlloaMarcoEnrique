import scala.math._
import scala.io.StdIn._

object Area {
  def areaRectangulo(b:Double, h:Double): Double = {
    b*h
  }
  def perimetroRectangulo(b:Double, h:Double): Double = {
    (b*2)+(h*2)
  }
  
  def areaTriangulo(b:Double, h:Double): Double={
    (b*h)/2
  }
  def perimetroTriangulo(l1:Double, l2:Double, l3:Double): Double={
    l1+l2+l3
  }
  
  def areaCirculo(r:Double): Double = {
    Pi * r
  }
  def perimetroCirculo(d:Double): Double ={
    Pi * d
  }
  
  def main(args: Array[String]): Unit = {
    var m = 0
    var m2 = 0 
    
    while(m != -1){
      println("1) Circulo")
      println("2) Triangulo")
      println("3) Rectangulo")
      println("4) Salir")
      m = readInt()
      
      if(m == 1){
        println("1) Area")
        println("2) Perimetro")
        m = readInt()
        
        if(m == 1){
          println("Escribe el radio")
          println("El area es: "+areaCirculo(readDouble()))
        }else if(m == 2){
          println("Escribe el diametro")
          println("El perimetro es: "+perimetroCirculo(readDouble()))
        }
      }else if(m == 2){
        println("1) Area")
        println("2) Perimetro")
        m = readInt()
        
        if(m == 1){
          println("Escribe la base")
          var b = readDouble()
          println("Escribe la altura")
          var h = readDouble()
          
          println("El area es: "+areaTriangulo(b, h))
        }else if(m == 2){
          println("Escribe el lado 1")
          var l1 = readDouble()
          println("Escribe el lado 2")
          var l2 = readDouble()
          println("Escribe el lado 3")
          var l3 = readDouble()
          
          println("El prerimetro es: "+perimetroTriangulo(l1,l2,l3))
        }
      }else if(m == 3){
        println("1) Area")
        println("2) Perimetro")
        m = readInt()
        
        if(m == 1){
          println("Escribe la base")
          var b = readDouble()
          println("Escribe la altura")
          var h = readDouble()
          
          println("El area es: "+areaRectangulo(b, h))
        }else if(m == 2){
          println("Escribe la base")
          var b = readDouble()
          println("Escribe la altura")
          var h = readDouble()
          
          println("El perimetro es: "+perimetroRectangulo(b, h))
        }
      }else if(m == 4){
        println("Adios")
        m = -1
      }
    }
  }
}