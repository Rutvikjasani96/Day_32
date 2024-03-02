import java.lang.reflect.Array;

public class Question_4 {
//    given n array elements, choose 2 indices i,j such that i!=j && {arr[i] & arr[j]} is max. (Bitwise &)
    public static void main(String[] args) {
        int[] array = {27,18,20};
        System.out.println("ans : "+maxAnd(array));
    }
    static int maxAnd(int[] array){
        int ans = 0;
        for(int i=31;i>=0;i--){
            int setBits = 0;
            for(int j=0;j<array.length;j++){
                if(Question_1.isCheckBit(array[j], i)){
                    setBits++;
                }else if(setBits>=2){
                    array[j] = 0;
                }
            }
            if(setBits>=2){
                ans = ans + (1<<i);
            }
        }
        return ans;
    }
}
