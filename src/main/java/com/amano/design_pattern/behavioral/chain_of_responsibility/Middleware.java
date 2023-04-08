package com.amano.design_pattern.behavioral.chain_of_responsibility;

/**
 * @className: Middleware
 * @package com.amano.design_pattern.behavioral
 * @description: 责任链中所有处理者的抽象接口
 * @author: weifeng
 * @date: 2023/4/8
 **/
public abstract class Middleware {
    /**
     * 每个处理者中包含一个对下个处理者的引用，以传递处理请求
     */
    private Middleware next;

    /**
     * 构建责任链
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * 所有的处理者必须实现的处理逻辑
     */
    public abstract boolean check(String email, String password);

    /**
     * 处理者检查是否可以交给下一个处理者进行的逻辑
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
