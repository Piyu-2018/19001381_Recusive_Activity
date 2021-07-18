import scala.io.StdIn._

object Q3_AddSeqNum extends App{
  def add(x:Int):Int={
    if(x==0)
      0
    else
      x+add(x-1)
  }

  print("Enter a number: ")
  var p=readInt()

  println(add(p))
}
