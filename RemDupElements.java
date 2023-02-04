public class RemDupElements{
  public static void main(String[] args){
    int[] a1= {5,4,3,5,3,1,2};
    int[] a2= new int[a1.length];
    int z=0;

    for(int i=0; i<a1.length; i++){
      for(int j=i+1; j<a1.length; j++){
        if(a1[i]==a1[j]){
          a2[z]=a1[i];
          z++;
        }
        else
          a2[z]=a1[j];
      }
    }
    for(int i=0; i<=a2.length-1; i++)
      {
        System.out.println(a2[i]);
      }
  }
}