package com.amano.design_pattern.behavioral.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: Server
 * @package com.amano.design_pattern.behavioral.chain_of_responsibility
 * @description: 授权目标
 * @author: weifeng
 * @date: 2023/4/8
 **/
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * 设置责任链
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
