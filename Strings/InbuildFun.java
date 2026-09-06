class InbuildFun{
    public static void main(String[] args) {
        //Dclare and Intilization
        String str="Hemansu Das";
        String str1="Sane Das";
        System.out.println(str);

        System.out.println();

        //See character in particular index
        System.out.println(str.charAt(3));

        System.out.println();

        //Find length of string
        System.out.println(str.length());

        System.out.println();

        //Check character lie in particular index
        System.out.println(str.indexOf('u'));

        System.out.println();

        //Use of compareTo():
        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(str));
        System.out.println(str.compareTo(str));

        System.out.println();

        //Check or find particular character or string present or not
        System.out.println(str1.contains("an"));
        System.out.println(str1.contains("s"));
        System.out.println(str1.contains("h"));

        System.out.println();

        //Check StartsWith and EndsWith function
        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("jk"));
        System.out.println(str.startsWith("Da"));

        System.out.println();

        System.out.println(str1.endsWith("as"));

        System.out.println();

        //convert lowercase and upper case
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        System.out.println();

        //Concatenation of two string
        String str2;
        str2=str.concat(str1);
        System.out.println(str2);

}
}