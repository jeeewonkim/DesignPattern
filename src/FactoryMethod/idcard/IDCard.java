package FactoryMethod.idcard;

import FactoryMethod.Factory.Product;

//메소드 use를 구현하고 있는 클래스
public class IDCard extends Product {
    private final String owner;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "를 사용합니다.");
    }

    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
