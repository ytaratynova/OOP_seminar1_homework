/**
 4. Детские товары:
4.1 Минимальный возраст
4.2 Гипоаллергенность,

Перегрузить метод ToString класса Object, от которого наследуются все классы, 
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
принимающие все поля. 
 */


package OOP_seminar1_homework;

public class ChildrenGoods extends Product {
    private Integer years;
    private Boolean hypoallergenicity;

    public ChildrenGoods(String name, Double price, Integer quantity, String unit, Integer years, Boolean hypoallergenicity){
        super(name, price, quantity, unit);
        this.years = years;
        this.hypoallergenicity = hypoallergenicity;
    }

    public Integer getYears(){
        return years;
    }

    public Boolean getHypoallergencity(){
        return hypoallergenicity;
    }

    @Override
    public String toString() {
        if (getHypoallergencity()){
            return super.toString() + 
                   "минимальный возраст: " + getYears() + " лет, " +
                   "гипоаллергенно\n";
        } else {
            return super.toString() + 
                   "минимальный возраст: " + getYears() + " лет, " +
                   "негипоаллергенно\n";
        }
    }

    
}
