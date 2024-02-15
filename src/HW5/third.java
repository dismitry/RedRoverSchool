package HW5;

public class third {
    public static void main(String[] args) {
        int [] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            } 
        } 
        System.out.println(min);
}
} 
