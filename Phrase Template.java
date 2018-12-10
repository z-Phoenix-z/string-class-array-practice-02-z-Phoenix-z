public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public static int findNthOccurrence(String str, int n)
    {
         int index = 0;
        while(n != 0){
            int i = currentPhrase.subString(index).indexOf(str);
            if(i == -1)
                return -1;
            else if(n == 1)
                index += i;
            else
                index += i + 1;
            n--;
        }
        return index;
    }
        ------------------------------------------------------------------
        int loc = -1;
        int count = 0;
        int start = 0;
        int sub = -1;
        while (loc = currentPharse.substring(start).indexOf(str) != -1){
            loc += start;
            count ++;
            if(count == n){
                return loc -1;
            }
            start = loc + 1;
        }
        return -1;
    ------------------------------------------------------------------
    int count = 0;
    int start = 0;
    int sub = -1;
    while (count != n){
        sub = currentPharse.substring(start).indexOf(str);
        if (sub == -1){
            return -1;
        }
        else if (count == n-1){
            return start + sub;
        }
        start += sub+1;
        count ++;
    

    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        /* to be implemented in part(a) */
        int a = findNthOccurence(str,n);
        return currentPhrase.substring(0,a)+repl+currentPhrase.substring(a+a.length());
        
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        /* to be implemented in part(b) */
        int index = 1;
        while (findNthOccurrence(str, index) != -1) {
            index++;
        }
        return findNthOccurrence(str, index-1);
        
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {

    }
}
