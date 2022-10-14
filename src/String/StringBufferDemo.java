package String;


public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer(); // StringBuffer is mutable type(change value)
//        System.out.println(name);
//        name.append("Ankit");
//        name.append(" Kumar");
//        System.out.println(name);
//        char[] arr = new char[name.length()];
//        name.getChars(0, name.length(), arr, 0);
//        for(char c : arr){
//            System.out.print(c+ " ");
//        }
//        name.setCharAt(4, 'z');
//        System.out.println(name);
        name.append("Rahul").append(" Kumar");
        name.insert(9, " Singh ");
        System.out.println(name);
//        name.reverse();
//        System.out.println(name);
//        name.delete(9, 15); // exclusive means not delete
//        System.out.println(name);
//        name.deleteCharAt(4);
//        System.out.println(name);

    }

}
