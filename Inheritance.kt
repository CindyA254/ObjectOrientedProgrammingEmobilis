fun main(args: Array<String>) {

    val child1 = Child()
    child1.myFunction()

    val dog1 = Dog("black", 5)
    dog1.woof()

    val cat1 = Cat("White", 3)
            cat1.meow()

    val cow1 = Cow("brown", 23)
            cow1.mows()
}
open class Parent{
    val x = 5

}
class Child:Parent(){
    fun myFunction(){
        println(x)
    }
}

open class Animal(var color: String, var age: Int){
    init {
        println("color is $color")
        println("Age is $age")

    }
}
class Dog(color: String, age: Int):Animal(color, age){
    fun woof(){
        println("dog maks sound of a woof")
    }
}
class Cat(color: String, age: Int):Animal(color, age){
    fun meow(){
        println("the cat makes sound of meow")
    }
}
class Cow(color: String, age: Int):Animal(color, age)
    fun mows(){
        println("the cow makes a sound of mows")
    }