package wad.lumps.linedef;

import wad.lumps.Lump;
import wad.lumps.Vertex;

public abstract class Linedef extends Lump {

    private Vertex startVertex;
    private Vertex endVertex;
    private short flags;

    public Linedef(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
    }
}
