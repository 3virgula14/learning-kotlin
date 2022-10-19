class Dog{
    var name:String? = null
}

fun main(){
    val pestinha:Dog = Dog()
    pestinha.name = "Pestinha"
    println("Ola ${pestinha.name}")
}
