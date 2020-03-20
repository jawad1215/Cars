class Car {

}
fun main() {
    val optionParam= arrayOf("Audi","Mehran","Truck","Rikshaw")
    val userChoice=UserChoice(optionParam)
    var name=userChoice.userChoice()

    if (name=="Truck")
    {
        val truck=Truck(name)
        println("Name is ${truck.name}")
        println("Color is ${truck.color}")
        println("Price is ${truck.price}")
        println("Speed is ${truck.speed}")
        println("Wheel are ${truck.wheels}")
        truck.running()

    }
    if (name=="Rikshaw")
    {
        val rikshaw=Rikshaw(name)

        println("Name is ${rikshaw.name}")
        println("Color is ${rikshaw.color}")
        println("Price is ${rikshaw.price}")
        println("Speed is ${rikshaw.speed}")
        println("Wheels are ${rikshaw.wheels}")
        rikshaw.running()
    }
    if (name=="Mehran")
    {
        val mehran=Mehran(name)

        println("Name is ${mehran.name}")
        println("Color is ${mehran.color}")
        println("Price is ${mehran.price}")
        println("Speed is ${mehran.speed}")
        println("Wheels are ${mehran.wheels}")
        mehran.running()
    }
    if (name=="Audi")
    {
        val audi=Audi(name)

        println("Name is ${audi.name}")
        println("Color is ${audi.color}")
        println("Price is ${audi.price}")
        println("Speed is ${audi.speed}")
        println("Wheels are ${audi.wheels}")
        audi.running()
    }


}