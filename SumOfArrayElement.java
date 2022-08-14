public class SumOfArrayElement{

    public static void main(String[] args) {

        int [] array={10,20,30,40,50};
        int sum =0;
        for (int i : array) {
            sum=sum+i;            
        }
        System.out.println("Display Sum of all element in array"+" :  " +sum);

    }
}