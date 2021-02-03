package com.tactfactory.designpatternniveau1.adapter.tp1;

import com.tactfactory.designpatternniveau1.adapter.tp1.model.*;


public class AdapterTp1 {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("mp3", "callofkthulu.mp3");
    audioPlayer.play("mp4", "thestage.mp4");
    audioPlayer.play("vlc", "the wrong side of heaven.vlc");
    audioPlayer.play("avi", "hardcoredubstep.avi");

    MediaPlayer player = new MediaAdapter("mp4");
    player.play("mp4", "test.mp4");

    MediaPlayer player1 = new AudioPlayer();
    player1.play("mp4", "test1.mp4");
  }
}
