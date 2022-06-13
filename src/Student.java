public class Student {

    private int grade;
    private boolean smart;

    public Student(int grade, boolean smart)  {
        this.grade = grade;
        this.smart = smart;
    }

    public void printGrade(){
        System.out.println(grade);
    }

    public void printSmart(){
        System.out.println(smart);
    }

    public int getGrade(){
        return grade;
    }

    public boolean getSmart(){
        return smart;
    }

}