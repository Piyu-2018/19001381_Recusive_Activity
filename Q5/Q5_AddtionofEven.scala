import scala.io.StdIn._

object Q5_AddtionofEven extends App{
  def evenAdd(x:Int):Int={
    if(x%2==0){
      if(x==0)
        0
      else
        x+evenAdd(x-1)
    }
    else{
      evenAdd(x-1)
    }
  }
  print("Enter a number: ")
  var p=readInt()

  println(evenAdd(p))
}
