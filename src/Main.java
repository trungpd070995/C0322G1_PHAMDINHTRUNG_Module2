public class Main {
    public static void main(String[] args) {
        String arg1 = "CodegymDaNang";
        String arg2 = arg1.toLowerCase();
        String result = "";
        int num;
        for (int i = 0; i < arg1.length(); i++) {
            num = (int) arg1.charAt(i);
            if (num < 91){
                result += " " + arg2.charAt(i);
            } else {
                result += arg2.charAt(i);
            }
        }
        System.out.println(result.trim());

    }


}
