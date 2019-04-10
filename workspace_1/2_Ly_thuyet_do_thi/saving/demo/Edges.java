package demo;

public class Edges implements Comparable {
	private int src, des, trongSo;

	public Edges(int src, int des, int trongSo) {
		this.src = src;
		this.des = des;
		this.trongSo = trongSo;
	}

	public int getSrc() {
		return src;
	}

	public void setSrc(int src) {
		this.src = src;
	}

	public int getDes() {
		return des;
	}

	public void setDes(int des) {
		this.des = des;
	}

	public int getTrongSo() {
		return trongSo;
	}

	public void setTrongSo(int trongSo) {
		this.trongSo = trongSo;
	}

	@Override
	public int compareTo(Object arg0) {
		Edges edge = (Edges) arg0;
		if (this.trongSo < edge.getTrongSo()) {
			return -1;
		} else if (this.trongSo > edge.getTrongSo()) {
			return 1;
		} else
			return 0;
	}

}
