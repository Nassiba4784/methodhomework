package nassiba_array;

public class SpecificValue {
    // test if an int array contains a specific value:
    public static void main(String[]args){
        int[] number = {3, 9, 40, 24};
        int valuetoget = 12;
        boolean existed = false;
        for (int num : number){
            if (num == valuetoget){
                existed = true;
                break;
            }
        }
        if (existed){
            System.out.println(valuetoget + "is existed in the array");
        } else {
            System.out.println(valuetoget + "is not existed in the array");
        }
    }
}

