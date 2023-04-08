package com.amano.design_pattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

/**
 * @className: TreeType
 * @package com.amano.design_pattern.structural.flyweight
 * @description: 享元模式的不可变数据封装
 * @author: weifeng
 * @date: 2023/4/8
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public void draw(Graphics g, Integer x, Integer y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
