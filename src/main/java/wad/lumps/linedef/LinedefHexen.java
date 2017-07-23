package wad.lumps.linedef;

import wad.lumps.Sidedef;

public class LinedefHexen extends Linedef {

    byte actionSpecial; // TODO: doom enum'd action specials
    byte[] actionArgs;

    private Sidedef rightSidedef;
    private Sidedef leftSidedef;

    public LinedefHexen(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);

        actionArgs = new byte[5];
    }

}
