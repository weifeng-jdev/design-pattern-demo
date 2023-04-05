package com.amano.design_pattern.creator.factory.simple_factory;

import com.amano.design_pattern.creator.factory.factory_method.Creator;
import com.amano.design_pattern.creator.factory.factory_method.ProductACreator;
import com.amano.design_pattern.creator.factory.factory_method.ProductBCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class FactoryClient {
    public static void main(String[] args) {
        SimpleProductFactory.createProduct("C").doStuff();
    }

}
