package wad.lumps.thing;

public class ThingDoom extends Thing {

    private short xPos;
    private short yPos;
    private short angle;
    private short type; // TODO: enumize this
    private short spawnFlags;

    public ThingDoom(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
    }

    public short getxPos() {
        return xPos;
    }

    public void setxPos(short xPos) {
        this.xPos = xPos;
    }

    public short getyPos() {
        return yPos;
    }

    public void setyPos(short yPos) {
        this.yPos = yPos;
    }

    public short getAngle() {
        return angle;
    }

    public void setAngle(short angle) {
        this.angle = angle;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public short getSpawnFlags() {
        return spawnFlags;
    }

    public void setSpawnFlags(short spawnFlags) {
        this.spawnFlags = spawnFlags;
    }
}
