package wad.lumps.linedef.actionspecial.types;

import wad.lumps.linedef.actionspecial.ActionSpecialId;

public abstract class ByValue {

    private ActionSpecialId id;
    private int tag;
    private int speed;
    private int height;

    public ByValue(ActionSpecialId id, int tag, int speed, int height) {
        this.id = id;
        this.tag = tag;
        this.speed = speed;
        this.height = height;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ActionSpecialId getId() {
        return this.id;
    }

}
