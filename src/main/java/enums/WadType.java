package enums;

public enum WadType {

    PWAD("PWAD"),
    IWAD("IWAD");

    private String type;

    WadType(String type){
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

}
