/**
 * This is a java doc explanation of GoitExample class
 */
public
class GoitExample {

    int hidden = 9;

    /**
     * this method multiplies two integers
     *
     * @param a is a first argument of multiply
     * @param b is a second argument of multiply
     * @return is a result of multiplicity of 2 arguments
     */
    public int multiplyWithHiddenNumber(int a, int b) {
        return a * b * hidden;
    }

    private String getString() {
        return "a * b * hidden";
    }

    public static void main(String[] args) {


        System.out.println("Hello, Ulka ");
        System.out.println("Hello, My First lesson");
//        System.out.println("Hello, Friends");
        /* System.out.println("Hello, Svieta");*/
        System.out.println("Hello, Yarik");
        System.out.print("Hello, Yarik");
        System.out.println("Hello, Yarik");
        System.out.println(/* "Hello,  Mama " */);
    }
}
