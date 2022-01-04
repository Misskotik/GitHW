import java.util.List;
interface StudentInt {
    public String getName();
    List<String> getCourse();
    int getCourseNumber();
}
class Student implements StudentInt {

    private String name;
    List<String> course;
    protected int courseNumber;


    public Student(String name, List<String> course, int courseNumber) {
        this.name = name;
        this.course = course;
        this.courseNumber = courseNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getCourse() {
        return course;
    }
    public void setCourse(List<String> course) {
        this.course = course;
    }
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", courseNumber=" + courseNumber +
                '}';
    }
}









