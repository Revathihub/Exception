import java.lang.ArithmeticException
import java.util.*
import java.util.InputMismatchException
fun main(){
    var scan=Scanner(System.`in`)
    println("Enter the 2 number: ")
    var n1=scan.nextInt()
    var n2=scan.nextInt()
    try{
        println(n1/n2)
    }
    catch(e:ArithmeticException){
        println("Do not enter the n2 value is 0")
    }
    catch(e:InputMismatchException){
        println("Do not Enter the n2 value is Like a character")
    }
    finally{
        println("End of the program")
    }
}
