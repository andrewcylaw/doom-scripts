package wad.lumps.sector;

import wad.lumps.Id;

public class SectorId implements Id {

    private int sectorId;

    public SectorId(int id) {
        this.sectorId = id;
    }

    @Override
    public int getId() {
        return this.sectorId;
    }

    @Override
    public void setId(int id) {
        this.sectorId = id;
    }
}
