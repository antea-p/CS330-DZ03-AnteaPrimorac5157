package rs.ac.metropolitan.cs330_dz03_anteaprimorac_5157

import kotlin.random.Random

fun main() {
    val attendance = Attendance()

    for (week in 1..15) {
        println("\nOdsutni u nastavnoj nedelji $week")
        attendance.getStudents().forEach { student ->
            if (Random.nextBoolean()) {
                attendance.markAttendance(student)
            } else {
                println("${student.index} ${student.firstName} ${student.lastName}")
            }
        }
    }

//    println("\nUkupno prisustvo:")
//    println(attendance)
}
