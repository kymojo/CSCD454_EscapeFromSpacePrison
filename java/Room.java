public class Room
{
   //ItemsList[]
   //EnemiesList[]
   String Description;
   String Type;


   public void MakeDescription()
   {
	   this.Description = "Room Description";
	   
   }

   //Make Items for the rooms
   public void MakeItems()
   {
	   
   }
   
   //Make Enemies for the rooms
   public void MakeEnemies()
   {
	   
   }

   public String getDescription()
   {
	   return this.Description;
   }
   
   //Get the type of room
   public String getType()
   {
	   return this.Type;
   }
   
   
}