fun main() {
    val teacher = Teacher("Zbigniew", "Wysocki")
    teacher.eat()
    teacher.sleep()

    teacher.teach()

    val person = Person("Joanna", "Kaszubska")
    person.eat()
    person.sleep()

    val footballer = Footballer("Robert", "Lewandowski")
    footballer.eat()
    footballer.sleep()
    footballer.playFootball()

    val personList = listOf(teacher, person, footballer)
    for(p in personList) {
        p.eat()
    }

    val mathTeacher = MathTeacher("Olga", "Pietrawska")
    mathTeacher.teach()

}