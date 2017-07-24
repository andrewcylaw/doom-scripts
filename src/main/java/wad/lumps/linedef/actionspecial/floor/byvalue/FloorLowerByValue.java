package wad.lumps.linedef.actionspecial.floor.byvalue;

import wad.lumps.linedef.actionspecial.ActionSpecialId;
import wad.lumps.linedef.actionspecial.types.ByValue;
import wad.lumps.linedef.actionspecial.floor.FloorActionSpecial;

public class FloorLowerByValue extends ByValue implements FloorActionSpecial {

    public FloorLowerByValue(int tag, int speed, int height) {
        super(ActionSpecialId.FLOOR_LOWER_BY_VALUE, tag, speed, height);
    }


}
