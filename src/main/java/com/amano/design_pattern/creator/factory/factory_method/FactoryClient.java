package com.amano.design_pattern.creator.factory.factory_method;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class FactoryClient {
    private static Creator creator;

    @Getter
    @AllArgsConstructor
    private enum Type{
        A,B;
    }

    public static void main(String[] args) {
        init();
        creator.createProduct().doStuff();
    }

    public static void init() {
        String type = System.getenv("type");
        switch (Type.valueOf(type)) {
            case A -> creator = new ProductACreator();
            case B -> creator = new ProductBCreator();
            default -> throw new IllegalStateException("不支持的Product类型");
        }
    }
}
