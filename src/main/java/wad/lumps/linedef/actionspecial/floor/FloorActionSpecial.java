package wad.lumps.linedef.actionspecial.floor;

import wad.lumps.linedef.actionspecial.ActionSpecial;
import wad.lumps.linedef.actionspecial.ActionSpecialId;

public interface FloorActionSpecial extends ActionSpecial {

    ActionSpecialId getId();

    int getTag();

    void setTag(int tag);

}
