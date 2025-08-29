public class DeclareVar{
    static public void main(String[] args){

        String name;

        name = "Mike";

        String name2 = "Mike";

        // prints third letter of string 'name'
        System.out.println(name.charAt(2));
        System.out.println("Hello\nWorld\tHi,\tPeace");

                
        System.out.println("Line 1" + name); //.println() = after this line is executed start the next line of code on a new line
        System.out.print("Line 2" + name); //.print() = after this line of code is executed dont start a new line. 
        System.out.println("Line 3" + name);


        // System.out.println(name.charAt(2) + name.charAt(4));




    }
}

