class Truck(var name:String):Properties {
    override val color: String
        get() = "Yellow"
    override val price: Int
        get() = 350_000
    override val speed: Int
        get() = 80
    override val wheels: Int
        get()=4

    override fun running() {
        println("Speed of ${name} is $speed Km/h")
    }

}

class Rikshaw(var name:String):Properties {
    override val color: String
        get() = "Red"
    override val price: Int
        get() = 100_000
    override val speed: Int
        get() = 40
    override val wheels: Int
        get()=3

    override fun running() {
        println("Speed of ${name} is $speed Km/h")
    }
}
class Mehran(var name: String):Properties,DriftAble {
    override val color: String
        get() = "White"
    override val price: Int
        get() = 400_000
    override val speed: Int
        get() = 120
    override val wheels: Int
        get()=4

    override fun running() {
        println("Speed of ${name} is $speed Km/h")
    }

    override fun drift() {
       println("The ${name} can Drift")
    }
}
class Audi(var name: String):Properties,DriftAble,Nitro {
    override val color: String
        get() = "Black"
    override val price: Int
        get() = 800_0000
    override val speed: Int
        get() = 250
    override val wheels: Int
        get()=4

    override fun running() {
        println("Speed of ${name} is $speed Km/h")
    }

    override fun drift() {
        println("The ${name} can Drift")
    }

    override fun nitro() {
        println("The ${name} has Nitro")
    }
}