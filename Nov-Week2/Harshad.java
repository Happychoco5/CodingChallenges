public class Harshad {

    static int index = 0;
    static int sum = 0;

    public static void main(String[] args) {
            System.out.println(isHarshad(89));
    }

    public static boolean isHarshad(int num){

        //Base case: when we reach the end of the length of the number
        boolean result = false;
        String nums = String.valueOf(num);

        if(index == nums.length()){
            if(num % sum == 0){
                sum = 0;
                index = 0;
                return true;
            }
            else {
                sum = 0;
                index = 0;
                return false;
            }

        }
        else{
            int indexedNum = Character.getNumericValue(nums.charAt(index));
            sum += indexedNum;
            index++;
            return isHarshad(num);
        }

    }

}
