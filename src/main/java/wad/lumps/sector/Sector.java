package wad.lumps.sector;

import com.sun.prism.Texture;

public class Sector {

    private int floorHeight;
    private int ceilHeight;

    private Texture floorTex;
    private Texture ceilTex;

    private int lightLevel;
    private int sectorSpecial;
    private SectorId sectorTag;

    public SectorId getSectorTag() {
        return this.sectorTag;
    }

    public void setSectorTag(SectorId id) {
        this.sectorTag = id;
    }

    public void setSectorTag(int id) {
        this.setSectorTag(new SectorId(id));
    }

}
