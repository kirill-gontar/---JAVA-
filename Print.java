package javaapplication3;

/*Класс вывода сообщений*/

public class Print {
 
    public final static void format(){
        System.out.println("Формат: ax^2 + bx + c = 0");
    }
    
    public final static void enterFirstCoef(){
        System.out.print("\nВведите число a: ");
    }
    
    public final static void enterSecondCoef(){
        System.out.print("\nВведите число b: ");
    }
    
    public final static void enterFreeCoef(){
        System.out.print("\nВведите число c: ");
    }
    
    /**
     * Вывод корней ур-я, если их 2
     * @param result_1 Первый корень
     * @param result_2 Второй корень
     */
    public final static void result(final int result_1, final int result_2){
        System.out.println("x1 = " + result_1);
        System.out.println("x2 = " + result_2);
    }
    
    /**
     * Вывод корня ур-я, если он 1
     * @param result Корень ур-я 
     */
    public final static void result(final int result){
        System.out.println("x = " + result);
    }
    
    /**
     * Вывод результата, если корней нет
     */
    public final static void result(){
        System.out.println("Корней нет...");
    }
    
    /**
     * Вывод ур-я, указанного пользователем
     * @param a Первый коеффициент
     * @param b Второй коеффициент
     * @param c Свободный член 
     */
    public final static void yourEquation(final String a, final String b, final String c){
        System.out.println("\nВаше ур-е: " + a + "x^2" + b + "x" + c + " = 0");
    }
    
}
