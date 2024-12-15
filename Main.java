public class Main {
    public static void main(String[] args) {
        int[] array = {1,200,123512,77,343443,55,0,2};
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                int num1 = array[i];
                if(array[i]<array[j]){
                    array[i]=array[j];
                    array[j] = num1;

                }

            }
            
        }
        for (int number:array){
            System.out.println(number);
        }
    }
    

}
