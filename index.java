public class index
{
  public static void main(String args[])
  {
    int row, column, numberOfRows=8;
    for(row=0; row<numberOfRows; row++)
    {
      for(column=0; column<=row; column++)
      {
        System.out.print("* ");
      }
      //This is just to print the stars in new line after each row
      System.out.println();
    }
  }
}
