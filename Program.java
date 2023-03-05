package OOP_seminar1_homework;

public class Program{

    static void printProducts(Product[] someProducts){
        for (Product product: someProducts){
            System.out.println(product);

        }
    }

    public static void main(String[] args){

    Product someBread = new Bread("батон", 40.00, 5, "шт.", 5, "пшеничная");
    Product someDiapers = new Diapers("Huggies", 800.00, 10, "уп.", 0, true, "XS", 2.5, 3.0, "для мальчиков");
    Product someEggs = new Eggs("Наша Ряба", 88.80, 10, "уп.", 14, 10);
    Product someLemonade = new Lemonade("Тархун", 119.90, 6, "бут.", 2.5);
    Product someMask = new Masks("медицинская", 1150.00, 25, "упаковка", 30);
    Product someMilk = new Milk("Простоквашино", 88.00, 30, "бут.", 1.0, 3.4, 5);
    Product somePacifier = new Pacifier("Малыш", 450.00, 30, "шт.", 0, true);
    Product somePaper = new ToiletPaper("Zewa", 400.00, 10, "уп.", 4, 3);

    Product[] products = new Product[]{someBread, someDiapers, someEggs, someLemonade, someMask, someMilk, somePacifier, somePaper};

    printProducts(products);

    }

}

    
    

