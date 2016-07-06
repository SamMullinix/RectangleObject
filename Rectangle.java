/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Assignment:    12
 * Program:       1
 * ProgramName:   Rectangle
 * Purpose:       To be used as a blue print for creating rectangle objects and calculating the area
 *                and the perimeter.
 * Operation:     Program has constructors and methods to return the area and the perimeter.  
 * Input(s):      None
 * Output(s):     None
 * Methodology:   The program creates rectangle objects and based on the width and heigth of the rectangle 
 *                and area and perimeter.
 *                
 */  
 
public class Rectangle
{

   double width = 1;
   double height = 1;

   Rectangle() // No arg constructor.
   {
   }

   Rectangle(double newWidth, double newHeight) // Constructor with width and height.
   {
      width = newWidth;
      height = newHeight;
   }

   public double getArea() // Get the area.
   {
      return width * height;
   }

   public double getPerimeter()  // Get the perimeter.
   {
      return (width + width + height + height);
   }
}
