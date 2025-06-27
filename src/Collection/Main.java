package Collection;

public class Main {

    public static void main(String[] args) {

        // Фиксированный стек
//        StackFix stack = new StackFix(5);
//
//        stack.put(10);
//        stack.put(7);
//        stack.put(0);
//        stack.put(-13);
//        stack.put(-111);
//
//
//        System.out.println(stack);
//
//        stack.push(10);
//        stack.push(4);
//
//
//        System.out.println(stack);
//
//        System.out.println(stack.getSize());
//
//        System.out.println(stack.isEmpty());
//
//        System.out.println(stack.isFul());
//
//
//        stack.delete();
//
//        System.out.println(stack);
//        System.out.println(stack.isEmpty());


        // Не фиксированный стек
//        StackNotFix stackNotFix = new StackNotFix();
//
//        stackNotFix.push(10);
//        stackNotFix.push(7);
//        stackNotFix.push(0);
//        stackNotFix.push(-13);
//        stackNotFix.push(-111);
//
//
//        System.out.println(stackNotFix);
//
//        stackNotFix.pop();
//        stackNotFix.pop();
//
//
//        System.out.println(stackNotFix);
//
//        System.out.println(stackNotFix.getSize());
//
//        System.out.println(stackNotFix.isEmpty());
//
//        System.out.println(stackNotFix.isFul());
//
//
//        stackNotFix.delete();
//
//        System.out.println(stackNotFix);
//        System.out.println(stackNotFix.isEmpty());


        // Шаблонный стек
        StackSample stackSample = new StackSample();

        stackSample.push("Один");
        stackSample.push("Два");
        stackSample.push("Три");
        stackSample.push("Четыре");
        stackSample.push("Пять");


        System.out.println(stackSample);

        stackSample.pop();
        stackSample.pop();


        System.out.println(stackSample);

        System.out.println(stackSample.getSize());

        System.out.println(stackSample.isEmpty());

        System.out.println(stackSample.isFul());


        stackSample.delete();

        System.out.println(stackSample);
        System.out.println(stackSample.isEmpty());

    }
}
