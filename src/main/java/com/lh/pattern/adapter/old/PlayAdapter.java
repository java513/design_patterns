package com.lh.pattern.adapter.old;

/**
 * @ClassName PlayAdapter
 * @Desc //播放器适配器
 * @Author mi
 * @Date 2020/8/8 10:01
 */
public class PlayAdapter implements Player{
    private AdvancedPlayer advancedPlayer;

    public PlayAdapter(String type){
        if("MP4".equals(type)){
            advancedPlayer=new Mp4Play();
        }else if("RMVB".equals(type)){
            advancedPlayer=new RmvbPlayer();
        }
    }

    @Override
    public void play(String type) {
        if("MP4".equals(type)){
            advancedPlayer.playMp4();
        }else if("RMVB".equals(type)){
            advancedPlayer.playRMVB();
        }
    }
}
