/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S6E5;

/**
 *
 * @author einarjonsson
 */
class NamedPatient {
   private int age;
   private boolean allergicToGluten;
   private boolean pregnant;
   private String name;
   
   //--------------------------------------------------------------------------
   //  Constructor - sets default values for age, allergicToGluten and pregnant.
   //--------------------------------------------------------------------------
   public NamedPatient ()
   {
      age = 0;
      allergicToGluten = false;
      pregnant = false;
      name = "";
   }
   
   //--------------------------------------------------------------------------
   //  Sets age to the value of the parameter.
   //--------------------------------------------------------------------------
   public void setAge (int ageValue)
   {
      age = ageValue;
   }
   
   //--------------------------------------------------------------------------
   //  Sets allergicToGluten to the value of the parameter.
   //--------------------------------------------------------------------------
   public void setAllergicToGluten (boolean glutenValue)
   {
      allergicToGluten = glutenValue;
   }
   
   //--------------------------------------------------------------------------
   //  Sets pregnant to the value of the parameter.
   //--------------------------------------------------------------------------
   public void setPregnant (boolean pregnantValue)
   {
      pregnant = pregnantValue;
   }
   
   public void setName (String nameValue)
   {
       name = nameValue;
   }
   
   //--------------------------------------------------------------------------
   //  Returns the current value of age.
   //--------------------------------------------------------------------------
   public int getAge ()
   {
      return age;
   }
   
   //--------------------------------------------------------------------------
   //  Returns the current value of allergicToGluten.
   //--------------------------------------------------------------------------
   public boolean getAllergicToGluten ()
   {
      return allergicToGluten;
   }
   
   //--------------------------------------------------------------------------
   //  Returns the current value of pregnant.
   //--------------------------------------------------------------------------
   public boolean getPregnant ()
   {
      return pregnant;
   }
   
   public String getName ()
   {
       return name;
   }
}
