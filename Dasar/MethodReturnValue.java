public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a,b);
        System.out.println(c);
        System.out.println(hitung(a,"+",b));
        System.out.println(hitung(a,"-",b));
        System.out.println(hitung(a,"salah",b));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int val1, String operasi, int val2) {
        switch(operasi) {
            case "+" :
                return val1 + val2;
            case "-" :
                return val1 - val2;
            default :
                return 0;
        }
    }

}