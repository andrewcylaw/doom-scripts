package wad.lumps.special.mapsecret;

import wad.lumps.thing.ThingId;

/**
 * A class representing a secret hint for a trigger.
 */
public class ThingSecret implements MapSecret {

    private String mapName;
    private String hint;
    private ThingId thingId;

    public ThingSecret(String mapName, String hint, ThingId thingId) {
        this.mapName = mapName;
        this.hint = hint;
        this.thingId = thingId;
    }

    public ThingSecret(String mapName, String hint, int thingId) {
        this(mapName, hint, ThingId.get(thingId));
    }

    @Override
    public String getHint() {
        return this.hint;
    }

    @Override
    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public String getMapName() {
        return this.mapName;
    }

    @Override
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public ThingId getThingId() {
        return this.thingId;
    }

    public void setThingId(ThingId thingId) {
        this.thingId = thingId;
    }

    public void setThingId(int id) {
        this.setThingId(ThingId.get(id));
    }
}
