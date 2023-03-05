/**
 * А так же реализовать следующие классы-наследники:
1. Продукты питания, содержащие следующие свойства:
1.1 Срок годности

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */

package OOP_seminar1_homework;

public class Food extends Product{
    private Integer useInDays;

    public Food(String name, Double price, Integer quantity, String unit, Integer useInDays){
        super(name, price, quantity, unit);
        this.useInDays = useInDays;
    }
    
    public Integer getUseInDays(){
        return useInDays;
    }

    @Override
    public String toString() {
        return super.toString() +
               "срок годности: " + getUseInDays() + " дней\n";
    }
}
