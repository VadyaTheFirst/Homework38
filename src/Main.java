import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set <Product> products = new HashSet<>();
        Product eggs=new Product("Яйцо",10,1,38);
        products.add(eggs);
        Product butter=new Product("Масло",1,1,48);
        products.add(butter);
        products.add(new Product("Вода",2,1,2));
        //products.add(new Product("Вода",1,1,2));
        products.add(new Product("Кофе",2,1,2));



        System.out.println(Arrays.toString(products.toArray()));


        Prescription salad= new Prescription("Салат Хрен с маслом",products);
        salad.getPrescription();


    }


}