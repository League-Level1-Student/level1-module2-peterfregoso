
public class person {
private String name;
private String superpower;
person(String name, String superpower){
	this.name= name;
	this.superpower = superpower;
}
public String getname() {

	return name;
}
public String getsuperpower() {

	return superpower;
	
}
public void setname(String name) {
	this.name = name;
}
public void setSauce(String superpower) {
	this.superpower = superpower;
}
public String   toString() {
	String i = name + " has mad " + superpower + " skills";
return  i;
}
}
