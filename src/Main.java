import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product eggs = new Product("Яйцо", 10, 1, 38);
        products.add(eggs);
        Product butter = new Product("Масло", 1, 1, 48);
        products.add(butter);
        products.add(new Product("Вода", 2, 1, 2));
        //products.add(new Product("Вода",1,1,2));
        products.add(new Product("Кофе", 2, 1, 2));
        Product cheese = new Product("Сыр", 1, 1, 48);
        products.add(cheese);

        Set<Product> saladProducts1 = new HashSet<>();
        saladProducts1.add(new Product("Хрен}", 2, 1, 2));
        saladProducts1.add(butter);

        Set<Product> saladProducts2 = new HashSet<>();
        saladProducts2.add(eggs);
        saladProducts2.add(butter);
        saladProducts2.add(cheese);



        System.out.println(Arrays.toString(products.toArray()));

        Prescription salad1 = new Prescription("Хрен с маслом}", saladProducts1);
        salad1.getPrescription();


        Prescription salad2 = new Prescription("Салат яйца в масле", saladProducts2);
        salad2.getPrescription();

        Set<Prescription> prescriptionList = new HashSet<>();
        prescriptionList.add(salad1);
        prescriptionList.add(salad2);
        prescriptionList.add(salad2);

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> set2 = new ArrayList<>();


        for(int i = 0; i < 20; i++)
            set.add((int) Math.round(Math.random()*100));

        //System.out.println(Arrays.toString(set.toArray()));

        for(Integer element : set)
            if(element % 2 == 0)
                set2.add(element);

        set.removeAll(set2);
        System.out.println(Arrays.toString(set.toArray()));



    }
}







