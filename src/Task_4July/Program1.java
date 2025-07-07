package Task_4July;

public class Program1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.showDetails();
        testDefault tD = new testDefault();
        tD.var();
    }
}

class Student{
    int Student_ID = 4567;
    void showDetails()
    {
        System.out.println("Showing Details");
    }
    Student(){
        System.out.println("Student contructor");
    }
}


class testDefault extends Student{
    @Override
    void showDetails(){
        super.showDetails();
    }
    testDefault(){
        super();
    }
    void var(){
        System.out.println(super.Student_ID);
    }
}