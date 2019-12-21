package com.huaxu.core.curr.basic.A_semaphore.runDemo;

import java.util.concurrent.Semaphore;

/**
 * 操场，有5个跑道
 * Created by Xingfeng on 2016-12-09.
 */
public class Playground {

    /**
     * 跑道类
     */
    static class Track {
        private int num;

        public Track(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Track{" +
                    "num=" + num +
                    '}';
        }
    }

    private Track[] tracks = {
            new Track(1), new Track(2), new Track(3), new Track(4), new Track(5)};
    private volatile boolean[] used = new boolean[5];

    private Semaphore semaphore = new Semaphore(5, true);

    /**
     * 获取一个跑道
     */
    public Track getTrack() throws InterruptedException {

        semaphore.acquire(1);
        return getNextAvailableTrack();
    }

    /**
     * 遍历，找到一个没人用的跑道
     * @return
     */
    private Track getNextAvailableTrack() {

        for (int i = 0; i < used.length; i++) {
            if (!used[i]) {
                used[i] = true;
                return tracks[i];
            }
        }
        return null;
    }

    /**
     * 返回一个跑道
     *
     * @param track
     */
    public void releaseTrack(Track track) {
        if (makeAsUsed(track))
            semaphore.release(1);
    }



    /**
     * 返回一个跑道
     *
     * @param track
     */
    private boolean makeAsUsed(Track track) {

        for (int i = 0; i < used.length; i++) {
            if (tracks[i] == track) {
                if (used[i]) {
                    used[i] = false;
                    return true;
                }
            }
        }
        return false;
    }

}
