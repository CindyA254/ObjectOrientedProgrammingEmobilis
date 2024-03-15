fun main(args: Array<String>) {
    //using constructors
    val car1 = Car("Vitz","Toyota", 2010)
    println(car1.brand)
    //individual objects and properties
//    car1.brand = "Vitz"
//    car1.model = "Toyota"
//    car1.year = 2010
//    println(car1.brand)
//    println(car1.model)
//    println(car1.year)
    //class objects
    val lamp1 = Lamp()
    lamp1.turnOff()
    println(lamp1.displayLightStatus("lamp1"))
    lamp1.turnOn()
    println(lamp1.displayLightStatus("lamp1"))
//class objects
    val lamp2 = Lamp()
    lamp2.turnOn()
    println(lamp2.displayLightStatus("lamp2"))
    lamp2.turnOff()
    println(lamp2.displayLightStatus("lamp2"))

    val person1 = Person("Alex", 23)
    person1.canVote(23)

    val person2 = Person("mike", 17)
    person2.canVote(17)

    val car2 =  Car("Ford", "Mustang", 1920)
    println(car2.model)
//    car2.brand = "Ford"
//    car2.model = "Mustang"
//    car2.year = 1920
//    println(car2.brand)
//    println(car2.model)
//    println(car2.year)
}
class Car(var brand: String, var model: String, var year: Int){
    //body
    //data variable
//    var brand = ""
//    var model = ""
//    var year = ""

}
//member functions(methods)
class Lamp{
    var isOn:Boolean = true


    fun turnOff(){
        isOn = false


    }
    fun turnOn(){
        isOn = true
    }
    fun displayLightStatus(lamp: String){
        if (isOn==true){
            println("$lamp is on")
        }else{
            println("$lamp is off")
        }
    }
}
//create class using a constructor
class Person(var name: String, var age: Int){
    fun canVote(age: Int){
        if (age<18){
            println("can not vote")
        }else{
            println("Can vote")
        }
    }

}
