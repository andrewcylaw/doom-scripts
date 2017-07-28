package wad.lumps.linedef;

import wad.lumps.linedef.linedefflag.DoomLinedefFlag;

import java.util.ArrayList;
import java.util.List;

public class DoomLinedef extends Linedef {

    private short beginningVertex;
    private short endVertex;
    private List<DoomLinedefFlag> flags; // TODO: enumize this
    private int sectorTag;
    private short rightSidedef;
    private short leftSidedef;

    public DoomLinedef(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
        this.flags = new ArrayList<>();
    }

    public short getBeginningVertex() {
        return beginningVertex;
    }

    public void setBeginningVertex(short beginningVertex) {
        this.beginningVertex = beginningVertex;
    }

    public short getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(short endVertex) {
        this.endVertex = endVertex;
    }

    public List<DoomLinedefFlag> getFlags() {
        return flags;
    }

    public void setFlags(List<DoomLinedefFlag> flags) {
        this.flags = flags;
    }

    public void addFlag(DoomLinedefFlag flag) {
        this.flags.add(flag);
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
