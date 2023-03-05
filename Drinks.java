/**
 * 2. Напитки, содержащие следующие свойства:
2.1 Объём

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */

package OOP_seminar1_homework;

public class Drinks extends Product {
    private Double volume;

    public Drinks(String name, Double price, Integer quantity, String unit, Double volume){
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    public Double getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() +
               "объем: " + getVolume() + " л., ";
    }


    
}
