package com.company;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        /*-*-*-*-*-*-*-*-*-*-*-*-*-* 1й вариант *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

        System.out.println(sqrt().apply(2021.12));
    }
    public static UnaryOperator<Double> sqrt() {
        return Math::sqrt;
    }
}

        /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* 2й вариант *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

//        UnaryOperator1<Double> unaryOperator1 = a -> Math.sqrt(a);
//        System.out.println(unaryOperator1.sqrt(456.4));
//    }
//}
//interface UnaryOperator1 <T> {
//     T sqrt(T a);
//}


        /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* 3й вариант *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

//        UnaryOperator<Double> unaryOperator = a -> Math.sqrt(a);
//        System.out.println(unaryOperator.apply(144.0));
//    }
//}















