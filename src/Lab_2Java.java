public class Lab_2Java {
    public static int x = 7;
    public static int z = 3;

    public static void main(String[] args) {
        int result1 = sum(11,22);
        int result2 = subs(x,z);
        long result3 = mul(x,z);
        float result4 = div(26,8);
        float result5 = mod(x,z);

        System.out.println(result1+3);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4+1);
        System.out.println(result5);

        System.out.println(sum(5,8));
        System.out.println(subs(5,8));
        System.out.println(mul(5,8));
        System.out.println(div(5,8));
        System.out.println(mod(10,3));
    }
    public static int sum(int first, int second){
        int result = first + second;
        return result;
    }
    public static int subs(int first, int second){
        int result = first - second;
        return result;
    }
    public static long mul(long first, long second){
        long result = first * second;
        return result;
    }
    public static float div(float first, float second) {
        float result = (first / second);
        return  result;
    }
    public static float mod(float first, float second) {
        float result = (first % second);
        return result;
    }
}




