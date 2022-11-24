import java.util.*;


public class Prescription {
    private String prescriptionName;
    Set<Product> products = new HashSet<>();



    public Prescription(String name,Set<Product> products) {
        this.prescriptionName=name;
        this.products = products;
    }


    public void getPrescription() {
        ArrayList<Product> items =new ArrayList<Product>();
        System.out.println("Состав слата " + getPrescriptionName() + ": ");
        int sum=0;
        for (Product product : products) {
            items.add(product);
           sum+=product.getCount()* product.getValue();
        }
        System.out.println(Arrays.toString(products.toArray()));
        System.out.println("Сумма продуктов салата: "+sum);
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return prescriptionName.equals(that.prescriptionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescriptionName);
    }
}

