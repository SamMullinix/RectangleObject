/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Assignment:    12
 * Program:       1
 * ProgramName:   TestRectangle
 * Purpose:       To implemnt the program Rectangle by creating rectangle objects and printing out
 *                the specifics of each recangle.
 * Operation:     Program prompts for the creation of 3 rectangle and returns their width, area, and perimeter.  
 * Input(s):      None.
 * Output(s):     Output the width heighth perimeter and area of each of the rectangles.
 * Methodology:   The program creates the rectangles, then it prints to the user all of the attributes of
 *                each of the rectangles.
 *                
 */  
 
public class TestRectangle
{
   public static void main (String[] args)
   {
   
      /******************************************************************************
      *                                Create Objects                               *
      ******************************************************************************/
      
      Rectangle rectangle1 = new Rectangle(4, 40); // Create the three rectangle obejcts.
      Rectangle rectangle2 = new Rectangle(3.5, 35.9);
      Rectangle rectangle3 = new Rectangle();
   
      /******************************************************************************
      *                               Output Section                                *
      ******************************************************************************/
      
      // Print rectangle 1.
      System.out.print("A rectangle of width " + rectangle1.width + " and height " +
         rectangle1.height + " has a perimeter of " + rectangle1.getPerimeter() +
         " and an area of " + rectangle1.getArea());
         
      // Print rectangle 2.
      System.out.print("\nA rectangle of width " + rectangle2.width + " and height " +
         rectangle2.height + " has a perimeter of " + rectangle2.getPerimeter() +
         " and an area of " + rectangle2.getArea());
      
      // Print rectangle 3.
      System.out.print("\nA rectangle of width " + rectangle3.width + " and height " +
         rectangle3.height + " has a perimeter of " + rectangle3.getPerimeter() +
         " and an area of " + rectangle3.getArea());
   }
}