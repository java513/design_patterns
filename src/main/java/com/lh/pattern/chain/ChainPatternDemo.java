package com.lh.pattern.chain;

/**
 * @ClassName ChainPatternDemo
 * @Desc //责任链模式测试类
 * @Author mi
 * @Date 2020/8/8 15:38
 */
public class ChainPatternDemo {

    static final String content = "Dirty Word,Privacy Word,Sensitive Word";

    public static void main(String[] args) {
        AbstractFilter filterChain =  getFilterChain();
        System.out.println(filterChain.filter(content));
    }

    private static AbstractFilter getFilterChain() {
        DirtyFilter dirtyFilter = new DirtyFilter();
        PrivacyFilter privacyFilter = new PrivacyFilter();
        SensitiveFilter sensitiveFilter = new SensitiveFilter();
        dirtyFilter.setNextFilter(privacyFilter);
        privacyFilter.setNextFilter(sensitiveFilter);
        sensitiveFilter.setNextFilter(null);
        return dirtyFilter;
    }
}
