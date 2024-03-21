package practiceb4midterm;
public class Arrays {
               public static void main(String[] args) {
    int arr[][]={{1,2,3},
        {3,4,5},
        {6,7,8}};   
           for(int i=0;i<arr.length;i++){
               int sum=0;
               for(int j=0;j<arr.length-1;j++){
                   sum+=arr[i][j];
                   
               }
                          System.out.println("row "+(i+1)+": "+sum);

           }
           for(int m=0;m<arr.length;m++){
               int sum=0;
               for(int n=0;n<arr.length;n++){
                   sum+=arr[n][m];
               }
                          System.out.println("column "+(m+1)+": "+sum);
           }
           
                      for(int i=0;i<arr.length;i++){
               int max=arr[i][0];
               for(int j=1;j<arr[i].length;j++){
                   if(arr[i][j]>max){
                       max=arr[i][j];
                   }
               }
               System.out.println("row max"+(i+1)+": "+max);

           }
                      
                      for(int l=1;l<=5;l++){
           for(int k=l;k<=5;k++){
               System.out.print(k);
           }
for(int k=5;k>=l;k--){
   System.out.print(k); 
}
System.out.println();
    }
           
             for (int i = 0; i <arr.length; i++) {
          for (int j = i+1; j <arr.length; j++) {
              if(arr[i] > arr[j]) { //swap elements if not in order
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
               }
            }
        }

          
              
    }
}

