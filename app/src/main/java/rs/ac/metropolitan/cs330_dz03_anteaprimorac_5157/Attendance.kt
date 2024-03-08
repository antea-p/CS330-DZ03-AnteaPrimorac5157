package rs.ac.metropolitan.cs330_dz03_anteaprimorac_5157

data class Student(val index: String, val firstName: String, val lastName: String)

class Attendance {
    private val attendanceRecord: MutableMap<Student, Int?> = mutableMapOf(
        Student("12345", "Dragiša", "Dragić") to null,
        Student("23456", "Jovana", "Petrović") to null,
        Student("34567", "Marko", "Nikolić") to null,
        Student("45678", "Ana", "Đorđević") to null,
        Student("56789", "Nikola", "Jovanović") to null,
        Student("67890", "Marija", "Lukić") to null,
        Student("78901", "Stefan", "Milić") to null,
        Student("89012", "Ivana", "Todorović") to null,
        Student("90123", "Aleksandar", "Bogdanović") to null,
        Student("01234", "Milica", "Zdravković") to null,
        Student("11235", "Luka", "Ristić") to null,
        Student("21236", "Jelena", "Gajić") to null,
        Student("31237", "Dušan", "Pavlović") to null,
        Student("41238", "Katarina", "Marković") to null,
        Student("51239", "Milan", "Radičević") to null,
        Student("61240", "Sofija", "Vasić") to null
    )

    fun addStudent(student: Student) {
        attendanceRecord[student] = null
    }

    fun markAttendance(student: Student) {
        // ako student već ima prisustvo, inkrementiraj; inače, ako je to prvo prisustvo, inicijaliziraj na 1
        attendanceRecord[student]?.let { currentAttendance ->
            attendanceRecord[student] = currentAttendance + 1
        } ?: run {
            attendanceRecord[student] = 1
        }
    }

    fun getStudents(): List<Student> {
        return attendanceRecord.keys.toList()
    }

    override fun toString(): String {
        return attendanceRecord.entries.joinToString(separator = "\n") {
            "${it.key.index} ${it.key.firstName} ${it.key.lastName} - Prisustvo: ${it.value ?: "Bez ijednog prisustva"}"
        }
    }
}
