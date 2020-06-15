package practice;
import java.util.Arrays;


class anagramIs {
    static boolean isAnagram(char[] s, char[] t) 
    {
      int n1=s.length;
      int n2=t.length;
        if(n1!=n2)
            return false;
        Arrays.sort(s);
        Arrays.sort(t);
        
        for(int i=0;i<n1;i++)
            if(s[i]!=t[i])
                return false;
        
        return true;
    }
    public static void main(String args[]) 
    { 
        char s[] = { 'a', 'n', 'a', 'g' , 'r', 'a', 'm'}; 
        char t[] = { 'n', 'a', 'g', 'a','r','a','m' }; 
        if (isAnagram(s, t)) 
            System.out.println("The two strings are" + " anagram of each other"); 
        else
            System.out.println("The two strings are not" + " anagram of each other"); 
                               
    } 
}
