/**
 *  Лимонад

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */

package OOP_seminar1_homework;

public class Lemonade extends Drinks {

    public Lemonade(String name, Double price, Integer quantity, String unit, Double volume){
        super(name, price, quantity, unit, volume);
    }

    @Override
    public String toString() {
        return "Лимонад: " + getName() + ", " +
                "цена: " + getPrice() + " руб., " +
                "количество: " + getQuantity() + 
                " " + getUnit() + ";";
    }
    
}
