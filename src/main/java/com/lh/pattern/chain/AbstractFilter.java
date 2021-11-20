package com.lh.pattern.chain;

/**
 * @ClassName AbstractFilter
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 15:32
 */
public abstract class AbstractFilter {
    AbstractFilter nextFilter;
    public void setNextFilter(AbstractFilter nextFilter){
        this.nextFilter=nextFilter;
    }
    public String filter(String content){
        String filtered = doFilter(content);
        if(nextFilter!=null){
            return nextFilter.filter(filtered);
        }
        return filtered;
    }

    protected abstract String doFilter(String content);
}
