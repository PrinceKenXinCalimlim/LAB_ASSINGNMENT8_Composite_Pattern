public class UniversityApp {
    public static void main(String[] args) {
        // Students
        Student s1 = new Student("Nicole", "S001", 10000);
        Student s2 = new Student("Harry", "S002", 12000);
        Student s3 = new Student("Ethan", "S003", 15000);

        // Teachers
        Teacher t1 = new Teacher("Dr. Smith", "Intelligent Systems", 50000);
        Teacher t2 = new Teacher("Prof. Jones", "Application Development", 55000);

        // Departments
        Department csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        Department itDept = new Department("Information Technology");
        itDept.add(t2);
        itDept.add(s3);

        // College of Informatics and Computing Studies
        College cicsCollege = new College("College of Informatics and Computing Studies");
        cicsCollege.add(csDept);
        cicsCollege.add(itDept);

        // Display Details
        System.out.println("Displaying University Structure:");
        cicsCollege.displayDetails();

        // Total Students
        System.out.println("\nTotal Students: " + cicsCollege.getStudentCount());

        // Total Budget
        System.out.println("Total Budget: " + cicsCollege.getBudget());
    }
}
