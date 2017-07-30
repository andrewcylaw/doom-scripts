package wad.lumps.linedef;

import wad.lumps.Vertex;
import wad.lumps.linedef.linedefflag.DoomLinedefFlag;

import java.util.ArrayList;
import java.util.List;

public class DoomLinedef extends Linedef {

    private Vertex beginningVertex;
    private Vertex endVertex;
    private List<DoomLinedefFlag> flags;
    private int sectorTag;
    private short rightSidedef;
    private short leftSidedef;

    public DoomLinedef(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
        this.flags = new ArrayList<>();
    }

    public int getSectorTag() {
        return sectorTag;
    }

    public void setSectorTag(int sectorTag) {
        this.sectorTag = sectorTag;
    }

    public short getRightSidedef() {
        return rightSidedef;
    }

    public void setRightSidedef(short rightSidedef) {
        this.rightSidedef = rightSidedef;
    }

    public short getLeftSidedef() {
        return leftSidedef;
    }

    public void setLeftSidedef(short leftSidedef) {
        this.leftSidedef = leftSidedef;
    }
}
