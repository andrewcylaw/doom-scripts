package wad.lumps.linedef.actionspecial.ceiling;

import wad.lumps.linedef.actionspecial.ActionSpecial;
import wad.lumps.linedef.actionspecial.ActionSpecialId;

public interface CeilingActionSpecial extends ActionSpecial {

    ActionSpecialId getId();

    int getTag();

    void setTag(int tag);

}
