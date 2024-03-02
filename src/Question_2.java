public class Question_2 {
//    given n array elements, array contain all elements from [1,n+2] except 2 elements, find 2 missing elements.
    public static void main(String[] args) {
        int[] array = {1,6,4,7,5};
        missingElement(array);
    }
    static void missingElement(int[] array){
        int xorOfAll = 0;
        for(int i=1;i<=array.length+2;i++){
            xorOfAll = xorOfAll ^ i;
        }
        for(int i=0;i<array.length;i++){
            xorOfAll = xorOfAll ^ array[i];
        }
        int reference = 0;
        for(int i=0;i<32;i++){
            if(Question_1.isCheckBit(xorOfAll,i)){
                reference = i;
                break;
            }
        }
        int set=0,unset=0;
        for(int i=1;i<=array.length+2;i++){
            if(Question_1.isCheckBit(i,reference)){
                set = set ^ i;
            }else{
                unset = unset ^ i;
            }
        }
        for(int i=0;i<array.length;i++){
            if(Question_1.isCheckBit(array[i],reference)){
                set = set ^ array[i];
            }else{
                unset = unset ^ array[i];
            }
        }
        System.out.println("set : "+set);
        System.out.println("unset : "+unset);
    }
}
