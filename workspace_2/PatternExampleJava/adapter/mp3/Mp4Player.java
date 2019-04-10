package mp3;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String fileName) {
		System.out.printf("Playing mp4 file name: %3s\n", fileName);
	}

}
