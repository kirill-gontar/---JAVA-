package javaapplication3;

/*Класс вычисления корней*/

public class Equation {
    
    public int result_1;
    public int result_2;
    public int count_result;/*Кол-во корней ур-я*/
    
     /**
      * Вычисления корней ур-я
      * @param a Первый коеффициент
      * @param b Второй коеффициент
      * @param c Свободный член
      */
    Equation(final int a, final int b, final int c) {
        final int d = (int) (Math.pow(b, 2) - 4 * a * c);/*Дискрименант*/
        if(d == 0){
            this.result_1 = b * -1 / 2 * a;
            this.count_result = 1;
        }
        if(d > 0){
            this.result_1 = (int) ((b * -1 - Math.sqrt(d)) / 2 * a);
            this.result_2 = (int) ((b * -1 + Math.sqrt(d)) / 2 * a);
            this.count_result = 2;
        }
        if(d < 0) this.count_result = 0;
    }
    
}
