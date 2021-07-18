import scala.annotation.tailrec
import scala.io.StdIn._
import scala.util.control.Breaks._

object Q2_PrintPrimeseq extends App{
  @tailrec
  def gcd(m:Int,n:Int):Int=  n match{
    case 0=>m
    case n if (n>m) =>gcd(n,m)
    case _=>gcd(n,m%n)
  }

  @tailrec
  def isPrime(x:Int,y:Int):Boolean= y match{
    case a if x==a => true
    case a if gcd(x,a)>1 =>false
    case a =>isPrime(x,a+1)
  }

  @tailrec
  def printSeq(s:Int,t:Int){
     if(s==t){
       break
     }
    if(isPrime(t,2)){
      println(t)
    }
    printSeq(s,t+1)
  }

  print("Enter a number: ")
  var p=readInt()

  println(printSeq(p,2))

}
