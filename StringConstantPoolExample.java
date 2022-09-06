public class StringConstantPoolExample {
    public static void main(String args[]){
        String str1 = "harish";
        String str2 = "harish";
        System.out.println("Str1 hashcode "+str1.hashCode());
        System.out.println("Str2 hashcode "+str2.hashCode());

        String str3 = new String("harish1");
        System.out.println("Str3  hashcode "+str3.hashCode());

        String str4 = "harish";

        String str5 = str3.intern();

        String str6 = "harish1";

        System.out.println("Str1 and Str2 points to same location "+(str1 == str2));

        System.out.println("Str1 and Str3 points to same location "+(str1 == str3));

        System.out.println("Str2 and Str3 points to same location "+(str2 == str3));

        System.out.println("Str4 and Str3 points to same location "+(str4 == str3));

        System.out.println("Str2 and Str4 points to same location "+(str2 == str4));

        System.out.println("Str4 and Str5 points to same location "+(str4 == str5));

        System.out.println("Str3 and Str5 points to same location "+(str3== str5));

        System.out.println("Str5 and Str6 points to same location "+(str5== str6));
    }
}
