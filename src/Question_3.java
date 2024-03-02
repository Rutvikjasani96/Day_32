public class Question_3 {
//    given n elements, calculate sum of xor of all pairs?
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 8};
        System.out.println("sum of xor of all pairs : "+sumOfXorOfAllPairs(array));
    }
    static int sumOfXorOfAllPairs(int[] array){
        int sum = 0,ans=0;
        for(int i=0;i<31;i++) {
            int setbits = 0;
            for (int j = 0; j < array.length; j++) {
                if(Question_1.isCheckBit(array[j],i)){
                    setbits++;
                }
            }
            ans = ans + (setbits * (array.length-setbits) * (1<<i));
        }
        return 2 * ans;
    }
}
