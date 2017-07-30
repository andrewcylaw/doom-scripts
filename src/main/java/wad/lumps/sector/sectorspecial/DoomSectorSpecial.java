package wad.lumps.sector.sectorspecial;

public enum DoomSectorSpecial implements SectorSpecial {

    NORMAL(0),
    BLINK_RANDOM(1),
    BLINK_HALF_SECOND(2),
    BLINK_ONE_SECOND(3),
    BLINK_HALF_SECOND_DAMAGE_20(4),
    DAMAGE_10(5),
    DAMAGE_5(7),
    OSCILLATE(8),
    SECRET(9),
    CEIL_CLOSE_AFTER_30_SECONDS(10),
    DAMAGE_20_END_LEVEL_ON_DEATH(11),
    BLINK_HALF_SECOND_SYNCHRONIZED(12),
    BLINK_ONE_SECOND_SYNCHRONIZED(13),
    CEIL_OPEN_AFTER_300_SECONDS(14),
    DAMAGE_20(16),
    LIGHT_FLICKER(17);

    private int type;

    DoomSectorSpecial(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
