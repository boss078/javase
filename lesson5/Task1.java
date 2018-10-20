public class Task1 {

    public static boolean isInTop(int position, int top) {
        return position <= top? true : false;
    }

    public static void main(String[] args) {
        int pos = 2;
        int top = 3;
        System.out.println(isInTop(pos, top));
    }

}