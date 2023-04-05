package com.amano.design_pattern.creator.factory.factory_method;

import com.amano.design_pattern.creator.factory.simple_factory.Product;
import com.amano.design_pattern.creator.factory.simple_factory.ProductA;

public class ProductACreator implements Creator{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
