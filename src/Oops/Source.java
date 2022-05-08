import java.util.ArrayList;
import java.util.HashSet;

class Product{
    ArrayList<String> productList = new ArrayList<>();
    void addProduct(String pName){
        productList.add(pName);
    }
    void removeProduct(String pName){
        productList.remove(new String(pName));
    }
    int uniqueProduct(){
        System.out.println(productList);
        HashSet<String> set = new HashSet<>(productList);
        System.out.println("count = "+set.size());
        return set.size();
    }

}

public class Source {
    public static void main(String[] args) {
        //Given test case
        Product p1 = new Product();
        p1.addProduct("Pen");
        p1.addProduct("Shirt");
        p1.removeProduct("Pen");
        p1.removeProduct("pol");
        p1.addProduct("Pen");
        // p1.removeProduct("pola");
        int count =p1.uniqueProduct();
   

    }
}
