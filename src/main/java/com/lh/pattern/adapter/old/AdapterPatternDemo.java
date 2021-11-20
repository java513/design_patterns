package com.lh.pattern.adapter.old;

/**
 * @ClassName AdapterPatternDemo
 * @Desc //适配器模式测试类
 * @Author mi
 * @Date 2020/8/8 10:11
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3");
        audioPlayer.play("MP4");
        audioPlayer.play("RMVB");
    }
}
