/**
 * Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения

У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */

package OOP_seminar1_homework;


public class Product{
    private  String name;
    private Double price;
    private Integer quantity;
    private String unit;

/** констуктор товара */
public Product(String name, Double price, Integer quantity, String unit){ 
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.unit = unit;
}

public String getName(){
    return name;
}

public Double getPrice(){
    return price;
}

public Integer getQuantity(){
    return quantity;
}

public String getUnit(){
    return unit;
}

@Override
public String toString() {
    return "Товар: " + getName() + ", " +
           "цена: " + getPrice() + " руб., " +
           "количество: " + getQuantity() + 
           " " + getUnit() + ", ";
}
}