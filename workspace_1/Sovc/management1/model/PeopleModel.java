package model;

public abstract class PeopleModel {
	protected String code, name, dob, pob;

	public abstract void setData(String code, String name, String dob, String pob);

	public abstract void removeData(String code, String name, String dob, String pob);
}
