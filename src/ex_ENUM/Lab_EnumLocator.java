package ex_ENUM;

public class Lab_EnumLocator {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocator());
        System.out.println(Locators.page_input_password.getLocator());

        System.out.println(APIurl.vwo.getUrl());
        System.out.println(APIurl.katalon.getUrl());
    }
}
