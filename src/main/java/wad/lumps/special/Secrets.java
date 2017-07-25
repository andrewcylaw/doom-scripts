package wad.lumps.special;

import wad.lumps.thing.ThingId;
import wad.lumps.special.mapsecret.MapSecret;
import wad.lumps.special.mapsecret.SectorSecret;
import wad.lumps.special.mapsecret.ThingSecret;

import java.util.*;

public class Secrets {

    private Map<String, List<MapSecret>> secretHints;

    public Secrets() {
        this.secretHints = new HashMap<>();
    }

    public void addHint(MapSecret mapSecret) {
        this.secretHints.computeIfAbsent(mapSecret.getMapName(), val -> new ArrayList<>());
        this.secretHints.get(mapSecret.getMapName()).add(mapSecret);
    }

    // Trigger based map hints
    public void addHint(String mapName, String hint, ThingId thingId) {
        this.addHint(new ThingSecret(mapName, hint, thingId));
    }

    // Sector based map hints
    public void addHint(String mapName, String hint, int sectorNumber) {
        this.addHint(new SectorSecret(mapName, hint, sectorNumber));
    }

}
