import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("code", 3);
    printNums();
    uprightNumberTriangle(5);
    starTree();
    multTable();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String str = word.substring(i, i+1);
      for (int i2 = 0; i2 < N; i2++)
      {
        System.out.print(str);
      }
    }
    System.out.println("");
  }

  public static void printNums()
  {
    for (int i = 10; i > 0; i--)
    {
      for (int n = 0; n < i; n++)
      {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int i = 1; i <= N; i++)
    {
      for (int j = 1; j <= i; j++)
      {
        System.out.print(j + " ");
      }
      System.out.println(" ");
    }
  }

  public static void starTree()
  {
    for (int i = 0; i <= 9; i++)
    {
      for (int space = 0; space < i; space++)
      {
        System.out.print(" ");
      }
      for(int star = i; star <= 9; star++)
      {
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }

  public static void multTable()
  {
    for (int i = 1; i < 11; i++)
    {
      for (int num = 1; num <= 10; num++)
      {
        System.out.print((num * i) + " ");
      }
      System.out.println(" ");
    }
  }
}
