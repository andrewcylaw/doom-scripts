package wad.lumps;

public class Vertex {

    // private int number -> numbered ordering by the map?
    private short xOffset;
    private short yOffeset;

    public Vertex(short xOffset, short yOffeset) {
        this.xOffset = xOffset;
        this.yOffeset = yOffeset;
    }

    public short getxOffset() {
        return xOffset;
    }

    public void setxOffset(short xOffset) {
        this.xOffset = xOffset;
    }
}
