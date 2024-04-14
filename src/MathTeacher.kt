class MathTeacher(name: String, surname: String) : Teacher(name, surname) {

    override fun teach(){
        super.teach()
        println("I'm a math teacher!")
    }
}