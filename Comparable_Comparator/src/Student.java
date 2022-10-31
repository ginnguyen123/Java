public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;
    public Student(){};
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                +"Ages: " + this.age
                +"Adress: " + this.address;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
