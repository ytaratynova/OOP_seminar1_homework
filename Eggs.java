/**
 * 8. Яйца, содержащее следующиее свойство:
8.1 Количество в упаковке

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */

package OOP_seminar1_homework;

public class Eggs extends Food {
    private Integer quantityInPackage;

    public Eggs(String name, Double price, Integer quantity, String unit, Integer useInDays, Integer quantityInPackage){
        super(name, price, quantityInPackage, unit, useInDays);
        this.quantityInPackage = quantityInPackage;
    }

    public Integer getQuantityInPackage(){
        return quantityInPackage;
    }

    @Override
    public String toString() {
        return "Яйца: " + getName() + ", " +
               "цена: " + getPrice() + " руб., " +
               "количество: " + getQuantity() + 
               " " + getUnit() + ", " +
               "количество в упаковке: " + getQuantityInPackage() + " шт.;";
    }

    
}
