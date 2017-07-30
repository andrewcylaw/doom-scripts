package wad.lumps.sector;

import wad.lumps.sector.sectorspecial.DoomSectorSpecial;

public class DoomSector extends Sector {

    private DoomSectorSpecial sectorSpecial;

    public DoomSector(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
    }

    public void setSectorSpecial(DoomSectorSpecial sectorSpecial) {
        this.sectorSpecial = sectorSpecial;
    }

    public DoomSectorSpecial getSectorSpecial() {
        return this.sectorSpecial;
    }
}
