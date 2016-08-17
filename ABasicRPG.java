import java.util.*;
public class ABasicRPG {
	public static void main(String[]args){
		ArrayList<String> monsternames= new  ArrayList<String>();
		Random generator=new Random();
		boolean keepaddingstuff=true;
		while(keepaddingstuff){
			monsternames.add("Dweeb");
			monsternames.add("DweebBoy");
			monsternames.add("DweebGirl");
			monsternames.add("SiddharthGautamModibusonthefloordancing Patel");//Name of final boss LOL
			keepaddingstuff=false;
		}

		int expcount=0;
		int turncount=1;
		Scanner in=new Scanner (System.in);
		Random gen = new Random();

		int hpstat=5,strstat=3, choice;
		int monsterhp,monsterstr;
		System.out.println("This is a basic rpg! Dont expect much lol. \n What is your name?");
		String name=in.nextLine();
		System.out.println("Ahh, " + name+ " that is a good name sir!");
		System.out.println( "The king has told me to tell you about the story so far, so the thing is that he is about to die.."
				+ ". and you for some reason are chosen as the succesor. Anyway, I gotta go now! BYE!!!, " + name );

		System.out.println("As you see the castle in the distance, you begin to walk toward it. But then, a monster appears!");
		String s=in.nextLine();
		monsterhp=10;//monster stats (health)
		monsterstr=1;//monster stats (strength)
		while (true){
			//Battle Begins!
			
			
			System.out.println("Turn: " + turncount);
			System.out.println(dispStats(name,hpstat,strstat));	
			System.out.println(dispStats(monsternames.get(0),monsterhp,monsterstr));	
			System.out.println("turn number: " + turncount);
			System.out.println("What will you do? Type 1 for fight for 2 for run away!");
			choice=in.nextInt();
			if(choice==1){
				System.out.println(name + " attacks and " + monsternames.get(0) + " loses "+ strstat + "HP.");
				monsterhp=monsterhp-strstat;

			}
			if (choice==2){

				System.out.println("Are you really going to be a wimp and leave from a battle that is meant to ease you into the game? ");

			}
			System.out.println(monsternames.get(0)+ " attacks and "+ name+ " loses "+ monsterstr +"HP."  );
			hpstat=hpstat-monsterstr;
			if(monsterhp<=0){
				System.out.println("You have won the battle!");
				expcount=200;
				System.out.println("You gained "  +expcount + "exp! ");

				if(expcount>100){
					expcount=0;
					System.out.println("Your stats went up! ");
					System.out.println ("Hp:" + levelUp(hpstat)+hpstat);
					System.out.println("Strength: " + levelUp(strstat)+strstat);
				}


				break;
			}
			if(hpstat<=0){// leave at end of each battle for death and program quit
				System.out.println("U DIED");
				System.exit(0);
			}
			turncount++;
			
		}//end of while true

	}

	public static String dispStats(String charname, int hp, int strength){
		String statname= new String(charname+ "\nHP= " +hp +"\nSTRENGTH= " + strength);
		return statname;
	}
	public static boolean runAway(){
		Random generator=new Random();
		if (generator.nextInt(3)==1){
			return true;
		}
		return false;}
	public static int levelUp(int stat){
		Random generator=new Random();
		int statincrease=generator.nextInt(3);
		int newstat=stat+statincrease;
		return newstat;


	}



}
