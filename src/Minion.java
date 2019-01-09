
public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
Minion(String name, int eyes, String color, String master){
	this.color = color;
	this.eyes = eyes;
	this.name = name;
	this.master = master;
}
public String getName() {
	return name;
}
public int getEyes() {
	return eyes;
}
public String getColor() {
	return color;
}
public void setMaster(String master) {
	this.master = master;
}
public String getMaster() {
	return master;
}
}
