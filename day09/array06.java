package day09;

public class array06 {
    // String배열 
    public static void main(String[] args) {
        String[] names = {"kim", "Park", "Yi",};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names["+i+"] : " + names[i]);
        }

        String tmp = names[1];
        System.out.println("tmp : " + tmp);

        names[0] = "Yu";

        for (int i = 0; i < names.length; i++)
        System.out.println(names[i]);
    }
}