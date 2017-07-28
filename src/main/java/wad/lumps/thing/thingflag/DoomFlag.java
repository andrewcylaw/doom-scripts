package wad.lumps.thing.thingflag;

public enum DoomFlag {

    SKILL_1_AND_2 (0, 0x0001),
    SKILL_3       (1, 0x0002),
    SKILL_4_AND_5 (2, 0x0004),
    DEAF          (3, 0x0008),
    MULTIPLAYER   (4, 0x0010);

    private int bit;
    private int hex;

    DoomFlag(int bit, int hex) {
        this.bit = bit;
        this.hex = hex;
    }

    public int getBit() {
        return this.bit;
    }

    public int getHex() {
        return this.hex;
    }
}
