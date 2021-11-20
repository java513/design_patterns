package com.lh.pattern.chain;

/**
 * @ClassName Sensitive
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 15:37
 */
public class SensitiveFilter extends AbstractFilter {
    @Override
    protected String doFilter(String content) {
        return content.replace("Sensitive Word","sw");
    }
}
