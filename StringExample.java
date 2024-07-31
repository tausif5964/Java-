/*
 String-It is collection of characters which is enclosed in double quotes.
 */
public class StringExample {
    public static void main(String[] args) {
        String str1="Hello",str2="World";

        //concatenate(combining two strings.)
        System.out.println(str1+" "+str2);
        System.out.println(str1.concat(" "+str2));

        //length
        System.out.println("The length of string 1 is "+str1.length());

        //Indexof
        System.out.println("The index : "+str1.indexOf("l"));
        System.out.println("Last index of letter:"+str1.lastIndexOf("l"));

        //replace -It replace old data with new data

        String data="C programming";
        System.out.println("Change data:"+data.replace("C", "Java"));

        //comparision-In string if comparision is true it give 0 and if compairision is false it give 1.

          String sign1="Rushik",sign2="Rushik";

          if(sign1.compareTo(sign2)==0)
          {
            System.out.println("Compare");
          }
          else{
            System.out.println("not compare");
          }
        
          //trim()-It remove space from start and end
          String whitespace=" Class Started  ";
          System.out.println(whitespace.trim());
        
    }
}
