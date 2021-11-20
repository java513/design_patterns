package com.lh.pattern.adapter.old;

/**
 * @ClassName Mp4Play
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 9:59
 */
public class Mp4Play implements AdvancedPlayer {
    @Override
    public void playMp4() {
        System.out.println("播放Mp4格式的文件");
    }

    @Override
    public void playRMVB() {

    }
}
