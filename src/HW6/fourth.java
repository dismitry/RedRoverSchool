package HW6;

public class fourth {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                if (!array[i][j].contains("е")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
