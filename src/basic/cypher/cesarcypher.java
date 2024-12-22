package basic.cypher;

public class cesarcypher {

    public static String cersar(String input, int shift){
        String result = "";
        StringBuilder builder = new StringBuilder();
        char[] tem = input.toCharArray();
        shift = shift % 26;

        for(int i = 0; i < input.length(); i++){
//                System.out.println(input.charAt(i));
            if (tem[i] == ' '){
                builder.append(" ");
            }

            if(tem[i] != ' '){
                char cha = (char) (input.charAt(i)+shift);
                builder.append(cha);
            }
        }
        result = builder.toString();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(cersar("ab c", 3));
        System.out.println(cersar("bcd" , 27));
    }
}
