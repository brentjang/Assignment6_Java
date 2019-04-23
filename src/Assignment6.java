// contains constructors and necessary mutations/accessors
public class Foothill 
{
   public static void main(String[] args) 
   {
      // four constructors with different parameters
      TripleString run1 = new TripleString("hello", "hey", "hi"); 
      TripleString run2 = new TripleString("", "", ""); 
      TripleString run3 = new TripleString("abc", "", "xyz");
      TripleString run4 = new TripleString("", "", "bye");
      TripleString run5 = new TripleString(); 
      
      // print all 5 runs
      System.out.println("5 Runs with different constructor parameters");
      System.out.println("run1" + "\n" + run1);
      System.out.println("run2" + "\n" + run2);
      System.out.println("run3" + "\n" + run3);
      System.out.println("run4" + "\n" + run4);
      System.out.println("run5" + "\n" + run5);
      System.out.println();
      
      // mutate all objects
      System.out.println("Mutate one or more objects in each run");
      run1.setString1("red");
      run1.setString2("orange");
      run2.setString3("blue");
      run3.setString1("green");
      run3.setString2("pink");
      run4.setString3("purple");
      run5.setString3("magenta");
      System.out.println();
      
      // displays runs after mutators
      System.out.println("Display all runs again");
      System.out.println("run1" + "\n" + run1);
      System.out.println("run2" + "\n" + run2);
      System.out.println("run3" + "\n" + run3);
      System.out.println("run4" + "\n" + run4);
      System.out.println("run5" + "\n" + run5);
      System.out.println();
     
      // explicit mutator calls
      System.out.println("Explicit Mutator Call");
      if(run2.setString1("yellow"))
      {
         System.out.println("run2.setString1(\"yellow\") "
               + "= successful mutation");
      }
      else
      {
         System.out.println("run2.setString1(\"yellow\") "
               + "= unsuccessful mutation");
      }
      if(run2.setString3(""))
      {
         System.out.println("run2.setString3(\"\") "
               + "= successful mutation");
      }
      else
      {
         System.out.println("run2.setString3(\"\") "
               + "= unsuccesfful mutation");
      }
      System.out.println();
      
      //accessor calls
      System.out.println("Accessor Calls");
      System.out.println("run1.getString1() : " + run1.getString1());
      System.out.println("run5.getString3() : " + run5.getString3());
   }
}

// includes constructor, set string, get string, and printed output
class TripleString
{
   private String string1;
   private String string2;
   private String string3;
   
   // irrelevant constants
   public static final String DEFAULT_STRING = " (undefined) ";
   public static final int MIN_LEN = 1;
   public static final int MAX_LEN = 50;
   
   // constructor with three parameters
   public TripleString(String str1, String str2, String str3)
   {
      if(!setString1(str1))
      {
         string1 = DEFAULT_STRING;
      }
      if(!setString2(str2))
      {
         string2 = DEFAULT_STRING;
      }
      if(!setString3(str3))
      {
         string3 = DEFAULT_STRING;
      }
   }
   
   // constructor with no parameters
   public TripleString()
   {
      string1 = DEFAULT_STRING;
      string2 = DEFAULT_STRING;
      string3 = DEFAULT_STRING;
   }

   // checks if each string meets criteria
   private static boolean validString(String str)
   {
      if(str != null && str.length() >= MIN_LEN 
            && str.length() <= MAX_LEN)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   // sets string1 to new string if valid
   public boolean setString1(String str1) 
   {
      if(!validString(str1))
      {
         return false;
      }
      else
      {
         this.string1 = str1;
         return true;
      }         
   }
   
   // sets string2 to new string if valid
   public boolean setString2(String str2) 
   {
      if(!validString(str2))
      {
         return false;

      }
      else
      {
         this.string2 = str2;
         return true;
      }         
   }
   
   // sets string3 to new string if valid
   public boolean setString3(String str3) 
   {
      if(!validString(str3))
      {
         return false;
      }
      else
      {
         this.string3 = str3;
         return true;
      }         
   }
   
   // return string1
   public String getString1() 
   {
      return string1;
   }
   
   // return string2
   public String getString2() 
   {
      return string2;
   }

   // return string3
   public String getString3() 
   {
      return string3;
   }
   
   // formatted output for each run
   public String toString()
   {
      String string = "string1: " + string1 + ", string2: " 
            + string2 + ", string3: " + string3;
      return string;
   }
}

/*5 Runs with different constructor parameters
run1
string1: hello, string2: hey, string3: hi
run2
string1:  (undefined) , string2:  (undefined) , string3:  (undefined) 
run3
string1: abc, string2:  (undefined) , string3: xyz
run4
string1:  (undefined) , string2:  (undefined) , string3: bye
run5
string1:  (undefined) , string2:  (undefined) , string3:  (undefined) 

Mutate one or more objects in each run

Display all runs again
run1
string1: red, string2: orange, string3: hi
run2
string1:  (undefined) , string2:  (undefined) , string3: blue
run3
string1: green, string2: pink, string3: xyz
run4
string1:  (undefined) , string2:  (undefined) , string3: purple
run5
string1:  (undefined) , string2:  (undefined) , string3: magenta

Explicit Mutator Call
run2.setString1("yellow") = successful mutation
run2.setString3("") = unsuccesfful mutation

Accessor Calls
run1.getString1() : red
run5.getString3() : magenta
*/