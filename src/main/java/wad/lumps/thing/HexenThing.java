package wad.lumps.thing;

import wad.lumps.linedef.actionspecial.ActionSpecial;

public class HexenThing extends Thing {

    private ThingId thingId;
    private short xPos;
    private short yPos;
    private short zPos;
    private short angle;
    private short type;
    private short spawnFlags;
    private ActionSpecial actionSpecial;
    private byte[] actionArgs;

    public HexenThing(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);
    }

    public ThingId getThingId() {
        return thingId;
    }

    public void setThingId(short thingId) {
        this.setThingId(ThingId.get(thingId));
    }

    public void setThingId(ThingId thingId) {
        this.thingId = thingId;
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

    public short getzPos() {
        return zPos;
    }

    public void setzPos(short zPos) {
        this.zPos = zPos;
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

    public ActionSpecial getActionSpecial() {
        return actionSpecial;
    }

    public void setActionSpecial(ActionSpecial actionSpecial) {
        this.actionSpecial = actionSpecial;
    }

    public byte[] getActionArgs() {
        return actionArgs;
    }

    public void setActionArgs(byte[] actionArgs) {
        this.actionArgs = actionArgs;
    }
}
