package wad.lumps.linedef.actionspecial.ceiling.byvalue;

import wad.lumps.linedef.actionspecial.ActionSpecialId;
import wad.lumps.linedef.actionspecial.types.ByValue;
import wad.lumps.linedef.actionspecial.ceiling.CeilingActionSpecial;

public class CeilingRaiseByValueTimes8 extends ByValue implements CeilingActionSpecial  {

    public CeilingRaiseByValueTimes8(int tag, int speed, int height) {
        super(ActionSpecialId.CEILING_RAISE_BY_VALUE_TIMES_8, tag, speed * 8, height);
    }
}
