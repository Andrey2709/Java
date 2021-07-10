




public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    private static void printThreeWords(){
        System.out.println(" Orange \n Banana \n Apple");
    }
    private static void  checkSumSign(){
        int a =3 ,b = 5;
        int sum = a + b;
        if(sum>=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    private static void  printColor(){
        int value = 101;
        if(value<=0){System.out.println("Красный"); }
        else if(value > 0 && value<=100){System.out.println("Жёлтый"); }
        else if(value>100){System.out.println("Зелёный"); }
    }
    private static void compareNumbers(){
        int a = 10, b =8;
        if(a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
}
