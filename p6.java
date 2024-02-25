public class p6 {
    private int enrollmentNo;
    private String name;

    public p6(int enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        p6 student1 = new p6(12, "jethalal");
        p6 student2 = new p6(35, "Bhide");
        p6 student3 = new p6(97, "Dr. Hathi");

        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 3 Name: " + student3.getName());
    }
}
