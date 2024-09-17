class Car(
    var model: String,
    var owner: String,
    var milesDriven: Int? = null,
    var originalPrice: Double,
    var currentPrice: Double,
) {
    constructor(
        model: String,
        owner: String,
        milesDriven: Int? = null,
        originalPrice: Double,
    ) : this(model,owner,milesDriven,originalPrice,originalPrice*0.65) {

    }
    fun displayCarInfo() {
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
        println("Original Price: $originalPrice")
        println("Current Price: $currentPrice")
        println("----------------------------------------------")
        println("----------------------------------------------")
        println("")
    }
}
fun main(){
    val car1 = Car(model="Sedan",owner="Gunjan Patel",milesDriven=100,originalPrice=1000000.00,currentPrice=900000.00)
    car1.displayCarInfo()
    val car2 = Car(model="SUV",owner="villy winse",milesDriven=10,originalPrice=10000.00)
    car2.displayCarInfo()
}

