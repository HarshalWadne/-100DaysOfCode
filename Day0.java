//Question:-program to check whether given character is vowel or consonant

import java.util.*;
public class name {

    public static void  main(String args[]) {
        
        Scanner inp=new Scanner(System.in);
        System.out.print("\n Enter Character: ");
        char c=((inp.nextLine()).charAt(0));
        char z=Character.toUpperCase(c); //Changing Value to Upper Case for uniformity.
        if(z=='A' || z=='E' || z=='I' || z=='O' || z=='U'){
            System.out.println(c+" is a vowel");
        }else{
            System.out.println(c+" is a consonant");
        }
    }
}

//input=l
//output=l is a consonant
