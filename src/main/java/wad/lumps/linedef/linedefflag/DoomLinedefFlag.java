package wad.lumps.linedef.linedefflag;

public enum DoomLinedefFlag implements LinedefFlag{

    BLOCKING     (0, 0x0001),
    BLOCKMONSTERS(1, 0x0002),
    TWOSIDED     (2, 0x0004),
    DONTPEGTOP   (3, 0x0008),
    DONTPEGBOTTOM(4, 0x0010),
    SECRET       (5, 0x0020),
    SOUNDBLOCK   (6, 0x0040),
    DONTDRAW     (7, 0x0080),
    MAPPED       (8, 0x0100);

    private int bit;
    private int hex;

    DoomLinedefFlag(int bit, int hex) {
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
