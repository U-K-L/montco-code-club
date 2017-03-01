/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
Written by: 
 ____  __.            .__      ___ ___         _____  _____ 
|    |/ _|____ _______|  |    /   |   \ __ ___/ ____\/ ____\
|      < \__  \\_  __ \  |   /    ~    \  |  \   __\\   __\ 
|    |  \ / __ \|  | \/  |__ \    Y    /  |  /|  |   |  |   
|____|__ (____  /__|  |____/  \___|_  /|____/ |__|   |__|   
        \/    \/                    \/                      
                                                   2/23/17
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
//This class makes a student player
//with a set name, major, experience,
//and health. Feel free to edit anything.

public class Student
{
   private String name;
   private String major;
   private int experience;
   private int health = 100;
   
   //Constructor
   public Student(String n, String m)
   {
      name = n;
      major = m;
      
      int x = 0;
      experience = x;
      
      int h = 100;
      health = h;
   }
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
   }   
   //Change players health points 
   //when damaged.
   public void setHealth(int h)
   {
      health = health + h;
   }
   //Mutator Methods
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
   
   public int health()
   {
      return health;
   }
      

}  
   