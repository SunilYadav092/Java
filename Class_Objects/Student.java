class Student {
    int studentID;
    int marks;

    void calculateTotalMarks(int additionalMarks) {
        marks = marks + additionalMarks;
    }

    void displayMarks() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Total Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.studentID = 12345;
        student.marks = 50;

        student.calculateTotalMarks(30); // Adding 30 additional marks
        student.displayMarks();
    }
}
