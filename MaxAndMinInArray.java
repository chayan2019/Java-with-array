public class MaxAndMinInArray{

    public static void main(String[] args) {

        int [] array1={10,20,30,40,50};
        
        int max = array1[0];
        int min=array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i]>max) {
                max=array1[i];
            }
            if (array1[i]<min) {
                min =array1[i];
            }     
        }
        
        System.out.println("Max Element in an Array "+" :  " +max);
        System.out.println("Min Element in an Array "+" :  " +min);

    }
}