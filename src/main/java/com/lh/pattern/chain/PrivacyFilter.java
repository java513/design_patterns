package com.lh.pattern.chain;

/**
 * @ClassName PrivacyFilter
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 15:36
 */
public class PrivacyFilter extends AbstractFilter {
    @Override
    protected String doFilter(String content) {
        return content.replace("Privacy Word","pw");
    }
}
