package mp3;

public class AudioPlayer implements MediaPlayer {
	public MediaPlayer meA;

	@Override
	public void play(AudioType audioType, String fileName) {
		switch (audioType) {
		case MP3:
			System.out.printf("Playing mp3 file name: %3s\n", fileName);
			break;
		case MP4:
			meA = new MediaAdapter(audioType);
			meA.play(audioType, fileName);
			break;
		case VLC:
			meA = new MediaAdapter(audioType);
			meA.play(audioType, fileName);
			break;

		default:
			System.out.printf("Invalid media %3s format not supported\n", audioType);
			break;
		}
	}
}
