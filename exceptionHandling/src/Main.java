class Program{
    public static void main(String[] args){
//        int a = 5;
//        int b = 0;
//        int result = a / b;
//        System.out.printf("Результат: %d\n", result);
//        divide(10, 2);
//        divide(10, 0);
//        System.out.println("Конец программы");
        int result = parse("5");
        System.out.println(result);

        result = parse("t");
        System.out.println(result);
    }
//    static void divide(int a, int b){
//
//        try{
//            int result = a / b;
//            System.out.printf("Результат: %d\n", result);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Возникло исключение!");
//        }
//        finally {
//            System.out.println("Блок finally");
//        }
//    }
    static int parse(String s){
        try{
            return Integer.parseInt(s);
        }
        catch(Throwable _){
            System.out.println("Ошибка преобразования");
            return 0;
        }
    }
}
// try...catch...finally
