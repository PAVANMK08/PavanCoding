import java.util.Scanner;
public class ReverseTheSentence{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the sentence");
    String s= sc.nextLine();
    String[] ar= s.split("");
    String temp= "";
    for(int i=ar.length-1; i>=0; i--)
     {
      temp= temp+ar[i];
     }
    System.out.println("Reverse the sentence is "+temp.trim());
 }
}
