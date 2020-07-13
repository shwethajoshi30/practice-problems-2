package Additional_assignments;
import java.util.*; 
public class random_pwd_generator_6 
{ 
    public static void main(String[] args) 
    { 
        int length = 10; 
        System.out.println(gen_Password(length)); 
    }
    static char[] gen_Password(int len) 
    { 
    	Scanner sc=new Scanner(System.in);  
        String name;int age,id; 
        System.out.println("enter your name");
        name=sc.next();
        System.out.println("enter your age");
        age=sc.nextInt();
        System.out.println("enter your id");
        id=sc.nextInt();
        System.out.println("Generating password......."); 
        //converting id and age to string type (they are int)
        String age_s = Integer.toString(age); 
        String id_s = Integer.toString(id); 
        //concatinating...
        String values = name + age_s +id_s; 
        // Using random method 
        Random rndm_method = new Random(); 
        char[] password = new char[len];
        for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            password[i] = values.charAt(rndm_method.nextInt(values.length())); 
  
        } 
        return password; 
    } 
  
} 