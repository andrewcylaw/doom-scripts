package wad.lumps.linedef.actionspecial.ceiling.byvalue;


import wad.lumps.linedef.actionspecial.ActionSpecialId;
import wad.lumps.linedef.actionspecial.types.ByValue;
import wad.lumps.linedef.actionspecial.ceiling.CeilingActionSpecial;

public class CeilingRaiseByValue extends ByValue implements CeilingActionSpecial {

    public CeilingRaiseByValue(int tag, int speed, int height) {
        super(ActionSpecialId.CEILING_RAISE_BY_VALUE, tag, speed, height);
    }

}
