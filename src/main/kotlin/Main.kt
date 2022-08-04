import java.util.Scanner
fun main(args: Array<String>) {


//    /* Data types
//       *numbers
//       * >whole
//       *    -byte
//       *    -integer
//       *    -Short
//       *    -Long
//       * >Decimals
//       *    -Float
//       *    -Double
//       *Alphanumerics
//       *   >character
//       *    -a
//       *    -b
//       *    -c
//       *   >strings
//       *    -muyefr
//    *   */
//     //Example
//    val comps: Int= 50
//    var students =51
//        students=23
//    val desks: Int= 25
//
//
//    var  myname: String="Muyelele"
//      myname="Timothy"
//    var grade: Char  = 'A'
//
//    println(
//         desks
//    )
//    println(
//        students
//    )
//    println(myname)
//
//
//    var cows: Int= 4
//    var chicken: Int=20
//
//    var total = cows+chicken
//
//    println(total)
//
//
//    /*OPERATORS
//    *Definition-are special symbols (characters) that carry out operations on operands (variables and values)
//    *   >Types of operators
//    *      -Arithmetic operators
//    *        eg.*,-,+,%,/
//           -binary operator
//             eg.==
//           -Assignment operators
//              eg.=

//           logical operators
//           eg.Operator	                               Corresponding Function
//              ||	            	                                 (a>b)or(a<c)
//              &&	                                                 (a>b)and(a<c)
//              !                                                    NOT
//          -tenary operators
//            eg.condition ? expression1 : expression2;
//          -comparison operators
//            eg =<.>.,=,<,>
//          -bitwise operation
//           -negations
//
//
//
//          */

//
//    var sweets :Int=47
//    var children :Int =17
//    var mod :Int =sweets+children
//
//    println(mod)
//    var cars:Int=652
//    var customers:Int =13
//    var fat:Int =cars*customers
//    println(fat)



//    var goats:Int=4
//    var cows:Int=10
//    var chicken:Int=54
//    //total number of animals in the farm
//    var animals:Int=goats+cows+chicken
//    //divide by 2 due to drought
//    var remaining:Int=animals/2
//
//
//    println(remaining)
//
//    //BOOLEANS WITH LOGICAL OPERATORS
//    var x :Boolean=true
//    var y :Boolean=false
//
//    println("x && y="+ (x && y))
//    println("x || y="+ (x || y))
//    println("! y="+ ( ! y))
//
//
//    // Boolean with Comparison Operators
//     var math : Int=100
//     var aviation :Int=98
//
//    println("math>aviation=" + (math > aviation))
//    println("math<aviation=" + (math <  aviation))
//    println("math>=aviation=" + (math>=aviation))
//    println("math<=aviation=" + (math<=aviation))
//    println("math==aviation=" + (math==aviation))
//    println("math!=aviation=" + (math!=aviation))
//
//
//
//    //11500x+11500y=931500
//    //11500x+11000y=910000
//
//   var b :Int=11500
//    var c :Int=21500
//    var d :Int=500
//    var e :Int=11000
//    var f :Int=931500
//    var g :Int=910000
//    var cowa: Int=43
//    var total :Int= 81
//    var t :Int= 4300
//    var l :Int= 3800
//  println(b-e) //-d
//  println(f-g) //-c
//    println("First year")
//  println( "Cow 1 produces "+ (c/d)*100 + " litres of milk") //cowa
//  println(f/b)
//  println( "Cow 2 produces "+ (total-cowa)*100 + " litres of milk" )
//   println("Second year")
//    println( "Cow 1 produces "+ (t)*1.15 + " litres of milk")
//    println( "Cow 2 produces "+ (l)*1.10 + " litres of milk")
    mwanafunzi("Timothy Muyelele",8681,'A')
//
////ARRAYS
////Are used to store multiple items of the same data type in a single variable
//
//    var fruits = arrayOf<String>("Apples","Oranges","Grapes","Pawpaw","Pomegranates" )
//
//    println(fruits[0])
//    println(fruits[2])
//
//    println(fruits.get(2))
//    //Setting the value of the second index in fruits array
//    println(fruits.set(2,"Guava"))
//    println(fruits[2])
//    println("Size of fruits array = " + fruits.size)
//
//    fruits.drop( 1)
//
//    if ("Oranges" in fruits){
//        println("Oranges exists in the array")
//    }
//    else{
//        println("Oranges does not exist in array")
//    }
//   println(fruits[2])
//
//
//
//    /* CONTROL  STATEMENTS
//    *   >Description-this are statements that determine the next step to be executed in a program
//    *   EXAMPLES
//    *     -if....else
//    *     -when
//    *     -for
//    *     -do*/
//
////nb A syntax is the rules followerd when writing a program which the define the structure of the programming language
//
//// IF_ELSE STATEMENT
///*Syntax of IF-ELSE statement.....
//* if(condition){
// *            //statement!
//*               }
//*     else{
//*           Statement!
//*           }
//* */
//
//
//
//var age:Int=18
//if (age >= 20){
//    println("Adult")
//}
//else if (age >=13 && age<=19){
//    println("Teen")
//}
//else{
//    println("Child")
//}
//
///*// WHEN STATEMENTS
//* Description- This is a statement that goes through a certain block of code and executes the on that fulfills the condition
//*
//* SYNTAX : when(condtion){
//*                         Statement 1
//*                         statement 2
//*                            ""
//*                          }
//*  */
//
//
//var reader = Scanner(System.`in`)
//println("enter the month number")
//var monthofyear = reader.nextInt()
//var month =  when (monthofyear){
//    1->"January"
//    2->"February"
//    3->"March"
//    4->"April"
//    5->"May"
//    6->"June"
//    7->"July"
//    8->"August"
//    9->"September"
//    10->"October"
//    11->"November"
//    12->"December"
//
//
//    else->{
//        println("This Month does not exist")
//    }
//
//}
//println(month)
//
//
////WHILE LOOP
///*Description-A loop is used to execute a block of code repeatedly until a certain condition is met
//*
//* The WHILE loop checks /evaluates on a condition first .if -true ,
//*   it executes the code within the block and will loop/repeat until the condition is false
//*
//* SYNTAX-while(condition){
//*                        //code to run
//*                          }
//* */
//
//
////CODE.....
//var number = 1
//while(number<= 20){
//    println(number)
//    number ++
//}
//
//
//
//
//
////For
//
//
//var fruit = arrayOf("Orange", "Apple", "Mango", "Banana")
//
//for (index in fruit.indices) {
//    println(fruit[index])
//}
//var fruite = arrayOf("Orange", "Apple", "Mango", "Banana")
//
//for (item in fruite) {
//    println(item)
//}
//var sum: Int = 0
//var input: String
//
//
////Do...While
//do {
//    print("Enter an integer: ")
//    input = readLine()!!
//    sum += input.toInt()
//
//} while (input != "0")
//
//println("sum = $sum")


    /*Functions
    * Description-Function is a unit of code that perform specific tasks
    * They are used to break code into small modules to make the program more manageable
    *
    * Types of functions;-
    *                   1.built in functions -This are functions that are already defined/existing in the standard library and are available for use
    *                   2.USer defined function-Take one or more functions
    *                        -Syntax:fun fun_name (Data types/parameters):Return-optional {
    *                                                                                       // Codes
    *                                                                                      }
    * */




    //Built in function example
    var kuongeza = arrayOf(1,2,3,4,5,6,7,8,9,10).sum()
    println("Total sum of element in the  kuongeza array is : $kuongeza")


    //USER DEFINED FUNCTION-function written by the programmer
}
fun mwanafunzi (jina:String,index:Int,grade:Char){
       println("Jina langu ni : $jina")
    println("Indexi yangu ni : $index")
    println("Gredi yangu ni : $grade")
}

