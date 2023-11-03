import java.time.LocalTime;

public interface MediaPlayer {
    void play(String filename);
    void pause();
    void stop();
    void fullScreen();
    void resumeFromTime(LocalTime time);
}

class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing audio file " + filename);
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio file");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio file");
    }

    @Override
    public void fullScreen() {
        throw new UnsupportedOperationException("Audio files cannot be played in full screen");
    }

    @Override
    public void resumeFromTime(LocalTime time) {
        throw new UnsupportedOperationException("Audio files cannot be resumed from a specific time");
    }
}

class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing video file " + filename);
    }

    @Override
    public void pause() {
        System.out.println("Pausing video file");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video file");
    }

    @Override
    public void fullScreen() {
        System.out.println("Playing video file in full screen");
    }

    @Override
    public void resumeFromTime(LocalTime time) {
        System.out.println("Resuming video file from time " + time);
    }
}