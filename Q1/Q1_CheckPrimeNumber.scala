import scala.annotation.tailrec
import scala.io.StdIn._

object Q1_CheckPrimeNumber extends App{
  @tailrec
  def gcd(m:Int,n:Int):Int=  n match{
    case 0=>m
    case n if (n>m) =>gcd(n,m)
    case _=>gcd(n,m%n)
  }

  def isPrime(x:Int,y:Int):Boolean= y match{
    case a if x==a => true
    case a if gcd(x,a)>1 =>false
    case a =>isPrime(x,a+1)
  }

  print("Enter a number: ")
  var p=readInt()

  println(isPrime(p,2))
}
