package com.amano.design_pattern.structural.proxy;

/**
 * @className: Video
 * @package com.amano.design_pattern.structural.proxy
 * @description: TODO 类描述
 * @author: weifeng
 * @date: 2023/4/8
 **/
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
