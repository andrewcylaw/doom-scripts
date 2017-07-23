package util;

public final class ByteConversion {

    public static int byteToInt(byte[] arr){
        return java.nio.ByteBuffer.wrap(arr).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt();
    }

    public static short byteToShort(byte[] arr){
        return java.nio.ByteBuffer.wrap(arr).order(java.nio.ByteOrder.LITTLE_ENDIAN).getShort();
    }

    public static String byteToString(byte[] str){
        String result = new String(str);
        return result.indexOf(0) == -1 ? result : result.substring(0, result.indexOf(0));
    }
}
