This file will be used for random thoughts and scribbles.

29 July 2017
----
Experimenting with using Java generics instead of implemented interface. Seeing something like Sector<Doom> or Sector<Hexen> really beats out having to make classes like DoomSector and HexenSector.

The biggest problem is that the formats and specifications for each game type are different, meaning that a completely generic template for this type of situation wouldn't really work out too well. For now, I'm just going to stick to using the interfaces and see if I stumble upon some other nicer way of creating lumps for other game types.
