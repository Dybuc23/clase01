import java.util.StringJoiner
import kotlin.math.pow



data class Person(
    val id: String,
    val fistName: String,
    val lastName: String,
    val country: String
) {
    fun getName() = "$fistName $lastName"
}

fun main() {
    val person = Person("1", "Daniel", "Soto","Perú")
    val person1 = Person("1", "Daniel", "Soto",  "Perú")
    println(person == person1)
    println(person.getName())

//    //componentN
//    println(person.component1())
//    println(person.component2())
//    println(person.component3())
//    println(person.component4())

    val (id, fistName, lastName, country) = person // destructuring declaration
    println("$id $fistName $lastName $country")
}

/*
    val downloader = Downloader()
    downloader.downloadListener = object : DownloadListener {
        override fun onDownloadStarted() {
            println("Download started")
        }

        override fun onDownloadComplete(file: String) {
            println("$file downloaded")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% downloaded")
        }
    }
    downloader.downloadFile("newSong.mp3")
    ---------------------------------------------
    class App: DownloadListener {
    override fun onDownloadStarted() {
        println("Download started")
    }

    override fun onDownloadComplete(file: String) {
        println("$file downloaded")
    }

    override fun onProgressUpdate(progress: Int) {
        println("$progress% downloaded")
    }

}
    val downloaderListener = App()
    val downloader = Downloader()
    downloader.downloadListener = downloaderListener
    downloader.downloadFile("newSong.mp3")
    ---------------------------------
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "Brown")
    val info = coffeeMachine.machineInfo();
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee)
    println(info)
    val simpleCoffeeMachine = CoffeeMachine(2000.0, "Black")
    val coffe2 = simpleCoffeeMachine.makeCoffee("Espresso")
    print(coffe2)
    --------------------------------------------------------
    coffeeMachine.makeCoffee();
    coffeeMachine.makeCapuccino();
    -----------------
    val box1 = Box(5,15,6);
    val box2 = Box();
    -----------------------
    val box1 = Box();
    val box1 = Box();

    println("Height: ${box1.heigth}");
    println("Width: ${box1.width}");
    println("Length: ${box1.length}");
    println("Volume: ${box1.volume}");
    box1.boxName = "Sho"
    println("Box name: ${box1.boxName}");
    box1.open();
    box1.fillContents();
    -------------------------------
    val price1 = Price();
    val price2 = Price();
    val price3 = Price();

    price1.openPurchase();

    println(" 3 Computers: ${(price1.priceofComputer)*3}");
    println(" 3 Keyboards: ${(price2.priceofKeyboard)*3}");
    println(" 6 Mouses: ${(price3.priceofMouse)*6}");

    price2.close();
     */

    /*
    // Boolean size 1bit false/true
    // Char size 16bit 'a' to 'z' '/n' '/101'
    /*Numbers
    *Byte size 8bit -127 to 128
    *Double size 64bit 3.4d
    *Float size 32bit 3.4f
    *Int size 32bit -2 -1 0 1 2
    *Long size 64bit -2l -1l 0l 1l 2l
    *Short size 16bit none
     */
    // String "Hello"
    // Array of int[1,2,3]
    //println("Hello")
    val dayofBirth : Int = 23
    val monthofBirth : Int = 8
    println("My birthday is $dayofBirth/$monthofBirth")
    println("My birthday is: " + dayofBirth + "/" + monthofBirth)
    var name: String = "Jhonatan"
    var lastname: String = "Palacios"
    println("My name is ${name.uppercase()} ${lastname.lowercase()}")
    println("My name is: " + name + " " + lastname)
    name = "Victor"
    println("My name is $name $lastname")

    // Operaciones Matematicas
    // Suma
    println(2+2)
    // Resta
    println(2-2)
    // Multiplicacion
    println(2*2)
    // Division
    println(2/2)
    // Modulos
    println(2%2)
    // Operacion Matematica
    println(1 + (9 / 3) * 2)
    // Potencia
    println(2.0.pow(2))
    // Comparacion e igualdad operadores
    // Igualdad
    println(2 == 2)
    // Desigualdad / Diferencia
    println(2 != 2)
    // Mayor que
    println(2 > 2)
    // Menor que
    println(2 < 2)
    // Mayor o igual que
    println(2 >= 2)
    // Menor o igual que
    println(2 <= 2)

    var anyNumber: Int = 0
    // Operaciones de asignacion
    anyNumber += 10
    anyNumber -= 2
    anyNumber *= 2
    anyNumber /= 2
    anyNumber %=2
    // Incrementador y decrementador
    anyNumber ++
    anyNumber --
    println(anyNumber)
    var isTrue : Boolean = true
    var isFalse : Boolean = false
    // Operadores logicos
    // AND
    println(isTrue && isFalse)
    // OR
    println(isTrue || isFalse)
    // NOT
    println(!isTrue)
    helloWorld()
    var myNumber : Int = dobleTheValue(2)
    println(myNumber)
    favoriteFoodPrompt("Jhona","Chaufa")
    favoriteFoodPrompt()
}

fun helloWorld(){
    println("Hello World")
}

fun dobleTheValue(numberValue: Int): Int{
    return numberValue * 2
}

fun favoriteFoodPrompt(name: String="Anonymous", favoriteFood: String="Pizza"): Unit{
    println("$name's favorite food is $favoriteFood")
}

     */