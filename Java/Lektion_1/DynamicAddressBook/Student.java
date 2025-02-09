package Lektion_1.DynamicAddressBook;

public class Student extends Person {
    int matriculationNr;
    int semester;

    Student(String name, int birthday, int matriculationNr, int semester) {
        super(name, birthday);
        this.matriculationNr = matriculationNr;
        this.semester = semester;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Matrikelnummer: " + matriculationNr + ", Semester: " + semester);
    }

}