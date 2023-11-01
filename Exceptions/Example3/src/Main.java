public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        try{
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }

    static int getArrayElementByIndex(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
        return arr[index];
    }
}