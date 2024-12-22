public class task2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int max = 0;
        for (int numb : array){
            if (numb > max){
                max = numb;
            }
        }
        System.out.println(max);
    }
    
}
