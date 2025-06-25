import java.util.ArrayList;
public class ArrayListCreaion {
    static ArrayList<Integer> myMethod(ArrayList<Integer>vals){
        return vals;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList();
        // ArrayList<Double>list1 =new ArrayList();

        // ArrayList<Boolean>list2 =new ArrayList();

        // ArrayList<String>list3 =new ArrayList();
        // int [] arrayNum= {1,2,4,5};
        // ArrayList<Integer>arrayListFromArray= new ArrayList(Arrays.asList(arrayNum));

        list.add(1); //first empty index ma value basxa

        list.set(0,5); //(index,value)

        int val = list.get(0); //0 index ma vako return

        list.remove(0); //removes element from index 0

        System.out.println(list.size()); //to get size of ArrayList

        System.out.println(list.contains(1)); //checks if list contains that specific element

        System.out.println(list.indexOf(5)); //gives index of the given element

        list.clear(); //clears the the list

        for (int element:list){
            
        }
        for (int i=0;i<list.size();i++){

        }

    }
    
}
