package wad.lumps.linedef;

import wad.lumps.Lump;
import wad.lumps.Vertex;
import wad.lumps.linedef.linedefflag.LinedefFlag;

import java.util.ArrayList;
import java.util.List;

public abstract class Linedef extends Lump {

    private Vertex startVertex;
    private Vertex endVertex;
    private List<LinedefFlag> flags;

    public Linedef(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
        this.flags = new ArrayList<>();
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }

    public List<LinedefFlag> getFlags() {
        return flags;
    }

    public void setFlags(List<LinedefFlag> flags) {
        this.flags = flags;
    }

    public void addFlag(LinedefFlag flag) {
        this.flags.add(flag);
    }
}
