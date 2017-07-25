package wad.lumps.thing;

import wad.lumps.Id;

public class ThingId implements Id {

    private int id;

    public ThingId(int id) {
        this.id = id;
    }

    public ThingId getThingId() {
        return this;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    // Return a generic ThingId
    public static ThingId get(int id) {
        return new ThingId(id);
    }
}
