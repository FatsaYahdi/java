public class OperasiBoolean {
    public static void main(String[] args) {
        // operasi &&
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false

        // operasi ||
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false

        // operasi !
        System.out.println(!false); // true
        System.out.println(!true);  // false

        // no
        var absen = 70;
        var nilaiAkhir = 80;
        
        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}