package Sorter;

import java.util.Objects;
public class Student {
    private String matriculationNumber;
    private String name;
    public Student(String matriculationNumber, String name) {
        this.matriculationNumber = matriculationNumber;
        this.name = name;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }
    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student name" + name + "Student matriculationNumber" + matriculationNumber;
    }


    // Override equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(matriculationNumber, student.matriculationNumber) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculationNumber, name);
    }
}
