public class Student {

    private String name;
    private int age;
    private String location;
    private String university;


    //    Constructor method
//    Always need to be public, or you cannot create an instance of the object outside of the class
    public Student(String name, int age, String location, String university) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.university = university;
    }

    // Getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    // Behaviours

    public boolean livesInLondon(){
        if (location.equals("London")){
            return true;
        } else return false;
    }

    public void countToNumber(int number){
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
