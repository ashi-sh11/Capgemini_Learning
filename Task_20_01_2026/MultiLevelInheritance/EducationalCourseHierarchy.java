package Task_19_01_2026.MultiLevelInheritance;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                12,
                "Udemy",
                true,
                20000,
                20
        );

        System.out.println("=== Course Details ===");
        course.displayInfo();
    }
}

class Course{
    String courseName ;
    int duration;

    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    public void displayInfo(){
        System.out.println("Course name is : "+courseName);
        System.out.println("Duration "+ duration+" month");
    }
}

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName,int duration ,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Platform name is : "+platform);
        System.out.println("Is Recorded : "+(isRecorded?"Yes":"No"));
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    double discount ;

    PaidOnlineCourse(String courseName,int duration ,String platform,boolean isRecorded,int fee ,double discount){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Course fee : "+fee);
        System.out.println("Final fee after discount : "+(fee-(fee *discount/100)));
    }
}