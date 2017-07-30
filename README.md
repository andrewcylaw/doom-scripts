# doom-scripts
Doom utilities written in any language of my choosing.

----

To be later renamed to `javadoom` or something similar.

Goal of the project is to create a POJO'd version of the entire Doom wad. There are two main strategies for achieving this:
1) Creating generic interfaces (eg 'linedef'), which are implemented on a per-game basis (eg 'DoomLinedef' implements 'linedef)
2) Using Java generics to achieve the same goal based on map type (eg, Sector<Doom> takes in Linedef<Doom>)

