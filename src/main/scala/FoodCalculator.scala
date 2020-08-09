/*
Create a new Intellij project
Create a new Scala Object called FoodCalculator.scala in this project
object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20
  //println how much will it cost to buy the food
  //It will cost XXXX to buy XX kilos of XXXX
  println("It will cost XXXX to buy XX kilos of XXXX")
}
Fix it so it prints the correct text
*/

object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20
  val cost = price*quantity
  println(s"It will cost $cost to buy $quantity kilos of $food")
}


