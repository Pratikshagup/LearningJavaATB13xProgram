package Task_6July;

public class Program7 {
    public static void main(String[] args) {
        Student1 st = new Student1();
        st.showInfo();
    }
}
class Student1{
     public void showInfo(){
         System.out.println("Public Access: Student Info");
     }

     void call(){
         showInfo();
     }
 }

 class ClassMonitor extends Student1{
    @Override
     public void showInfo(){
        super.showInfo();
    }

 }
