/**
 * Соска
 * 
 * У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля.
 */

package OOP_seminar1_homework;

public class Pacifier extends ChildrenGoods{
    public Pacifier(String name, Double price, Integer quantity, String unit, Integer years, Boolean hypoallergenicity){
        super(name, price, quantity, unit, years, hypoallergenicity);
    }
    
    @Override
    public String toString() {
        if (getHypoallergencity()) {
        return "Соска: " + getName() + ", " +
                "цена: " + getPrice() + " руб., " +
                "количество: " + getQuantity() + 
                " " + getUnit() + ", " +
                "минимальный возраст: " + getYears() + " лет, " +
                "гипоаллергенно;";
        } else {
            return "Соска: " + getName() + ", " +
                "цена: " + getPrice() + " руб., " +
                "количество: " + getQuantity() + 
                " " + getUnit() + ", " +
                "минимальный возраст: " + getYears() + " лет, " +
                "негипоаллергенно;";    
        }
                
    }
}
