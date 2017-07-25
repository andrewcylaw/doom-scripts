package wad.lumps.linedef;

public class LinedefDoom extends Linedef {

    private short beginningVertex;
    private short endVertex;
    private short flags; // TODO: enumize this
    private int sectorTag;
    private short rightSidedef;
    private short leftSidedef;

    public LinedefDoom(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
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

    public short getFlags() {
        return flags;
    }

    public void setFlags(short flags) {
        this.flags = flags;
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
