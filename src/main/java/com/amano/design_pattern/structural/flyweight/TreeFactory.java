package com.amano.design_pattern.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: TreeFactory
 * @package com.amano.design_pattern.structural.flyweight
 * @description: 封装获取享元对象的逻辑
 * @author: weifeng
 * @date: 2023/4/8
 **/
public class TreeFactory {
    private static Map<String, TreeType> flyweight = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        if (flyweight.containsKey(otherTreeData)) {
            return flyweight.get(otherTreeData);
        }
        TreeType treeType = new TreeType(name, color, otherTreeData);
        flyweight.put(otherTreeData, treeType);
        return treeType;
    }
}
