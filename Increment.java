public class Increment {
    public static void main(String[] args){
        int i=5;
        int sum=6+ i++;
        System.out.println("SUM:"+sum);
        int k=5;
        int sum1=6+ ++k;
        System.out.println("SUM1:"+sum1);
        int sum2=6+i;
        System.out.println("SUM2:"+sum2);

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

    }
}
