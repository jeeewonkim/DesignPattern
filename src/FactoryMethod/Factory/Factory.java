package FactoryMethod.Factory;

//메소드 create를 구현하고 있는 추상클래스
public abstract class Factory {

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

    public Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

}
