import scala.io.StdIn._

object MasaCorporal {
  def main(args: Array[String]): Unit = {
    println("Ingresa el peso en kg")
    var peso = readDouble()
    println("Ingresa la altura en metros")
    var altura = readDouble()
    
    masa(altura,peso)
  }
  
  def masa(altura:Double, peso:Double): Unit = {
    var masa = peso / (altura * altura)
    
    if(masa < 16){
      println("Criterio de ingreso en hospital")
    }else if((masa < 17) && (masa >= 16)){
      println("Infrapeso")
    }else if((masa < 18) && (masa >= 17)){
      println("Bajo peso")
    }else if((masa < 25) && (masa >= 18)){
      println("Peso normal (saludable)")
    }else if((masa < 30) && (masa >= 25)){
      println("Sobrepeso (obesidad de grado I)")
    }else if((masa < 35) && (masa >= 30)){
      println("Sobrepeso crónico (obesidad de grado II)")
    }else if((masa < 40) && (masa >= 35)){
      println("Obesidad premórbida (obesidad de grado III)")
    }else if(masa >= 40){
      println("Obesidad mórbida (obesidad de grado IV)")
    }
  }
}