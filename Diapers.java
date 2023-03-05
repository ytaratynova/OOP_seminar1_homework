/**
 * 11. Подгузники, содержащие следующее свойства:
11.1 Размер
11.2 Минимальный вес
11.3 Максимальный вес
11.4 Тип

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля. 
 */

package OOP_seminar1_homework;

public class Diapers extends ChildrenGoods {
    private String size;
    private Double minWeight;
    private Double maxWeight;
    private String type;

    public Diapers(String name, Double price, Integer quantity, String unit, 
                   Integer years, Boolean hypoallergenicity, String size,
                   Double minWeight, Double maxWeight, String type){
            super(name, price, quantity, unit, years, hypoallergenicity);
            this.size = size;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
            this.type = type;
    }

    public String getSize(){
        return size;
    }
    
    public Double getMinWeight(){
        return minWeight;
    }

    public Double getMaxWeight(){
        return maxWeight;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        if (getHypoallergencity()){
        return "Подгузники: " + getName() + ", " +
               "цена: " + getPrice() + " руб., " +
               "количество: " + getQuantity() + 
               " " + getUnit() + ", " +
               "минимальный возраст: " + getYears() + " лет, " +
               "гипоаллергенно, " +
               "размер: " + getSize() + ", " +
               "минимальный вес: " + getMinWeight() + ", " +
               "максимальный вес: " + getMaxWeight() + ", " +
               "тип: " + getType() + ";";
        } else {
            return "Подгузники: " + getName() + ", " +
               "цена: " + getPrice() + " руб., " +
               "количество: " + getQuantity() + 
               " " + getUnit() + ", " +
               "минимальный возраст: " + getYears() + " лет, " +
               "негипоаллергенно, " +
               "размер: " + getSize() + ", " +
               "минимальный вес: " + getMinWeight() + ", " +
               "максимальный вес: " + getMaxWeight() + ", " +
               "тип: " + getType() + ";";
        }
    }

    
}
