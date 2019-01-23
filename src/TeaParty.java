
public class TeaParty {
private String name ;
private Boolean isWoman;
private Boolean isKnighted;
       public String welcome(String name, boolean isWoman, boolean isKnighted)
       {
    	   if(isWoman) {
	if(isKnighted) {
		return "Hello lady " + name;
	}
return "Hello Ms. " + name;
       }
    	   else {
    		   if(isKnighted) {
    			   return "Hello Sir " + name;
    		   }
    	   }
return "Hello Mr. " + name;
}
}