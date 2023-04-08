package com.amano.design_pattern.structural.proxy;

import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @className: YouTubeCacheProxy
 * @package com.amano.design_pattern.structural.proxy
 * @description: 代理类
 * @author: weifeng
 * @date: 2023/4/8
 **/
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib{
    private ThirdPartyYouTubeLib thirdPartyYouTubeLib;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy() {
        this.thirdPartyYouTubeLib = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = thirdPartyYouTubeLib.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = thirdPartyYouTubeLib.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
