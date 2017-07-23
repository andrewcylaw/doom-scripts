package util;

import wad.PWAD;
import wad.WAD;
import wad.lumps.Lump;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import static util.ByteConversion.*;

/*
    Translates the Doom wad byte format to an equivalent pojo.
 */
public class WadParser {

    private RandomAccessFile file;

    // header
    private String wadType; // 0x00 - 0x03
    private int numEntries; // 0x04 - 0x07
    private int dirPtr; // 0x08 - 0x0b

    private List<Lump> lumps;

    public WadParser(String path) throws FileNotFoundException, IOException {
        try {
            this.file = new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.lumps = new ArrayList<>();

        getHeaderMetaData();
        getLumpMetadata();
    }

    private void getHeaderMetaData() throws IOException {

        byte[] type = new byte[4];
        this.file.read(type);
        this.wadType = byteToString(type);

        this.file.seek(4);
        this.numEntries = this.file.readInt();
        this.dirPtr = this.file.readInt();

        System.out.println("Type: " + this.wadType + " | numEntries: " + this.numEntries + " | dirPtr: " + this.dirPtr);
    }

    /**
     * Retrieves lump metadata from the WAD directory.
     */
    private void getLumpMetadata() throws IOException {
        this.file.seek(dirPtr);

        // Iterate through directory
        for(int i = 0; i < numEntries; i++) {
            byte[] str = new byte[8];
            this.file.read(str);

            Lump a = new Lump(this.file.readInt(),
                    this.file.readInt(),
                    byteToString(str));

            this.lumps.add(a);

            System.out.println(a);
        }


    }


    // -----------------------------------------

    public static WAD getWadFromPath(String path) {
        return new PWAD();
    }

}
