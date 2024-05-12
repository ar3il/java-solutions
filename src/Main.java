import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tablet tablet = new Tablet("Ace","Asus",'A',15.6,3000);
        Tablet tablet1 = new Tablet("Acet","Asus",'W',15.6,3000);
        Tablet tablet2 = new Tablet("AceA","Asus",'A',15.6,3000);
        Tablet []tablets = {tablet,tablet1,tablet2};

        Store store = new Store();
           store.addTablet( tablet = new Tablet("Ace","Asus",'A',15.6,3000));
           store.addTablet( tablet1 = new Tablet("Acet","Asus",'W',15.6,3000));
           store.addTablet(tablet2 = new Tablet("AceA","Asus",'A',15.6,3000));
        System.out.println(store.sortStore());

        Nurse nurse = new Nurse(1,"karin","ort","Sorting");
        Nurse nurse1 = new Nurse(2,"eden","ashdod","Sorting");
        Nurse nurse2 = new Nurse(3,"ron","shila","Sorting");
        Nurse nurse3 = new Nurse(4,"tom","tel aviv","First Aid");


        Employee employee = new Nurse(1, "karin", "ort", "Sorting");
        Employee employee1 = new Nurse(2, "eden", "ashdod", "Sorting");
        Employee employee2 = new Nurse(3,"ron","shila","Sorting");
        Employee employee3 = new Nurse(4,"tom","tel aviv","First Aid");


       AllEmployees allEmployees = new AllEmployees(4);
       allEmployees.addEmployee(employee);
        allEmployees.addEmployee(employee1);
        allEmployees.addEmployee(employee2);
        allEmployees.addEmployee(employee3);

        System.out.println(allEmployees.getNewNurse("Sorting").getName());
       int []numbers = {2,2,3,4,5,3,4,2,3,4,5};
        System.out.println(numberCount(numbers));
        System.out.println();
        int [] arrNew = noDuplicate(numbers);
        for (int i=0;i<arrNew.length;i++){
            if (arrNew[i] != 0) {
                System.out.println(arrNew[i]);
            }
        }
        System.out.println();
        int [] arrCounts = numberCounter(numbers,arrNew);
        for (int i=0;i< arrCounts.length;i++){
            if (arrCounts[i] != 0) {
                System.out.println(arrCounts[i]);
            }
        }
    }
public static void print(int []number){
        for (int i=0;i<number.length;i++){
            System.out.println(number[i] + " ,");
        }
}


    public static int numberCount(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int count=0;
        int num = scanner.nextInt();

            for (int i=0;i<numbers.length;i++){
                if (num == numbers[i]){
                    count++;
                }
            }
                 if (count == 0){
                    System.out.println("don't contain this digit: "+num);
                }
        return count;
      }


      public static int [] noDuplicate(int []numbers){
          int[] uniqueNumbersArray = new int[numbers.length];
          int uniqueCount = 0;
          for (int i = 0; i < numbers.length; i++) {
              boolean isDuplicate = false;
              for (int j = 0; j < uniqueCount; j++) {
                  if (numbers[i] == uniqueNumbersArray[j]) {
                      isDuplicate = true;
                      break;
                  }
              }
              if (!isDuplicate) {
                  uniqueNumbersArray[uniqueCount++] = numbers[i];
              }
          }
          return uniqueNumbersArray;
      }
      public static int []numberCounter(int []number,int []arrNew){
        int []numberCount = new int[arrNew.length];
        for (int i=0;i< arrNew.length;i++){
        int count =0;
            for (int j=0;j<number.length;j++){
                if (arrNew[i] == number[j]){
                    count++;
                }
            numberCount[i] = count;
            }
        }
          return numberCount;
      }
    }
