package com.amano.design_pattern.behavioral.chain_of_responsibility;

/**
 * @className: RoleCheckMiddleware
 * @package com.amano.design_pattern.behavioral.chain_of_responsibility
 * @description: 检查登录人权限的处理者
 * @author: weifeng
 * @date: 2023/4/8
 **/
public class RoleCheckMiddleware extends Middleware{
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
