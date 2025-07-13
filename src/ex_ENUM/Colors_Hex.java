package ex_ENUM;

public enum Colors_Hex {
    Red_Hex("#00FF0"),
    Blue_Hex("#4FGG0"),
    Yellow_Hex("#F0F011");

    private String hexCode;

    Colors_Hex(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
