public class Main {
	
	public static String chaineTab(String[] tabChaine){
		String ChaineRes = "";
		int j = 0;
		for(String i : tabChaine){
			if(j==0) {
		    ChaineRes = i;
			j++;
			}else ChaineRes = ChaineRes+","+i;
		}
		return ChaineRes;
	}
	
	
	public static String[] fractionneChaine(String chaine,char separe){
		String[] tabChaineRes;
		String mot = "";
		int j = 0;
		int k = -1;
		for(int i = 0; i<chaine.length() ; i++)
		   if(chaine.charAt(i) == separe)
			   if((i != 0) && (i != (chaine.length()-1))){
				   if(i!=(k+1)){
				      j++;
				      }
				    k = i;
			   }
		j++;
		tabChaineRes = new String[j];
		j = 0;
		k=-1;
		for(int i = 0; i<chaine.length() ; i++){
			if(chaine.charAt(i) == separe){
				 if(i != 0){
					 if(i!=(k+1)){
					 tabChaineRes[j] = mot; 
					 j++;
				   }
				    k = i;
				 }
			  mot = "";
			  }
			else {
			     mot += Character.toString(chaine.charAt(i));
			 }
		}
		if(chaine.charAt(chaine.length() - 1) != separe)
		tabChaineRes[j] = mot;	
		return tabChaineRes;	
     	}
	
     	/*public static String extractMot(String chaine , int i){
		  String motRes = "";
		  
		  while()
		  
		  return motRes;
	     }
	
     	
        public static String elemineMotVide(){
        	String[] motVide = {"non","et","ou","à"};
        	
        }
	   */ 
	
	
	public static void main(String[] args){
          String test = "debbihmustaaphamine";
          String[] tab = fractionneChaine(test,'a');
          
          for(String chaine : tab){
        	  System.out.println(chaine);
          }      
	}
	
	
}
