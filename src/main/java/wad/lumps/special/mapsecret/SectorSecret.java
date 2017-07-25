package wad.lumps.special.mapsecret;

public class SectorSecret implements MapSecret {

    private String mapName;
    private String hint;
    private int sectorNumber;

    public SectorSecret(String mapName, String hint, int sectorNumber){
        this.mapName = mapName;
        this.hint = hint;
        this.sectorNumber = sectorNumber;
    }

    @Override
    public String getMapName() {
        return this.mapName;
    }

    @Override
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    @Override
    public String getHint() {
        return this.hint;
    }

    @Override
    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getSectorNumber() {
        return this.sectorNumber;
    }

    public void setSectorNumber(int sectorNumber) {
        this.sectorNumber = sectorNumber;
    }
}
