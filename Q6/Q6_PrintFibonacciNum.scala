import scala.io.StdIn._

object Q6_PrintFibonacciNum extends App{
  def fibo(x:Int):Int= x match{
    case x if x==0 =>0
    case x if x==1 =>1
    case x => fibo(x-1)+fibo(x-2)
  }

  def printFibo(n:Int):Any ={
    if(n>0) printFibo(n-1)
    println(fibo(n))
  }

  print("Enter a number: ")
  var p=readInt()

  printFibo(p)

}
