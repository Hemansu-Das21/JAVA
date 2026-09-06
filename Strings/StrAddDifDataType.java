class StrAddDifDataType{
    public static void main(String[] args) {
        String str="abc";
        str+='d';
        str+="efg";
        str+=10;
        System.out.println(str);
        System.out.println(str+20+30);//Work left to right presedence
        System.out.println(str+(20+30));
        System.out.println(20+30+"ij");
    }
}