package ex_Static;

public class Lab_real {
    public static void main(String[] args) {

    }
}
class JavaATBx{
    static{
        System.out.println("Hello from static block");
    }
    {
        System.out.println("Hello from IIB block");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String phone;
    static String course_name ="JavaATB13x";
    static String mentor ="Pramod";

    static void do_Assignment(){
        System.out.println("Doing Assignment ");
    }
    static void attend_class(){
        System.out.println("Attend class");
    }
    void how_they_do(){
        System.out.println("How they do assignment is different");
    }

}
