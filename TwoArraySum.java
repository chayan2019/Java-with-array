public class TwoArraySum{

    public static void main(String[] args) {

        int [] array1={10,20,30,40,50};
        int [] array2={10,20,30,40,50};
        
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            
            for (int j = 0; j < array2.length; j++) {
                
                sum=array1[i]+array2[j];
            }
        }
        System.out.println("Display Sum of all element in array"+" :  " +sum);

    }
}