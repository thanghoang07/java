package mp3;

public class MediaAdapter implements MediaPlayer {
	public AdvancedMediaPlayer adv;

	public MediaAdapter(AudioType audioType) {
		super();
		switch (audioType) {
		case MP4:
			adv = new Mp4Player();
			break;
		case VLC:
			adv = new VlcPlayer();
			break;

		default:
			break;
		}
	}

	@Override
	public void play(AudioType audioType, String fileName) {
		switch (audioType) {
		case MP4:
			adv.playMp4(fileName);
			break;
		case VLC:
			adv.playVLC(fileName);
			break;

		default:
			break;
		}
	}
}
