import java.util.*;
public class ArrayListDemo {
  
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        int op;
        String element;
        int index;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("1.INSERT\n2.DELETE\n3.SIZE\n4.SEARCH BY INDEX\n5.SEARCH BY VALUE\n6.EXIT");
            System.out.println("Enter your option");
            op=scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the element");
                    element=scanner.next();
                    list.add(element);
                    break;
                case 2:
                    System.out.println("Enter the element");
                    element=scanner.next();
                    list.remove(element);
                    System.out.println("Object removed");
                    break;
                case 3:    
                    System.out.println("The size is :"+ list.size());
                    break;
                case 4:
                    System.out.println("Enter the index");
                    index=scanner.nextInt();
                    System.out.println("The element at "+index+" is "+list.get(index));   
                    break;
                case 5:
                    System.out.print("Enter the element to be searched : ");
                    element=scanner.next();
                    if(list.contains(element)){
                        System.out.println(element+" found at index "+list.indexOf(element));
                    }else{
                        System.out.println(element+" not found in list");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;    
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }while(op!=6);
    }
}
