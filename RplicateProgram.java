package replicateprogram1;

public class RplicateProgram {

	public static void main(String[] args) {
    String String ="Big black bug bit a big black dog on his big black nose";
    int count;
    //converts the string into lowercase 
    String = String.toLowerCase();
    //split the string into words using built in function
    String words[] = String.split(" ");
     
    System.out.println("replicate words in a given string :");
    for(int i=0;i<words.length;i++) {
    	count=1;
    	for(int j=i+1;j<words.length;j++) {
    		if(words[i].equals(words[j])) {
    			count=1;
    			//set words[j] to 0 to avoid printing visited word
    			words[j]="0";
    		}
    	}
    	//displays the replicate word if count is greater then 1
    	if(count>1 && words[i]!="0")
    		System.out.println(words[i]);
    	}
    
	}
}
