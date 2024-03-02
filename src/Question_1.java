public class Question_1 {
//    given n elements, every element repeats twice,except 2 unique elements, find 2 unique elements.
    public static void main(String[] args) {
        int[] array = {3,6,4,4,3,8};
        twoUniqueEle(array);
    }
    static void twoUniqueEle(int[] array){
        int xorOfArr = 0;
        for(int i=0;i<array.length;i++){
            xorOfArr = xorOfArr ^ array[i];
        }
        int reference = 0;
        for(int i=0;i<32;i++){
            if(isCheckBit(xorOfArr,i)){
                reference = i;
                break;
            }
        }
        int set=0,unset=0;
        for(int i=0;i<array.length;i++){
            if(isCheckBit(array[i],reference)){
                set = set ^ array[i];
            }else{
                unset = unset ^ array[i];
            }
        }
        System.out.println("set : "+set);
        System.out.println("unset : "+unset);
    }
    static boolean isCheckBit(int val,int pos){
        if(((val>>pos)&1)==1){
            return true;
        }
        return false;
    }
}
