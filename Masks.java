/**
 *  Маски

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */


package OOP_seminar1_homework;

public class Masks extends Hygiene {
    public Masks(String name, Double price, Integer quantity, String unit, Integer quantityInPackage){
        super(name, price, quantity, unit, quantityInPackage);
    }

    @Override
    public String toString() {
        return "Маска: " + getName() + ", " +
                "цена: " + getPrice() + " руб., " +
                "количество: " + getQuantity() + 
                " " + getUnit() + ", " +
                "количество в упаковке: " + getQuantityInPackage() + ";";
    
    }
}
