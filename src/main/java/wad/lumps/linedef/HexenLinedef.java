package wad.lumps.linedef;

import wad.lumps.Sidedef;
import wad.lumps.linedef.actionspecial.ActionSpecial;

public class HexenLinedef extends Linedef {

    ActionSpecial actionSpecial; // TODO: doom enum'd action special
    byte[] actionArgs;

    private Sidedef rightSidedef;
    private Sidedef leftSidedef;

    public HexenLinedef(int startPtr, int lumpSize, String name) {
        super(startPtr, lumpSize, name);

        actionArgs = new byte[5];
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

    public Sidedef getRightSidedef() {
        return rightSidedef;
    }

    public void setRightSidedef(Sidedef rightSidedef) {
        this.rightSidedef = rightSidedef;
    }

    public Sidedef getLeftSidedef() {
        return leftSidedef;
    }

    public void setLeftSidedef(Sidedef leftSidedef) {
        this.leftSidedef = leftSidedef;
    }
}
