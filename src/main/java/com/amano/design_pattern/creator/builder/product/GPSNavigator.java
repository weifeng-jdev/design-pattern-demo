package com.amano.design_pattern.creator.builder.product;

import lombok.Data;
import lombok.ToString;

/**
 * @className: GPSNavigator
 * @package com.amano.design_pattern.creator.builder
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
@Data
@ToString
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }
}
