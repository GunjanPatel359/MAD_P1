open class Person(firstname: String,lastname:String,ageParams:Int) {
    var firstName: String=firstname
    var lastName: String=lastname
    var age: Int=ageParams
    constructor(firstname: String, lastname: String):this(firstname,lastname, 18) {

    }
}
class Student(firstname: String,lastname: String,ageParams: Int,enrollmentno: String,branchParams: String,classParams:String,labBatchParams:String) : Person(firstname, lastname, ageParams) {
    var enrollmentNo: String=enrollmentno
    var branch: String=branchParams
    var classname: String=classParams
    var labBatch: String=labBatchParams
    constructor(firstname: String, lastname: String) :this(firstname,lastname,18,"not assigned","not assigned","not assigned","not assigned") {
    }
    override fun toString(): String {
        return "name:$firstName $lastName age:$age Enrollmentno:$enrollmentNo branch:$branch class$classname batch:$labBatch"
    }

}
fun main() {
    val students = listOf(
        Student("Alice", "Smith", 20, "EN001", "Computer Science", "A", "1"),
        Student("Bob", "Johnson", 21, "EN002", "Electrical Engineering", "B", "2"),
        Student("Charlie", "Brown", 19, "EN003", "Mechanical Engineering", "B", "1"),
        Student("David", "Lee", 22, "EN004", "Civil Engineering", "A", "3"),
        Student("Emily", "Davis", 20, "EN005", "Information Technology", "C", "4")
    )
    students.forEach { println(it) }
}
