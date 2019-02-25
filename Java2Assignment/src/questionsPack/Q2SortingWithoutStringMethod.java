package questionsPack;

// 2. WAP to sorting string without using string Methods?.

public class Q2SortingWithoutStringMethod {

    public static void main(String[] args) {

        String string = "zsadbjc";
        int i=0;
        
//      approach1 - by converting string to char array and apply Arrays.sort(char[])
        String string1 = "";

/*
        Arrays.sort(str);

        while(i!=string.length())
        {
            string1+=str[i];
            i++;
        }
        System.out.println(string1);
*/

//      Approach 2 apply sorting on char array

        char[] str = string.toCharArray();
        char temp;
        for (i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i] < str[j]) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }

        }

        int index = 0;
        do {
            string1 += str[index];
            index++;
        } while (index != str.length);
        System.out.println(string1);

    }
}
