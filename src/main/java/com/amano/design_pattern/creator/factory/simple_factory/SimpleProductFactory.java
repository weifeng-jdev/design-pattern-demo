package com.amano.design_pattern.creator.factory.simple_factory;

public class SimpleProductFactory {
    public static Product createProduct(String type){
        Product product;
        switch (type){
            case "A" ->  product = new ProductA();
            case "B" ->  product = new ProductB();
            default -> throw new IllegalStateException("不支持的Product类型");
        }
        return product;
    }
}
