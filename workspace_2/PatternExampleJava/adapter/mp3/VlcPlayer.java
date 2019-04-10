package mp3;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.printf("Playing vlc file name: %3s\n", fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
	}

}
