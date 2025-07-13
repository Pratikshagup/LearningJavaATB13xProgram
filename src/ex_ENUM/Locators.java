package ex_ENUM;

public enum Locators {
    page_input_email("#email"),
    page_input_password("#password"),
    page_button("#button");

    private String locator;
    public String getLocator() {
        return locator;
    }

    Locators(String locator) {
        this.locator = locator;
    }
}
