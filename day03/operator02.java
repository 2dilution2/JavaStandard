package day03;

public class operator02 {
    public static void main(String[] args) {
        int i = 5 , j = 0;

        j = i++;
        System.out.println("J=i++; 실행 후 i = " + i + "J= " + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("J=++i; 실행 후 i = " + i + "J= " + j);
        

    // -----------------------------------------------------------------

        i = 5;
        j = 5;

        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i = "  + i + ", j = " + j);
    
    }
}
