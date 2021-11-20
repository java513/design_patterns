package com.lh.pattern.chain;

/**
 * @ClassName DirtyFilter
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 15:36
 */
public class DirtyFilter extends AbstractFilter {
    @Override
    protected String doFilter(String content) {
        return content.replace("Dirty Word","dw");
    }
}
