package wad.lumps.linedef.actionspecial;

/**
 * Generic interface for all linedef action specials.
 *
 * The general structure of these files:
 *
 * =========================================================
 *
 * [Top Level]
 *    ^   ActionSpecial
 *    |
 *    |
 *    | (extends)
 *    |
 *    |
 * [Categories]
 *    ^    FloorActionSpecial,
 *    |    CeilingActionSpecial,
 *    |    (...)
 *    |
 *    |
 *    | (implements)
 *    |
 *    |
 * [Individual ActionSpecials]
 *    |   FloorLowerByValue,
 *    |   CeilingRaiseByValue,
 *    |   (...)
 *    |
 *    |
 *    | (extends)
 *    |
 *    v
 * [Helper Classes]
 *        ByValue,
 *        Instant,
 *        (...)
 *
 * =========================================================
 *
 */
public interface ActionSpecial {

    ActionSpecialId getId();

}
