/**
 * 10. Туалетная бумага, содержащее следующее свойство:
10.1 Количество слоёв

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */

package OOP_seminar1_homework;

public class ToiletPaper extends Hygiene {
    private Integer layer;

    public ToiletPaper(String name, Double price, Integer quantity, String unit, Integer quantityInPackage, Integer layer){
        super(name, price, quantity, unit, quantityInPackage);
        this.layer = layer;
    }

    public Integer getLayer(){
        return layer;
    }
    
    @Override
    public String toString() {
        return "Туалетная бумага: " + getName() + ", " +
               "цена: " + getPrice() + " руб., " +
               "количество: " + getQuantity() + 
               " " + getUnit() + ", " +
               "количество в упаковке: " + getQuantityInPackage() + " шт., " +
               "количество слоев: " + getLayer() + ";";
    }
}
