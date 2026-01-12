public class palindrome {
    public static void main(String[] args) {
        String input = "madam";
        StringBuilder output = new StringBuilder();
        for (int i = input.length()-1; i >=0; i--) {
            output.append(input.charAt(i));
        }
        if(input.equals(output.toString())){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
