/**
 * 7. Хлеб, содержащий следующие свойство:
7.1 Тип муки

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */


package OOP_seminar1_homework;

public class Bread extends Food{
    private String flour;

    public Bread(String name, Double price, Integer quantity, String unit, Integer useInDays, String flour){
        super(name, price, quantity, unit, useInDays);
        this.flour = flour;
    }
    
    public String getFlour(){
        return flour;
    }

    @Override
    public String toString() {
        return "Хлеб: " + getName() + ", " +
                "цена: " + getPrice() + " руб., " +
                "количество: " + getQuantity() + 
                " " + getUnit() + ", " +
                "мука: " + getFlour() + ";";
    }
}
