package com.amano.design_pattern.creator.factory.factory_method;

import com.amano.design_pattern.creator.factory.simple_factory.Product;
import com.amano.design_pattern.creator.factory.simple_factory.ProductB;

public class ProductBCreator implements Creator{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
