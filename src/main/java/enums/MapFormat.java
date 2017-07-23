package enums;

public enum MapFormat {

    // Just thinking ahead for the future
    DOOM("Doom"),
    HEXEN("Hexen"),
    UDMF("UDFM");

    private String type;

    MapFormat(String type){
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
