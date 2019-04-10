package dataobjects;

public enum Direction {
	/**
	 * Move Up
	 */
	UP(0, "Lên"),

	/**
	 * Move Right
	 */
	RIGHT(1, "Phải"),

	/**
	 * Move Down
	 */
	DOWN(2, "Xuống"),

	/**
	 * Move Left
	 */
	LEFT(3, "Trái");

	/**
	 * The numeric code of the status
	 */
	private final int code;

	/**
	 * The description of the status
	 */
	private final String description;

	/**
	 * Constructor
	 * 
	 * @param code
	 * @param description
	 */
	private Direction(final int code, final String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * Getter for code.
	 * 
	 * @return
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Getter for description.
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Overloads the toString and returns the description of the move.
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return description;
	}
}
