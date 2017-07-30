package wad.lumps.sector;

import com.sun.prism.Texture;
import wad.lumps.Lump;
import wad.lumps.sector.sectorspecial.SectorSpecial;

public abstract class Sector extends Lump {

    private int floorHeight;
    private int ceilHeight;

    private Texture floorTex;
    private Texture ceilTex;

    private int lightLevel;
    private SectorSpecial sectorSpecial;
    private SectorId sectorTag;

    public Sector(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
    }

    public SectorId getSectorTag() {
        return this.sectorTag;
    }

    public void setSectorTag(SectorId id) {
        this.sectorTag = id;
    }

    public void setSectorTag(int id) {
        this.setSectorTag(new SectorId(id));
    }

    public int getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(int floorHeight) {
        this.floorHeight = floorHeight;
    }

    public int getCeilHeight() {
        return ceilHeight;
    }

    public void setCeilHeight(int ceilHeight) {
        this.ceilHeight = ceilHeight;
    }

    public Texture getFloorTex() {
        return floorTex;
    }

    public void setFloorTex(Texture floorTex) {
        this.floorTex = floorTex;
    }

    public Texture getCeilTex() {
        return ceilTex;
    }

    public void setCeilTex(Texture ceilTex) {
        this.ceilTex = ceilTex;
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public void setLightLevel(int lightLevel) {
        this.lightLevel = lightLevel;
    }

    public SectorSpecial getSectorSpecial() {
        return sectorSpecial;
    }

    public void setSectorSpecial(SectorSpecial sectorSpecial) {
        this.sectorSpecial = sectorSpecial;
    }
}
