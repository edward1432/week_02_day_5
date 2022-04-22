public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Edward", 24, "St Albans", "Newcastle");

        Cohort cohort = new Cohort("T-Techs");

        cohort.addStudent(student1);

        System.out.println(cohort.getStudents().get(0).getName());

    }
}
