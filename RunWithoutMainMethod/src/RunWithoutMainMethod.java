public class RunWithoutMainMethod {
    /**
        Q. Can we execute a java program without main() method
        Ans: No, one of the ways was the static block, but it was possible till JDK 1.6
        Since JDK 1.7 it is not possible to execute a java class without main method.
     */

    static {
        System.out.println("let's do it, static block is invoked");
        System.exit(0);
    }
}
