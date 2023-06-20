package softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {
    private int capacity;
    private List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public int getCount() {
        return data.size();
    }
    //	Returns "Added student {firstName} {lastName}." –  if the student is successfully added.
    //	Returns "Student is already in the hall." –  if the student is already in the hall.

    public String insert(Student student) {
        if (this.data.size() < this.capacity) {
            if (this.data.contains(student)) {
                return "Student is already in the hall.";
            }
            this.data.add(student);
            return "Added student " + student.getFirstname() + ", " + student.getLastName();        }
        return "The hall is full.";
    }


    public String remove(Student student) {
        for (Student studentData : data) {
            if (!data.contains(student)) {
                return "Student not found.";
            } else {
                data.remove(student);
                return String.format("Removed student %s %s.", studentData.getFirstname(), student.getLastName());
            }
        }
        return null;
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : data) {
            if (student.getFirstname().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder("Hall size: " + data.size());
        for (Student student : data) {
            sb.append(System.lineSeparator());
            sb.append("Student: " + student.getFirstname() + " " + student.getLastName() + " ," + "Best Couse = " + student.getBestCourse());
        }
        return sb.toString();
    }
}