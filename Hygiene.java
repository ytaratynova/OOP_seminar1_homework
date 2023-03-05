/**
 3. Предметы гигиены, содержащие следующие свойства:
3.1 Количество штук в упаковке

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля. 
 */


package OOP_seminar1_homework;

public class Hygiene extends Product{
    private Integer quantityInPackage;

    public Hygiene(String name, Double price, Integer quantity, String unit, Integer quantityInPackage){
        super(name, price, quantity, unit);
        this.quantityInPackage = quantityInPackage;
    }

    public Integer getQuantityInPackage(){
        return quantityInPackage;
    }

    @Override
    public String toString() {
        return super.toString() +
               "количество в упаковке: " + getQuantityInPackage() + " шт.\n";
    }
    
}
