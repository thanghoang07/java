package vacworld;


public class Direction {

	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;

//Mang de xac dinh su thay doi vi tri X se tuong ung voi buoc di trong huong chi muc
	public static final int[] DELTA_X = new int[4];

//Mang de xac dinh su thay doi vi tri Y se tuong ung voi buoc di trong huong chi muc
	public static final int[] DELTA_Y = new int[4];

	//gan gia tri khoi dau cho mang DELTA_X, DELTA_Y 
	static {
		DELTA_X[NORTH] = 0;
		DELTA_X[EAST] = 1;
		DELTA_X[SOUTH] = 0;
		DELTA_X[WEST] = -1;

		DELTA_Y[NORTH] = -1;
		DELTA_Y[EAST] = 0;
		DELTA_Y[SOUTH] = 1;
		DELTA_Y[WEST] = 0;
	}

	public static String toString(int direction) {
		switch(direction) {
		case NORTH:
			return "NORTH";
		case EAST:
			return "EAST";
		case SOUTH:
			return "SOUTH";
		case WEST:
			return "WEST";
		default:
			return "INVALID";
		}
	}
}
