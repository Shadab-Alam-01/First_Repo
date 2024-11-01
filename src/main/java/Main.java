import java.util.Scanner;

public class Main{

  
  static void hollowRectangle(){
      /* 
      1.
      *****
      *   *
      *   *
      *   *
      *****
      */
      // to print this patter(1) the pattern below use this code:

    int rows, columns;
    rows = 10;
    columns = 20;
      
      for(int I=0;I<rows;I++){
        for(int j=0;j<columns;j++){
          if(I==0||I==rows-1||j==columns-1||j==0){
            System.out.print("#");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }


  

  static void solidRectangle(){

    /*
    output of solid rectangle:

    **********
    **********
    **********
    **********
    **********
    */
    
    for(int I = 0; I < 10; I++){
      for(int j=0; j<20; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }



  static void hollowRhombus(){
    /*
    below is the output of the code:

            
    
    */
  }



  

  static void piramid(){

    /*
    Target to print is:

    *
    **
    ***
    ****
    
    */

    int rows;
    rows = 4;

    for(int I=1;I<=rows;I++){
      for(int j=1; j<=I; j++){
        System.out.print("Shadab ");
      }
      System.out.println();
    }
  }





  static void reversePiramid(){

    /*
    Output Expected:

       *
      **
     ***
    ****
    
    */
    int rows, columns;
    rows = 5;
    columns = 5;
    for(int I=1;I<=rows;I++){
      for(int j=1;j<=rows-I;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=I;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void numberPiramid(){

    /*
    Output Expected:

    1
    2 3
    4 5 6
    7 8 9 10
    
    */
    int rows = 4;
    int number = 1;
    for(int i=1; i<=rows; i++){
      for(int j=1; j<=i; j++){
        System.out.print(number+" ");
        number++;
      }
      System.out.println();
    }
  }



  
  
    public static void main(String[] args){
      
      // hollowRectangle();
      // System.out.println();   
      // solidRectangle();
      // System.out.println();   
      // piramid();
      // System.out.println();
      reversePiramid();
      // System.out.println();
      numberPiramid();
      
      
  }
}







// code to print today's date.
// before using the code below comment all the above code.
/*
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){




  LocalDate today = LocalDate.now();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  String formattedDate = today.format(formatter);
  System.out.println("Today's date is: " + formattedDate);
  }
}

*/