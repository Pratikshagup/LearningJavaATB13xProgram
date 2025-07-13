package ex_ENUM;

public enum APIurl {
    vwo("https://app.vwo.com/"),
    google("https://google.com/"),
    katalon("https://www.katalon.com");

    private String url;
    APIurl(String url){
        this.url =url;
    }
    String getUrl(){
        return this.url;
    }

}
