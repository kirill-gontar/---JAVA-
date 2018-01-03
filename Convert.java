package javaapplication3;

/*Класс для формирования строки "ваше ур-е"*/

public class Convert {
    
    /**
     * Используется для второго и третьего коеффициента
     * @param coef Коеффициент
     * @return Преобразованый коеффициент
     */
    public final static String toString(int coef){
        String result;
        if(coef < 0){
            coef = coef * -1;
            result = " - " + coef;
        } else {
            if(coef > 0) result = " + " + coef;
            else result = "";
        }
        return result;
    }
    
    /**
     * Используется для первого коеффициента
     * @param coef Коеффициент
     * @return Преобразованый коеффициент
     */
    public final static String delete(final int coef){
        String result;
        if(coef == 1) result = "";
        else result = String.valueOf(coef);
        return result;
    }
    
}
