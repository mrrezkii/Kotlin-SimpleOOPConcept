class Student{
    private var nim: String? = null
    private var name: String? = null
    private var age: Int? = null


    fun getNim(): String? {
        return nim
    }
    fun setNim(value: String){
        nim = value
    }

    fun getName(): String? {
        return name
    }
    fun setName(value: String){
        name = value
    }

    fun getAge(): Int? {
        return age
    }
    fun setAge(value: Int?){
        age = value
    }


}
fun main(){
    val student = Student()
    student.setNim("1202190044")
    student.setName("Rezki")
    student.setAge(21)
    println(student.getNim())
    println(student.getName())
    println(student.getAge())
}