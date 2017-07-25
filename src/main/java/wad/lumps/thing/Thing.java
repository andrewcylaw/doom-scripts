package wad.lumps.thing;

import wad.lumps.Lump;

public abstract class Thing extends Lump {

    public Thing(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
    }

}
