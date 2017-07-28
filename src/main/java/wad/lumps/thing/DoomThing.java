package wad.lumps.thing;

import wad.lumps.thing.thingflag.DoomFlag;

import java.util.ArrayList;
import java.util.List;

public class DoomThing extends Thing {

    private short xPos;
    private short yPos;
    private short angle;
    private short type; // TODO: enumize this
    private List<DoomFlag> spawnFlags;

    public DoomThing(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
        this.spawnFlags = new ArrayList<>();
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

    public List<DoomFlag> getSpawnFlags() {
        return spawnFlags;
    }

    public void setSpawnFlags(List<DoomFlag> spawnFlags) {
        this.spawnFlags = spawnFlags;
    }

    public void addSpawnFlag(DoomFlag spawnFlag) {
        this.spawnFlags.add(spawnFlag);
    }
}
