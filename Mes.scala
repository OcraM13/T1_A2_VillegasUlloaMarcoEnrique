import scala.io.StdIn._

object Mes {
  def main(args: Array[String]): Unit = {
    println("Escribe el numero de mes")
    var m = readInt()
    dias(m)
  }
  
  def dias(m:Int): Unit = {
    if(m == 2){
      println("28 dias")
    }else if((m==4)||(m==6)||(m==9)||(m==11)){
      print("30 dias")
    }else if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
      print("31 dias")
    }
  }
}