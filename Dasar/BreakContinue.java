public class BreakContinue {
    public static void main(String[] args) {
        var i = 1;
    while (true) {
            System.out.println(i);
            i++;
        if(i > 10) {
            break;
        }
    }

    // cari ganjil
    for(int a = 1;a <= 100; a++) {
        if(a % 2 == 0) {
            continue;
        }
        System.out.println(a);
    }
    }
}