import java.util.*;

public class Menu
{
	Scanner sc = new Scanner(System.in);
	
	//In this method you can test different menus
   public void StartMenu()
   {
	   intro();
	   mainMenu();
	   heroMenu();
	  startGameIntro();
   }
   
   public int mainMenu()
   {
	   int menuSelect = 9999999;
	   String clearBuffer;
	   
	   do{
	   System.out.println("*** Main Menu ***");
	   System.out.println("1 - Start Game");
	   System.out.println("2 - Credits");
	   System.out.println("3 - Quit Game");
	   System.out.print("Selection: ");
	   if(this.sc.hasNextInt())
	   {
		   menuSelect = this.sc.nextInt(); 
	   }
	   else
	   {
		   clearBuffer = this.sc.nextLine();
	   }
	   System.out.println(".");
	   }while(menuSelect!=1 && menuSelect!=2 && menuSelect!=3);
	   clearBuffer = this.sc.nextLine();
	   return menuSelect;
   }
   
   public String heroMenu()
   {
	   String Name = "Nameless";
	   
	   System.out.println("* What is your name? *");
	   System.out.print("Name: ");
	   Name = this.sc.nextLine();
	   
	   System.out.println(".");
	   
	   return Name;
   }
   
   public void startGameIntro()
   {
	   System.out.println("   _____________________________________________");
	   System.out.println("   /|                                             |\\");
	   System.out.println("  / |             ===================             | \\");
	   System.out.println(" /  |             | | | | | | | | | |             |  \\");
	   System.out.println("|   |             | | | | | | | | |<|             |   |");
	   System.out.println("|   |         ()  | | | | | | | | | |  ()         |   |");
	   System.out.println("|   |         ::  | | | | | | | | | |  ::         |   |");
	   System.out.println("|   |         ::  | | | | | | | | | |  ::         |   |");
	   System.out.println("|   |        [~~] | | | | | | | | | | [~~]        |   |");
	   System.out.println("|   |         --  | | | | | | | | | |  --         |   |");
	   System.out.println("|   |             ++++++++++++++++++|             |   |");
	   System.out.println("|   |             |{}  Cell AC34   <|             |   |");
	   System.out.println("|   |             ++++++++++++++++++|             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | |<|             |   |");
	   System.out.println("|   |_____________|_|_|_|_|_|_|_|_|_|_____________|   |");
	   System.out.println("|  /                                               \\  |");
	   System.out.println("| /                                                 \\ |");
	   System.out.println("|/                                                lc \\|");
	   System.out.println(".");
	   System.out.println(".");
	   System.out.print("  You have been in cell AC34 for 20 years. Days seem like months and months seem like years, it all\n blends together as you try to");
	   System.out.print("get a grasp on what is real and what is in infront of your eyes. As you sit there, like so many\n years, in your cell you hear an");
	   System.out.print("EXPLOSION followed by cries of help. You just get to your feet and find that the explosion has\n blown");
	   System.out.print(" a hole right out of your cell, as you peek outside for the first time you see pure chaos. Prisoners running\n around killing, guards");
	   System.out.print(" fending off prisoners and you know that this is your chance, your chance to ESCAPE FROM SPACE PRISON.\n You know on the 3rd");
	   System.out.print(" floor there are escape pods for the guards to leave if this such an event happened.\n If you make it in time I bet you can get one");
	   System.out.print(" but along the way you might need to fight off some prisoners. GET MOVING!!!\n.\n.\n");
   }
   
   public void intro()
   {
	   
	   System.out.println("               *     .--.             +");
	   System.out.println("                    / /  `");
	   System.out.println("    +              | |           *");
	   System.out.println("          '         \\ \\__,");
	   System.out.println("      *          +   '--'  *");
	   System.out.println("               +   /\\ ");
	   System.out.println("  +              .'  '.               *");
	   System.out.println("         *      /======\\   +");
	   System.out.println("               ;:.  _   ;");
	   System.out.println("               |:. (_)  |        *");
	   System.out.println("               |:.  _   |");
	   System.out.println("     +         |:. (_)  |          *");
	   System.out.println("               ;:.      ;");
	   System.out.println("             .' \\:.    / `.");
	   System.out.println("            / .-'':._.'`-. \\");
	   System.out.println("            |/    /||\\    \\|");
	   System.out.println("  *               ''''           *   ");
	   System.out.println("        +         ''''     +");
	   System.out.println("");
	   System.out.println("");
	   System.out.println(" _____                          ______                     _____                       ______     _                 ");
	   System.out.println(" |  ___|                         |  ___|                   /  ___|                      | ___ \\   (_)          ");
	   System.out.println(" | |__ ___  ___ __ _ _ __   ___  | |_ _ __ ___  _ __ ___   \\ `--. _ __   __ _  ___ ___  | |_/ / __ _ ___  ___  _ __ ");
	   System.out.println(" |  __/ __|/ __/ _` | '_ \\ / _ \\ |  _| '__/ _ \\| '_ ` _ \\   `--. \\ '_ \\ / _` |/ __/ _ \\ |  __/ '__| / __|/ _ \\| '_ \\ ");
	   System.out.println(" | |__\\__ \\ (_| (_| | |_) |  __/ | | | | | (_) | | | | | | /\\__/ / |_) | (_| | (_|  __/ | |  | |  | \\__ \\ (_) | | | |");
	   System.out.println(" \\____/___/\\___\\__,_| .__/ \\___| \\_| |_|  \\___/|_| |_| |_| \\____/| .__/ \\__,_|\\___\\___| \\_|  |_|  |_|___/\\___/|_| |_|");
	   System.out.println("");
	   System.out.println("");
   }
}