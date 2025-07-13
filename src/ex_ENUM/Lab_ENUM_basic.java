package ex_ENUM;

public class Lab_ENUM_basic {
    public static void main(String[] args) {
        System.out.println(Day.Friday);
        System.out.println(Project.vwo);
    }
}

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
enum Project{
    google, vwo, api, tester
}