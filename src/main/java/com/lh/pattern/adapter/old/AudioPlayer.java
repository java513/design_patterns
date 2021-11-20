package com.lh.pattern.adapter.old;

/**
 * @ClassName AudioPlayer
 * @Desc //音频播放器
 * @Author mi
 * @Date 2020/8/8 10:09
 */
public class AudioPlayer implements Player{

    private PlayAdapter playAdapter;

    @Override
    public void play(String type) {
        if ("MP3".equals(type)){
            System.out.println("播放MP3文件");
        }else if ("MP4".equals(type)||"RMVB".equals(type)){
            playAdapter=new PlayAdapter(type);
            playAdapter.play(type);
        }
    }
}
