package homework_303_13_1;

public class course {
    private String code;
    private String course_name;
    private String instructor_name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public course(String code,  String course_name, String instructor_name) {
        this.code = code;
        this.course_name = course_name;
        this.instructor_name = instructor_name;
    }


}
