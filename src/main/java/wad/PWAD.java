package wad;

import enums.WadType;

/**
 *
 */
public class PWAD implements WAD {

    private int numEntries;
    private int dirPtr;

    public PWAD() {

    }

    public WadType getType() {
        return WadType.PWAD;
    }

}
