public class CargoHoldItemFactory extends ItemFactory
{
   public CargoHoldItemFactory()
   {
      this.items.add("heavyblaster");
      this.items.add("grenade");
      this.items.add("plasma");
      this.items.add("apple");
      this.items.add("lasersword");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("heavyblasetr"))
      {
         return new HeavyBlaster(level);
      }
      else if(name.equals("grenade"))
      {
         return new FragGrenade(level);
      }
      else if(name.equals("plasma"))
      {
         return new PlasmaRifle(level);
      }
      else if(name.equals("apple"))
      {
         return new Apple(level);
      }
      
      return new LaserSword(level);
      
   }
   
   public  Item getBossWeapon(int level)
   {
      return new LaserSword(level);
   }
   
   public  Item getBossArmor(int level)
   {
      return LightArmor(level);
   }
   
   public  Item getBossItem(int level)
   {
      return new FragGrenade(level);
   }

}