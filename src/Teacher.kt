open class Teacher(name: String, surname:String) : Person(name, surname) {

    open fun teach(){
        println("Teacher $name $surname is teaching")
    }
}