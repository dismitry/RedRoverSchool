package HW6;

public class third {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        for (int i = 0; i<=s.length()-3; i++){
            String subStr = s.substring(i,i+3);
            if (subStr.equals("рит")) {
                System.out.println(i);
            }
        }
    }
}
