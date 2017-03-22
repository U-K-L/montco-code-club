/*~~~~~~~~~~~~~
Written by: 
Karl Huff                    
2/23/17
~~~~~~~~~~~~~*/
//This class makes a student player
//with a set name, major, experience,
//and health. Feel free to edit anything.

public class Student
{
   private String name;
   private String major;
   private int[] nextLevel = {50,150,300,500,750,
                              1050,1400,1800,2250,2750};
   private int level = 0;                                                                         
   private int experience;
   private int xpToLevelUp;
   private int health = 100;
   
   //Constructor
   public Student(String n, String m)
   {
      name = n;
      major = m;
      experience = 0;
      level = 0; 
      health = 100;
   }
   
   public Student()
   {
      name = "Student";
      major = "English";
      experience = 0;
      level = 0; 
      health = 100;
   }
   
   /////////////////////////////////////////////////////////////////////
   
   //Mutator Methods
   
   //Set the player's name.
   public void setName(String n)   
   {
      name = n;
   }  
   //Set the player's major
   public void setMajor(String m)   
   {
      major = m;
   }  
   //Give the player experience points
   public void setExperience(int e)   
   {
      experience = experience + e;
     
     
      //Check to see if the player is eligible
      //to level up.
 
      if (experience >= nextLevel[level])
      {
         level++;
         
         System.out.println("Congratulations " + getName() +
                            "! You have upgraded to a level " 
                             +level + " student!"); 
       }
   } 

   //Change players health points 
   //when damaged.
   public void setHealth(int h)
   {
      health = health + h;
   }
   
   
   ////////////////////////////////////////////////////////////////////
   
   //Accessor Methods
   
   public String getName()
   {
      return name;
   }
   
   public String getMajor()
   {
      return major;
   }
   
   public int getExperience()
   {
      return experience;
   }
   
   public int getXpToLevelUp()
   {
      return xpToLevelUp = nextLevel[level] - experience;
   }
   
   public int getLevel()
   {
      return level;
   }
   
   public int gethealth()
   {
      return health;
   }
      
///////////////////////////////////////////////////////////////////////
   
   //toString method to print the contents
   //of a student object to the screen.
   
   public String toString()
   {
      return "Student: " + getName() + "\n"
            + "Major: " + getMajor() + "\n"
            + "Experience: " + getExperience() + "\n"
            + "Experience needed to level up: " + getXpToLevelUp() + "\n"
            + "Level: " + getLevel() + "\n";
            
   }

}  
   
   
   
   
   