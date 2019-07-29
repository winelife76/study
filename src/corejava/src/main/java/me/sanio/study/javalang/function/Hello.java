package me.sanio.study.javalang.function;

public class Hello {
    public static void main(String[] args) {
        Function<Integer, Integer> triple = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg * 3;
            }
        };

        Function<Integer, Integer> triple2 = x -> x * 3;

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg * arg;
            }
        };

        Function<Integer, Integer> square2 = x -> x * x;

        System.out.println(triple.apply(20));
        System.out.println(square.apply(triple.apply(2)));
        System.out.println(compose(square, triple).apply(3));
        System.out.println(add);
        System.out.println("============lambda expression app==========");
        System.out.println(mul.apply(3).apply(4).apply(5));
        System.out.println(compose3.apply(square2).apply(triple2).apply(2));

    }

    static Function<Integer, Integer> compose(final Function<Integer, Integer> f1,
                                              final Function<Integer, Integer> f2) {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return f1.apply(f2.apply(arg));
            }
        };
    }

    static Function<Integer, Integer> compose2(final Function<Integer, Integer> f1,
                                               final Function<Integer, Integer> f2) {
        return arg -> f1.apply(f2.apply(arg));
    }

    static Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;

    static Function<Integer, Function<Integer, Function<Integer, Integer>>> mul = x -> y -> z -> x * y * z;

    static Function<Function<Integer, Integer>,
            Function<Function<Integer, Integer>,
                    Function<Integer, Integer>>> compose3 = x -> y -> z -> x.apply(y.apply(z));
}
