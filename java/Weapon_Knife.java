public class Weapon_Knife extends Weapon
{
   public Weapon_Knife(int level)
   {
      name = "Knife";
      description = "A simple kitchen knife.";
      damage = (level / 2) + 1;
      accuracy = .5 * ((level / 2) + 1);
      attackTime = 3;
   }
   
}