public class FindMaximum {
    //UC1-Find Maximum Value of Three Integers
    public static Integer maxInteger(Integer a, Integer b, Integer c) {

        if (a.compareTo(b) > 0) {
            return a;
        } else if (c.compareTo(b) > 0) {
            return c;
        } else {
            return b;
        }

    }
    //UC2-Find Maximum Value of 3 Floats
    public static Float maxFloat(Float a, Float b, Float c) {

        if (a.compareTo(b) > 0) {
            return a;
        } else if (c.compareTo(b) > 0) {
            return c;
        } else {
            return b;
        }

    }

    // UC3- finding maximum value of 3 strings
    public static String maxString(String s1, String s2, String s3) {

        if (s1.compareTo(s2) > 0) {
            return s1;
        } else if (s3.compareTo(s2) > 0) {
            return s3;
        } else {
            return s2;
        }

    }
    public static void main(String[] args) {
        System.out.println("Maximum of 3 integers is : " + maxInteger(40, 60, 100));
        System.out.println("Maximum of 3 floats is : " + maxFloat(40.00f,60.00f,100.00f));
        System.out.println("Maximum of 3 Strings is : " + maxString("Apple","Peach","Banana" ));
    }
}
