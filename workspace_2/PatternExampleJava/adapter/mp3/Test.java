package mp3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer au = new AudioPlayer();

		au.play(AudioType.MP3, "ABC.mp3");
		au.play(AudioType.MP4, "alone.mp4");
		au.play(AudioType.VLC, "hello.vlc");
		au.play(AudioType.LOSSNEST, "alone.lossnest");
	}

}
