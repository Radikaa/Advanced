package softUni;

public class Student {
    private String firstname;
    private String lastName;
    private String bestCourse;

    public Student(String firstname, String lastName, String bestCourse) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.bestCourse = bestCourse;
    }

    @Override
    public String toString() {
        return String.format("Student: %s %s, Best Course = %s", this.lastName, this.lastName, this.bestCourse);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBestCourse() {
        return bestCourse;
    }

    public void setBestCourse(String bestCourse) {
        this.bestCourse = bestCourse;
    }
}