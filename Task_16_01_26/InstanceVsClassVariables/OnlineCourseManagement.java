package Task_16_01_26.InstanceVsClassVariables;


class Course{
    private String courseName ;
    private int duration ;
    private int fee ;
    static private String instituteName="Chitkara University";

    Course(String courseName,int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    static void updateInstituteName(String instName){
        instituteName=instName;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Course Fee     : ₹" + fee);
        System.out.println("------------------------------");
    }
}
