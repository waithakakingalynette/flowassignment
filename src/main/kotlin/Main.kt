fun main() {
    numbers()

    println (nameA(arrayOf("Lynette", "grace", "Peris", "Lemmuel", "Annet", "Gisemba", "Nathalie")) )
    robot(1)
    robot(3)
    robot(7)
    robot(14)
    robot(56)
    robot(35)

    multiples(18)
    multiples(25)
   multiples(45)

}

//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun numbers(){
//    val nums = (1 to 100)

    for (num in 0..100) {
        if (num %  2!=0) {
            println("$num is odd")
        }
    }
}

//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun nameA(names:Array<String>):Int{
         var x=0
    names.forEach { w->

        if (w.length >5) {
            x++
        }
        }
    return x
    }





//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robot(Robot:Int) {
    when (Robot) {
        in 0..6 -> println("serve a glass of milk")
        in 6..15 -> println("serve bottle of soda")
        else -> println("gets a bottle of of coca cola")

    }
}



//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun multiples(num:Int){
    for (num in 1..100){
        if (num %3==0 && num %5==0){
            println("FizzBuzz")
        }
        else if (num %3==0){
            println("Buzz")
        }
        else if (num %5==0){
            println("Fizz")
        }
        else
            println(num)
    }
}