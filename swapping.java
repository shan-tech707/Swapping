
public class swapping {
    public static void main(String[] args) {
        int a= 15;
        int b= 16;
        // swapping of variable value with out using third variable
        System.out.println("Before Swapping\na= "+ a+" \nb= "+b);

        a = a + b; // a = 5 + 6 = 11;
        b = a - b; // b = 11 - 6 = 5;
        a = a - b; // a = 11 - 5 = 6;

        System.out.println("After Swapping\na= "+ a+" \nb= "+b);

    }
}
