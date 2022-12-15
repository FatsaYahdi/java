public class MethodParameter {
    public static void main(String[] args) {
        sayHello("first1","last1");
        sayHello("first2","last2");
    }
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}