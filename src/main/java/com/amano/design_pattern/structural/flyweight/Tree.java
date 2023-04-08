package com.amano.design_pattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

/**
 * @className: Tree
 * @package com.amano.design_pattern.structural.flyweight
 * @description: 应用程序中大量出现的数据
 * @author: weifeng
 * @date: 2023/4/8
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tree {
    private Integer x;
    private Integer y;

    private TreeType treeType;

    public void draw(Graphics g) {
        treeType.draw(g, x, y);
    }
}
