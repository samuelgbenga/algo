package week_6.class_activity11a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "prod1", 25000f));
        products.add(new Product(2, "prod2", 30000f));
        products.add(new Product(3, "prod3", 95000f));
        products.add(new Product(4, "prod4", 5000f));

        List<Float> priceList = new ArrayList<>();

//        products.forEach((p)-> {
//            if(p.price > 50000f) productList.add(p.price);
//        });
//
//        System.out.println(productList);

//        products.forEach((p)-> {
//            if(p.price > 50000f) System.out.println("prodName: "+ p.productName + "product price: "+ p.price);
//        });
//
//        products.stream().filter(p-> p.price > 50000f).forEach(System.out::println);

        // using stream

        priceList = products.stream()
                .filter(p-> p.price < 30000)
                .map(p-> p.price)
                .collect(Collectors.toList());

           // priceList.forEach(System.out::println);

      //  float minPrice = products.stream().map(p->p.price).min(Comparator.naturalOrder()).collect(Collectors);

        List<Float> minimum = products.stream().map(p->p.price).min(Comparator.naturalOrder()).stream().toList();
        //List<Float> maximum = products.stream().map(p->p.price).max(Comparator.naturalOrder()).stream().toList();

        List<Float> maximum = products.stream().map(p->p.price).max((p1,p2)-> p1 > p2 ? 1 : -1).stream().toList();

        String maximum1 = products.stream().map(p->p.price).max(Comparator.naturalOrder()).toString();

        System.out.println(minimum);
        System.out.println("*********");
        System.out.println(maximum);
        System.out.println("*********");
        System.out.println(maximum1);

        System.out.println("The other one");

        //float minPrice = products.stream().map(p-> p.price).min((p1,p2)-> (p1 > p2) ? 1 : -1).get();
        Product minPrice = products.stream().min((p1,p2)-> (p1.price > p2.price) ? 1 : -1).get();
        Product maxPrice = products.stream().max((p1,p2)-> (p1.price > p2.price) ? 1 : -1).get();

        System.out.println("Product with min Price: "+minPrice);
        System.out.println("product with max price: "+maxPrice);



       // priceList.forEach(System.out::println);
    }
}

class Product{
    int id;
    String productName;
    float price;

    public Product(int id, String productName, float price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name of Prod: "+ productName +" the Price: "+ price;
    }
}
