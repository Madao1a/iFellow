// Задача 2 средняя:
// Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»



public class task2 {
    public static void main(String[] args) {
        String str = new String("Hello");
        char[] myArray = str.toCharArray();
        
        for (int i = 0; i < myArray.length-1; i++) {
            int count = 0;
            for (int j = i+1; j < myArray.length; j++) {
                
                if (myArray[i] == myArray[j]) {
                    count= count + 1;
                }
            }
            if (count != 0) {
                System.out.println("повторяющися символ " + myArray[i]);
            }
        }

    }


    
}
    
