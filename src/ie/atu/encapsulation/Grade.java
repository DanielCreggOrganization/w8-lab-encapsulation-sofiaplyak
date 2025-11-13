package ie.atu.encapsulation;

public class Grade {
    private String studentName;
    private int numericGrade;
    private String courseCode;


    /*  TO DO: Add constructor that uses validation helpers */
    public Grade(String studentName, int numericGrade, String courseCode){
        this.studentName = studentName;
        this.numericGrade = numericGrade;
        this.courseCode = courseCode;
    }
    // TO DO: Add getters for all fields
        public String getStudentName(){
            return studentName;
        }
        public int getNumericGrade(){
            return numericGrade;
        }
        public String getCourseCode(){
            return courseCode;
        }
    // TO DO: Add setters that use validation helpers
        public void setStudentName(String studentName){
            this.studentName = validateStudentName(studentName);
        }
        public void setNumericCode(int numericGrade){
            this.numericGrade = validateNumericGrade(numericGrade);
        }
        public void setCourseCode(String courseCode){
            this.courseCode = validateCourseCode(courseCode);
        }
    // TO DO: Add validation helper methods (private)
        private String validateStudentName(String name){
            if (name == null || name.isEmpty()){
                System.out.println("You must insert valid student name!");
                return null;
            }else
            return name;
        }

        private int validateNumericGrade(int grade){
            if ( grade < 0 || grade > 100){
                System.out.println("ENTER RIGHT FORMAT!!!");
                return 0;
            }else
            return grade;
        }

        private String validateCourseCode(String code){
            if(code == null || code.trim().isEmpty()){
                System.out.println("ENTER THE RIGHT CODE BEACH!!!!!");
                return null;
            }else
            return code;
        }
}
