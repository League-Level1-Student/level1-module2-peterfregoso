
public class SmurfRunner {
public static void main(String[] args) {
	Smurf papa = new Smurf ("papa smurf");
	Smurf smurf2 = new Smurf ("smurfette");
System.out.println(papa.getName()+ papa.isGirlOrBoy());	//papa.getName()+
	System.out.println( smurf2.getName() +smurf2.isGirlOrBoy()    );
	TeaBag green= new TeaBag("green");
	
	green.getFlavor();
	Kettle ket = new Kettle();
	ket.getWater();
	ket.boil();
	Cup cup = new Cup();
	cup.makeTea(green, ket.getWater());
}
}
