package wad.lumps;

/**
 * Raw lump data commons.
 */
public class Lump {

    private int startPtr;
    private int lumpSize;
    private String name;

    public Lump(int startPtr, int lumpSize, String name) {
        this.startPtr = startPtr;
        this.lumpSize = lumpSize;
        this.name = name;
    }

    public int getStartPtr() {
        return startPtr;
    }

    public void setStartPtr(int startPtr) {
        this.startPtr = startPtr;
    }

    public int getLumpSize() {
        return lumpSize;
    }

    public void setLumpSize(int lumpSize) {
        this.lumpSize = lumpSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lump{" +
                "startPtr=" + startPtr +
                ", lumpSize=" + lumpSize +
                ", name='" + name + '\'' +
                '}';
    }
}
