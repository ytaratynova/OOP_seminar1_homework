/**
 *  5. Молоко, содержащиее следующее свойство:
5.1 Процент жирности
5.2 Срок годности

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля. 
 */




package OOP_seminar1_homework;

public class Milk extends Drinks {
    private Double fat;
    private Integer useInDays;

    public Milk(String name, Double price, Integer quantity, String unit, Double volume, Double fat, Integer useInDays){
        super(name, price, quantity, unit, volume);
        this.fat = fat;
        this.useInDays = useInDays;
    }

    public Double getFat(){
        return fat;
    }

    public Integer getUseInDays(){
        return useInDays;
    }

    @Override
    public String toString() {
        return "Молоко: " + getName() + ", " +
               "цена: " + getPrice() + " руб., " +
               "количество: " + getQuantity() + 
               " " + getUnit() + ", " +
               "жирность: " + getFat() + "%, " +
               "срок годности: " + getUseInDays() + " дней;";
    }
    
}
