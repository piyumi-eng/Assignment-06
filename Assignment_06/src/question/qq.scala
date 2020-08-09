package question

import math.{sqrt,pow}

case class Point(x:Int,y:Int)
{
  def a:Int=x;
  def b:Int=y
  
  def move(dx:Int,dy:Int)=Point(this.x+dx, this.y+dy)
  
  def +(other:Point)=Point(this.x+other.x, this.y+other.y)
  
  def distance(other:Point):Double=sqrt(pow(x-other.x, 2) + pow(y-other.y, 2))
  
  def invert()=Point(this.y,this.x)
}

object qq{
  def main(args:Array[String]){
  val p1=Point(2,4)
  val p2=Point(2,3)
  val p3=p1.move(4,5)
  
  println("p1 = "+p1)
  println("p2 = "+p2)
  println("p3 = "+p3)
  println("p1+p2 = "+(p1+p2));
  println("Distance between p1 and p2 = "+p1.distance(p2));
  println("Invert of p1 = "+p1.invert);
  }
  
}

 