package caro;

import java.awt.Image;
import util.ImageCaro;;

public enum Player {
	AI("black", "BLACK", 1), HM("white", "WHITE", 2), HM1("black", "BLACK", 1), HM2("white", "WHITE", 2);

	private Image image;
	private String typeColor;
	private int hashValue;
	private ImageCaro imgIcon = new ImageCaro();

	Player(String ImgName, String typeColor, int hashValue) {
		this.image = imgIcon.getImage(ImgName);
		this.typeColor = typeColor;
		this.hashValue = hashValue;
	}

	public Image getImg() {
		return image;
	}

	public String getTypeColor() {
		return typeColor;
	}

	public int getHashValue() {
		return hashValue;
	}

	public Player getOpponent() {
		if (this == AI)
			return Player.HM;
		return Player.AI;
	}
	
	public Player getOpponent2(){
		if(this == HM1)
			return Player.HM2;
		return Player.HM1;
	}
}