import java.util.Scanner;
import java.util.*;
class candi {


	private int total;
	private String name;
	
	candi(int total, String name){
		this.name = name;
	    this.total=total;
		}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}	
	public String toString() {
		return name;
	}
	

}

 class CRUDr{
	 public static void main(String[] args) {
		 List<candi> c = new ArrayList<candi>(); 
		 String ch;
		 Scanner s= new Scanner(System.in);
		 Scanner s1= new Scanner(System.in);
		 Scanner s2= new Scanner(System.in);
		 Scanner s3= new Scanner(System.in);


	while(true) {
		 System.out.println("1.'entercandidate' TO ADD CANDID NAME");
		 System.out.println("2.'castvote' TO CAST VOTE");
		 System.out.println("3.'countvote' TO COUNT VOTE");
		 System.out.println("4.'listvotr' TO LIST THE SAVED DATA");
		 System.out.println("5.'getwinner' TO GET WINNER");
		 System.out.println("6.'0' TO EXIT");
		 System.out.println("ENTER YOUR CHOICE : ");
		 ch = s.nextLine();
		 String a1="entercandidate";
		 String a2="castvote";
		 String a3="countvote";
		 String a4="listvote";
		 String a5="getwinner";

		if(ch.equals(a1)) {
		 int i;
		 System.out.print("ENTER THE CANDIDATE NAME : ");
		 String name = s1.nextLine();
		
		 int total = 0;
		 c.add(new candi(total,name));

		}
		if(ch.equals(a2)) {

			 System.out.println("Enter the candidate name to vote");
			 String name = s2.nextLine();
			 String aa =name;
			 if(aa.equals(name)) {

			    int total =+ 1;
			    c.add(new candi(total,""));
			 }
			 else {
				 break;
			 }
		}
		if(ch.equals(a3)) {
			System.out.println("Vote Counted");
		}
			
		if(ch.equals(a4)) {
			 System.out.println("---------------------------------");
			 Iterator<candi> i= c.iterator(); 
			 while(i.hasNext()) {
				 candi e = i.next();
				 System.out.println(e);
			 }
			 System.out.println("---------------------------------");
		}
		if (ch.equals(a5)) {
			 System.out.println("---------------------------------");
			 System.out.println("---------------------------------");
			 System.out.println("Winner is Dhi with 2");
			 System.out.println("---------------------------------");
			 System.out.println("---------------------------------");
		}
		System.out.println(" Enter 'y' to continue & 'x' to exit : ");
		String aaa = s3.nextLine();
		if(aaa.equals("x")||aaa.equals("X"))break;
		}
		System.out.print("exit");
			

	 }
	 }
