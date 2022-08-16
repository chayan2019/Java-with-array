public class AverrageOfElementInArray{

    public static void main(String[] args) {

        int [] array={10,20,30,40,50};
        int avergae =0;
        int sum =0;
        for (int i : array) {
            sum=sum+i;            
        }
        avergae=sum/array.length;
        System.out.println("Display Average of all element in array"+" :  " +avergae);

    }
}