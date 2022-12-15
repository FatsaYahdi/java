public class TypeDataArray {
    public static void main(String[] args) {
        String[] arrayString = new String[3];
        arrayString[0] = "Satu";
        arrayString[1] = "Dua";
        arrayString[2] = "Tiga";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[2] = "Ganti Tiga";

        int[] arrayInt = new int[]{
            12,92,11,12,32
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };
        System.out.println(arrayLong.length);

        arrayLong[0] = 0;

        String[][] members = {
            {"Satu","Dua"},
            {"Tiga","Empat"},
            {"lima"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}