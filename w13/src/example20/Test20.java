package example20;

import java.util.Optional;

public class Test20 {

    public static void main(String[] args) {
        System.out.println(foo("ABC"));
        System.out.println(foo(123));
        System.out.println(foo(3.14));
        System.out.println(foo2(123));
        System.out.println(foo2(3.14));
        //System.out.println(foo2("ABC"));
        System.out.println(Optional.ofNullable(foo3()));
        System.out.println(Optional.ofNullable(foo4(0)));
    }

    public static <T> int foo(T arg){
        return arg.hashCode();
    }

    public static <T> int foo2(T arg) {
        if (arg instanceof Number) {
            return (int) Math.pow(((Number) arg).doubleValue(), 2);
        }
        throw new IllegalArgumentException("Arg musi być liczbą");
    }

    public static <T> T foo3(){
        return null;
    }

    public static <T> T foo4(int arg) {
        if (arg == 0) {
            return (T) Integer.valueOf(arg);
        } else if (arg == 1) {
            return (T) "String";
        }
        return (T) new Object();
    }


}
