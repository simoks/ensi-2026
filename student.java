public class student {
    private String name;
    private int age;       

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }   
 } 

