



public class Stringmethods {
    public static void main(String[] args) {
        String name="MyName";
        String name1= new String("MyName");
        String name2=name+name1;
        String name3=name.concat(name2);
        System.out.println(name3);
        char val=name.charAt(2);
        System.out.println(val);
        System.out.println(name.length());

        String value=name.substring(1,4);
        System.out.println("Substring:"+value);//M0 y1 n2 a3 m4 e5
        System.out.println(name.equals("myname"));
        System.out.println(name.equalsIgnoreCase("myname"));
        name.contains("Name");
        name.startsWith("My");
        name.endsWith("e");
        name.indexOf("m");
        name.lastIndexOf("n");
        name.toLowerCase();
        name.toUpperCase();
        String val1=" Hello ".trim();
        name.replace('a','b');
        String stringToSplit="abc.def.ghi";
        String[] seq=stringToSplit.split(".");


        int number=1;
        String numString=String.valueOf(number);
    }
    
}
