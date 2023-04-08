package com.amano.design_pattern.structural.proxy;

import java.util.HashMap;

/**
 * @className: ThirdPartyYouTubeLib
 * @package com.amano.design_pattern.structural.proxy
 * @description: 代理类和服务类的上层接口，如果没有条件实现通过接口实现，可以让代理类继承服务类
 * @author: weifeng
 * @date: 2023/4/8
 **/
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
