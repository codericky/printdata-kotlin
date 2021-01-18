class myclass{
    private val name: String ="Ricky"
    private val address: String ="Tangerang"
    private val age: Int = 20
    fun printdata(){
        println("You are at the best and name"+" "+name)
        println("Im from tangerang banten"+" "+address)
        println("Im age is"+" "+age)
    }
}

class test {
    class Nested {
        fun mydata() = "Good Bye Friends..."
    }
}

fun main(args: Array<String>){
    val obj = myclass()
    obj.printdata()
     var me = test.Nested().mydata()
    println(me)
}

