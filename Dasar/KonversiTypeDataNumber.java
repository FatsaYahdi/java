public class KonversiTypeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // konversi 
        // otomatis = byte -> short -> int -> long -> float -> double
        // manual   = double -> float -> long -> int -> char -> short -> byte
        byte iniByte2 = (byte) iniInt;
    }
}