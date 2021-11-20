package com.lh.pattern.adapter.old;

/**
 * @ClassName RmvbPlayer
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 10:00
 */
public class RmvbPlayer implements AdvancedPlayer{
    @Override
    public void playMp4() {

    }

    @Override
    public void playRMVB() {
        System.out.println("播放RMVB格式文件");
    }
}
