package week_6.practice.practice5;

import java.util.function.IntSupplier;

public class SupplierEx {
    public static void main(String[] args) {
        IntSupplier supplier = ()-> (int)(Math.random()*100);

        System.out.println(supplier.getAsInt());
    }
}
