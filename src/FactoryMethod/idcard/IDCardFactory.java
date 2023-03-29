package FactoryMethod.idcard;

import FactoryMethod.Factory.Factory;
import FactoryMethod.Factory.Product;

//createProduct , registerProduct
public class IDCardFactory extends Factory {

    public Product createProduct(String owner){
        Product p = new IDCard(owner);
        return p;
    }

    public void registerProduct(Product product){
        System.out.println(product+"을 등록했습니다.");
    }

}
