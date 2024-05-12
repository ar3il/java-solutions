//////////////////////////////////////////////////////////כדי לקחת למבחן פונקציות מוכנות////////////////////////////////
//public static int [] numberToArray(int number){
//    int counter=0;
//     int copy=number;
//     while(number>0){
//         counter++;
//         number/=10;
//        }
//     int [] digits = new int[counter];
//     while(copy >0){
//         digits[counter-1]=copy%10;
//         counter--;
//         copy/=10;
//        }
//           return digits;
//        }
/////////////////////////////////////הוספת דברים למערך//////////////////////////////////////////////////////////////////
//public void updateRating(int rate){
//    int [] largerArray = new int [this.ratings.length+1];
//     for(int i=0;i<this.ratings.length;i++){
//         largerArray[i] = this.ratings[i];
//        }
//     largerArray[this.ratings.length] = rate;
//         this.ratings = largerArray;
//        }
///////////////////////////////////////////////בודק שהמערך מתחלק ללא שארית פעמים k /////////////////////////////////////
//public static boolean isDivisible(String s, int k) {
//        boolean divisible = false;
//        if (s.length() % k == 0) {
//        int count = s.length() / k;
//        String[] strings = new String[k];
//        for (int i = 0; i < k; i++) {
//        strings[i] = s.substring(i * count, i * count + count);
//        }
//        divisible = true;
//        for (int i = 0; i < strings.length - 1;  i++) {
//        if (!strings[i].equals(strings[i + 1])) {
//        divisible = false;
//        }
//        }
//        }
//        return divisible;
//        }
////////////////////////////////מחזיר מערך ללא כפילויות//////////////////////////////////////////////////////////////////
//public static int[] distinctArray (int[] array1, int[] array2) {
//        int[] result = new int[array1.length + array2.length];
//        int x = 0;
//        for (int i = 0; i < array1.length; i++) {
//        int current = array1[i];
//        boolean exists = false;
//        for (int j = 0; j < result.length; j++) {
//        if (current == result[j]) {
//        exists = true;
//        break;
//        }
//        }
//        if (!exists) {
//        result[x] = current;
//        x++;
//        }
//        }
//        for (int i = 0; i < array2.length; i++) {
//        int current = array2[i];
//        boolean exists = false;
//        for (int j = 0; j < result.length; j++) {
//        if (current == result[j]) {
//        exists = true;
//        break;
//        }
//        }
//        if (!exists) {
//        result[x] = current;
//        x++;
//        }
//        }
//        int[] finalResult = new int[x];
//        for (int i = 0; i < x; i++) {
//        finalResult[i] = result[i];
//        }
//        return finalResult;
//        }
///////////////////////////////////////////////////////מחזיר את הערך שחוזר על עצמו הכי הרבה פעמים///////////////////////
//public static int mostCommon(int[] arr1, int[] arr2){
//        int[] counts = new int[arr2.length];
//        for (int i = 0; i < arr1.length; i++) {
//        for (int j = 0; j < arr2.length; j++) {
//        if (arr1[i] == arr2[j]) {
//        counts[j]++;
//        break;
//        }
//        }
//        }
//        int mostRepeatedIndex = 0;
//        for (int i = 0; i < counts.length; i++) {
//        int maxCount = counts[i];
//        if (counts[i] > maxCount) {
//        mostRepeatedIndex = i;
//        }
//        }
//        return arr2[mostRepeatedIndex];
//        }
//        }
////////////////////////////////////////////////////////רקורסיה////////////////////////////////////////////////////////
//import java.util.Date;
//public class Main {
//    public static void main(String[] args) {
//        helloRecursion(5);
//        System.out.println(calculate(4));
//        Thread timeThread = new Thread(() ->{
//            while (true){
//                System.out.println(new Date());
//                try{
//                    Thread.sleep(1000);
//                }catch (InterruptedException e){
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        timeThread.start();
//    }
//    public static void helloRecursion(int timeLeft){
//        System.out.println("Hello");
//       if (timeLeft != 0) {
//           helloRecursion(timeLeft -1);
//       }
//        System.out.println("Done!!");
//    }
//    public static int calculate(int numbers){
//       if(numbers == 1){
//           return 1;
//       }else{
//           return numbers+ calculate(numbers -1);
//       }
//    }
//}
//}
/////////////////////////////////////////////////הרכבת מערך ללא כפילויות///////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        int []array1 = {2,3,4,5,6,7};
//        int []array2 = {3,48,3,8,8,3};
//          int [] array3 = binaryProduct(array1,array2);
//          for (int i=0;i< array3.length;i++){
//              System.out.println(array3[i]);
//          }
//    }
//    public static int [] binaryProduct (int []array1,int []array2){
//           int [] result = null;
//           if (array1.length == array2.length){
//               result = new int[array1.length];
//               for (int i=0;i< array1.length;i++){
//                   int number=0;
//                   if (array1[i] > array2[i]){
//                       number = 1;
//                   }else if (array2[i] > array1[i]){
//                       number = -1;
//                   }
//                       result[i] = number;
//                   }
//               }
//                return result;
//           }
//        }
//    }
//}
//////////////////////////////////////////////////שאלות חזרה למבחן1//////////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        Patient patient1 = new Patient("K12");
//        Patient patient2 = new Patient("K72");
//        Patient patient3 = new Patient("K54");
//        Patient patient4 = new Patient("K14");
//        Patient[] patients = {};
//        Patient next = getPatient(1, patients);
//        System.out.println(next);
//    }
//
//    public static Patient getPatient(int type, Patient[] patients) {
//        Patient patient = null;
//        for (int i = 0; i < patients.length; i++) {
//            Patient current = patients[i];
//            if (type == 1) {
//                if (current.isGeneralQueue()) {
//                    if (patient == null || current.getNumber() < patient.getNumber()) {
//                        patient = current;
//                    }
//                }
//            }
//        }
//        if (patient == null) {
//            for (int i = 0; i < patients.length; i++) {
//                Patient current = patients[i];
//                if (current.isUrguentQueue()) {
//                    if (patient == null || current.getNumber() < patient.getNumber()) {
//                        patient = current;
//                    }
//                }
//            }
//            if (patient == null) {
//                for (int i = 0; i < patients.length; i++) {
//                    Patient current = patients[i];
//                    if (current.isKidsQueue()) {
//                        if (patient == null || current.getNumber() < patient.getNumber()) {
//                            patient = current;
//                        }
//                    }
//                }
//            }
//        }
//        return patient;
//    }
//}
//////////////////////////////////////////////שאלה מספר 2 מהשאלות של שי/////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        int[] arr1 = {1, 5, 8, 3, 7, 1, 3, 6, 2, 7, 1, 6, 7, 1, 7, 8, 1, 2, 1, 5, 7, 7, 1, 1, 3};
//        int[] arr2 = {1, 6, 2};
//        System.out.println(mostCommon(arr1,arr2));
//    }
//    public static int mostCommon(int[] arr1, int[] arr2) {
//        int [] number = new int[arr1.length];
//             int max =0;
//        for (int i=0;i< arr1.length;i++){
//            for (int j=0;j< arr2.length;j++){
//                if (arr1[i] != arr2[j]){
//                    number[i] = arr1[i];
//                    i++;
//                }
//            }
//        }
//        for (int i=1;i< number.length;i++){
//            if (number[i] > number[i-1]){
//                max = number[i];
//            }
//        }
//        return max;
//    }
//}
///////////////////////////////////////////////שאלה מסםר 3 מהשאלות של שי////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        int [] array1 = {5,6,2,7,9,3,6,1,3};
//        int [] array2 = {1,3,7,9,5,9,5,8,4};
//         int [] newArr = binaryProduct(array1,array2);
//    }
//        public static int[] binaryProduct (int[] array1, int[] array2) {
//            int[] result = null;
//            if (array1.length == array2.length) {
//                result = new int[array1.length];
//                for (int i = 0; i < array1.length; i++) {
//                    int number = 0;
//                    if (array1[i] > array2[i]) {
//                        number = 1;
//                    } else if (array2[i] > array1[i]) {
//                        number = -1;
//                    }
//                    result[i] = number;
//                }
//            }
//            return result;
//        }
//}
//////////////////////////////////////////////////////שאלה מספר 4 מהשאלות של שי/////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        String [] words = {"door","flood","cad","table","dar","mothed","peopld","duck"};
//       char letter = letter(words);
//        System.out.println(letter);
//    }
//    public static char letter(String []words){
//        char letter1 = 'a';
//        int counter=0;
//        int mostRepeated=0;
//        char [] letters = new char[words.length];
//        for (int i=1;i< words.length;i++){
//            letters[i] = words[i].charAt(words[i].length()-1);
//             if (letters[i] == letters[i-1]){
//                 counter++;
//             }
//             if (counter > mostRepeated){
//                 mostRepeated = counter;
//                 letter1 = letters[i];
//             }
//             counter =0;
//        }
//        return letter1;
//    }
//}
//////////////////////////////////////////////////////שאלה מספר 5 מהשאלות של שי////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//         int num=5;
//         int [] numbers = new int[num];
//         for (int i=0;i<numbers.length;i++){
//             numbers[i] = random.nextInt(101,200);
//         }
//        System.out.println(secondHighestNum(numbers,num));
//    }
//    public static int secondHighestNum(int [] numbers,int num){
//        int secondNum =0;
//        int highestNum =0;
//        for (int i=0;i<numbers.length;i++){
//            if (numbers[i] > highestNum){
//                highestNum = numbers[i];
//            }
//        }
//        for (int i=0;i<numbers.length;i++){
//            if (numbers[i] > secondNum && numbers[i] < highestNum){
//                secondNum = numbers[i];
//            }
//        }
//        return secondNum;
//    }
//}
////////////////////////////////////////////////////////////שאלה מספר 6 מהשאלות של שי//////////////////////////////////
//public  class Main {
//    public static void main(String[] args) {
//        ToDo toDo1 = new ToDo("house clening","Ariel",false);
//        ToDo toDo2 = new ToDo("car wash","Dani",false);
//        ToDo toDo3 = new ToDo("rebuild the bench",null,true);
//        ToDo toDo4 = new ToDo("wash dishes","Dani",true);
//        ToDo toDo5 = new ToDo("collect cloths","Adam",false);
//        ToDo [] toDos = {toDo1,toDo2,toDo3,toDo4,toDo5};
   //     System.out.println(notDone(toDos));
   //     printNameMostRepeated(toDos);
//        printNameWhoDidMost(toDos);
//    }
//    public static int notDone(ToDo [] toDos){
//        int count =0;
//        for (int i=0;i< toDos.length;i++){
//            if (!toDos[i].isCompleted()){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void printNameMostRepeated(ToDo[] toDos) {
//        int highest = 0;
//        int value = 0;
//        String[] arr = new String[toDos.length];
//        String name = null;
//        for (int j = 0; j < toDos.length; j++) {
//            for (int i = j + 1; i < toDos.length; i++) {
//                if (toDos[j].getName() != null && toDos[i].getName() != null && toDos[j].getName().equals(toDos[i].getName())) {
//                    arr[i] = toDos[i].getName();
//                    value = arr.length;
//                }
//                if (value > highest) {
//                    highest = arr.length;
//                    if (arr[i] != null) {
//                        name = arr[i];
//                    }
//                }
//            }
//        }
//        System.out.println(name);
//    }
//
//    public static void printNameWhoDidMost(ToDo[]toDos){
//        int highestCount =0;
//        String name = null;
//        for (int i = 0; i < toDos.length; i++) {
//            if (toDos[i].isCompleted()) {
//                int count = 1;
//                String personName = toDos[i].getName();
//                for (int j = i + 1; j < toDos.length; j++) {
//                    if (toDos[j].isCompleted() && toDos[j].getName().equals(personName)) {
//                        count++;
//                    }
//                }
//                if (count > highestCount) {
//                    highestCount = count;
//                    name = personName;
//                }
//            }
//        }
//        System.out.println(name);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Thread myThread = new Thread(()->{
//            System.out.println("Hello from a thread");
//        });
//
//            myThread.start();
//    }
//}
//////////////////////////////////////////////////////סבוכיות///////////////////////////////////////////////////////////
//        O(1) = only if or no conditions           -  או תנאי או ללא תנאים
//        O(n) = one or more loops, each by itself  -  לולאה אחת לפחות
//        O(n^2) = nested for                       - מקוננת ללולאה (הלולאות תלויי במספר)
//        log(n) = binary search                    - פעולה הפוכה אומרת בחזקת איזה מספר צריך להיות כדי להגיע לתוצאה הסופית

//import java.util.Random;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

///////////////////////////////////////////////פיתרון למגן ראשון שאלות 1 - 7 //////////////////////////////////////////
/////////1///////////
//public class Main{
//    public static void main(String[] args) {
//        int n =7;
//        PrintOverAverage(n);
//    }
//    public static void PrintOverAverage(int n){
//        Scanner scanner = new Scanner(System.in);
//        int sum =0;
//        int []numbers= new int[n];
//        for (int i=0;i<n;i++){
//            System.out.println("Enter n time numbers: ");
//               numbers [i] = scanner.nextInt();
//               sum += numbers[i];
//        }
//        double average = sum/n;
//        System.out.println("numbers under the average: ");
//        for (int i=0;i< numbers.length;i++){
//            if (numbers[i] < average){
//                System.out.println(numbers[i]);
//            }
//        }
//    }
//}
////////2///////////
//public class Main {
//    public static void main(String[] args) {
//         int number = 12600;
//    }
//    public static boolean isPrimary(int number){
//        boolean primary = true;
//       for (int i=2;i<number;i++){
//           if (number%i == 0){
//               primary = false;
//               break;
//           }
//       }
//        return primary;
//    }
//    public static void printTheParts(int number){
//        int []primaries = new int[number];
//        int loction =0;
//        for (int i=2;i<number;i++){
//            if (isPrimary(i)){
//                primaries[loction++] = i;
//            }
//        }
//        String text = number + "=";
//         for (int i=0;i<loction;i++){
//             while (number != 1 && number % primaries[i] ==0){
//                 number = number / primaries[i];
//                 text = text + primaries[i] + "*";
//             }
//         }
//        System.out.println(text);
//    }
//}
/////////3///////
//public class Main {
//    public static void main(String[] args) {
//        String word = "ABCCBA";
//        System.out.println(palindrome(word));
//    }
//    public static boolean palindrome(String word){
//        boolean pali =true;
//        for (int i=0,j=word.length();i<word.length();i++,j--){
//            if(word.charAt(i) != word.charAt(word.length()-1-i)){
//                pali = false;
//                break;
//            }
//        }
//        return pali;
//    }
//}
///////4//////
//public class Main {
//    public static void main(String[] args) {
//        ToDo toDo1 = new ToDo("house clean","Ariel",true);
//        ToDo toDo2 = new ToDo("wash dishes","Adam",false);
//        ToDo toDo3 = new ToDo("pick up all the toys","Ariel",true);
//        ToDo toDo4 = new ToDo("pay the ticket","Adam",true);
//        ToDo toDo5 = new ToDo("take the dog to walk","Ariel",false);
//         ToDo [] toDos = {toDo1,toDo2,toDo3,toDo4,toDo5};
//        System.out.println(unfinished(toDos));
//        printNameGotMostMission(toDos);
//
//    }
//    public static int unfinished(ToDo [] toDos){
//        int count=0;
//        for (int i=0;i< toDos.length;i++){
//            if (!toDos[i].isCompleted()){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void printNameGotMostMission(ToDo [] toDos) {
//        int highest=0;
//        int value=0;
//         String []arr = new String[toDos.length];
//         String name =null;
//        for (int i=0;i<toDos.length;i++){
//            for (int j=1;j<toDos.length;j++){
//                if (toDos[j].getName().equals(toDos[i].getName())){
//                    arr[i] = toDos[i].getName();
//                     value = arr.length;
//                }
//                 if (value > highest){
//                     highest = arr.length;
//                     name = arr[i];
//                 }
//            }
//        }
//        System.out.println(name);
//    }
//}
/////////5////////
//public class Main {
//    public static void main(String[] args) {
//         Clockv3 plane1 = new Clockv3(22,45);
//        Clockv3 plane2 = new Clockv3(20,45);
//        Clockv3 [] clockv3s = {plane2,plane1};
//         plane1 = plane1.addMinutes(25);
//         int toMid = plane1.timeToMidnight();
//        int toMid2 = plane2.timeToMidnight();
//        if (toMid > toMid2){
//            System.out.println("plane1 land sooner " + plane1);
//        }
//        else {
//            System.out.println("plane2 land sooner " + plane2);
//        }
//         plane1.print(true);
//        System.out.println(toMid);
//    }
//}
//////////7////////
//public class Main {
//    public static void main(String[] args) {
//        Client client = new Client("adma","margolin",2015);
//        Client client1 = new Client("Ariel","margolin",2019);
//        Client client2 = new Client("omer","margolin",2018);
//        Client client3 = new Client("dan","margolin",2019);
//        client.setMember(true);
//        client2.setMember(true);
//        Client [] clients = {client,client1,client2,client3};
//
//         int dis = client.discount(2019);
//        System.out.println(dis);
//        client.printNames(clients);
//
//        client.printMostDiscount(clients);
//    }
//}
//
////////////////////////////////////////////////פתרון למבחן מגן שני 26.6///////////////////////////////////////////////
//////1//////
//public class Main {
//    public static void main(String[] args) {
//        Voter voter1 = new Voter("Ariel","margolin",1992,2005,true);
//        Voter voter2 = new Voter("dani","margolin",2000,2000,false);
//        Voter voter3 = new Voter("ron","margolin",1992,2003,true);
//        Voter voter4 = new Voter("adam","margolin",1995,2022,false);
//        Voter voter5 = new Voter("amit","margolin",1997,2017,false);
//        Voter []voters = {voter1,voter2,voter3,voter4,voter5};
//
//        System.out.println(voter1.citizenShipLength(2023));
//        System.out.println(voter1.eligibleToVote(2023));
//        String [] names2 = voterssNames(voters);
//        for (int i=0;i< names2.length;i++){
//            if (names2[i] != null)
//            System.out.println(names2[i]);
//        }
//    }
//    public static String []voterssNames(Voter [] voters){
//        int loction=0;
//        String [] names = new String[voters.length];
//        for (int i=0;i< voters.length;i++){
//            if (voters[i].eligibleToVote(2023)){
//                names[loction++] = voters[i].getName();
//            }
//        }
//        return names;
//    }
//}
/////////2//////////
//public class Main {
//    public static void main(String[] args) {
//        int []array = {5,8,1,9};
//        int shift =4;
//        System.out.println(array[number(array,shift)]);
//
//    }
//    public static int number(int []array,int shift) {
//        int num = shift % array.length;
//        return num;
//    }
//}
////////3///////
//public class Main {
//    public static void main(String[] args) {
//        int num=8;
//        System.out.println(secondHighest(num));
//    }
//    public static int secondHighest(int num){
//        int [] array = new int[num];
//        int highestNum=0;
//        int secondHighest=0;
//        Random random = new Random();
//       for (int i=0;i< array.length;i++){
//           array[i] = random.nextInt(100,200);
//           System.out.println(array[i]);
//          if (array[i] > highestNum){
//              secondHighest = highestNum;
//              highestNum = array[i];
//          }
//       }
//        return secondHighest;
//    }
//}
///////////4//////////
//public class Main{
//    public static void main(String[] args) {
//        int []numbers = {3,4,7,4,7,3,12,8,6,7,8};
//        int max =7;
//
//    }
//    public static boolean isProxomity(int [] number,int max){
//        for (int i=0;i< number.length;i++){
//            for (int j=1;j<=3;j++){
//                if (i-j >= 0){
//                    if (number[i] - number[i-j] > max){
//                         return false;
//                    }
//                }
//                if (i+j < number.length){
//                    if (number[i] - number[i+j] > max){
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }
//}
///////5/////////
//public class Main {
//    public static void main(String[] args) {
//        int[] arr1 = {1, 5, 8, 3, 7, 1, 3, 6, 2, 7, 1, 6, 7, 1, 7, 8, 1, 2, 1, 5, 7, 7, 1, 1, 3};
//        int[] arr2 = {1, 6, 2};
//        System.out.println(mostCommon(arr1,arr2));
//    }
//    public static int mostCommon(int[] arr1, int[] arr2) {
//        int [] number = new int[arr1.length];
//             int max =0;
//        for (int i=0;i< arr1.length;i++){
//            for (int j=0;j< arr2.length;j++){
//                if (arr1[i] != arr2[j]){
//                    number[i] = arr1[i];
//                    i++;
//                }
//            }
//        }
//        for (int i=1;i< number.length;i++){
//            if (number[i] > number[i-1]){
//                max = number[i];
//            }
//        }
//        return max;
//    }
//}
/////////6///////
//public class Main {
//    public static void main(String[] args) {
//        int []arr1 = {3,5,6,4,3,2,6};
//        int [] arr2 = {5,3,6,8,3,4};
//        int [] result = result(arr1,arr2);
//         if (result != null) {
//             for (int i = 0; i < result.length; i++) {
//                 System.out.print(result[i] + " ");
//             }
//         }else{
//             System.out.println("null");
//         }
//    }
//    public static int []result(int []arr1,int []arr2){
//        int [] score = new int[arr1.length];
//        if (arr1.length != arr2.length){
//              return null;
//        }
//        for (int i=0,j=0;i<arr1.length;i++,j++){
//            if (arr1[i] > arr2[j]){
//                score[i] = 1;
//            }
//            if (arr2[j] > arr1[i]){
//                score[i] = -1;
//            }
//            else if (arr1[i] == arr2[j]){
//                score[i] =0;
//            }
//        }
//        return score;
//    }
//}
////////7///////
//public class Main {
//    public static void main(String[] args) {
//        String[] words = {"apple", "door", "age", "dog", "color", "table"};
//        System.out.println(getMostFrequentEndChar(words));
//    }
//
//    public static char getMostFrequentEndChar(String[] arr) {
//        int[] charCount = new int[256];
//        char mostFrequentChar = ' ';
//        for (int i = 0; i < arr.length; i++) {
//            if (!arr[i].isEmpty()) {
//                char lastChar = arr[i].charAt(arr[i].length() - 1);
//                charCount[lastChar]++;
//                if (charCount[lastChar] > charCount[mostFrequentChar]) {
//                    mostFrequentChar = lastChar;
//                }
//            }
//        }
//
//        return mostFrequentChar;
//    }
//}
/////////////////////////////////////////////שאלה כיתתית של שי תרגול למבחן////////////////////////////////////////////////
//public clas s Main {
//    public static void main(String[] args) {
//        int number = 12345;
//
//    }
//
//    public static boolean isLeveledNumber(int number) {
//        boolean leveled = true;
//        int[] digits = numberToArray(number);
//        if (digits.length % 2 != 0) {
//            for (int i = 1; i < digits.length - 1; i++) {
//                int currentDigit = digits[i];
//                int previousDigit = digits[i - 1];
//                int nextDigit = digits[i + 1];
//                if (!isCloseDigits(currentDigit, previousDigit)) {
//                    leveled = false;
//                    break;
//
//                } else {
//                    if (!isCloseDigits(currentDigit, nextDigit)) {
//                        leveled = false;
//                        break;
//                    }
//                }
//            }
//        } else {
//            leveled = false;
//        }
//        return leveled;
//    }
//
//    public static boolean isCloseDigits(int digit1, int digit2) {
//        boolean close = false;
//        if (digit1 == digit2 + 1 || digit1 == digit2 - 1) {
//            close = true;
//        } else {
//            if (digit1 == 9 && digit2 == 0) {
//                close = true;
//            } else {
//                if (digit2 == 9 && digit1 == 0) {
//                    close = true;
//                }
//            }
//        }
//        return close;
//    }
//
//    public static int getHighestLeveledNumber(int[] numbers) {
//        int max = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        return max;
//    }
//
//    public static int[] numberToArray(int number) {
//        int size = String.valueOf(number).length();
//        int[] array = new int[size];
//        for (int i = size - 1; i >= 0; i--) {
//            array[i] = number % 10;
//            number /= 10;
//        }
//        return array;
//    }
//
//    public static int sumDigits(int number) {
//             int [] digits = numberToArray(number);
//             int sum=0;
//             for (int j=0;j<digits.length;j++){
//                 sum += digits[j];
//             }
//        return sum;
//    }
//}
///////////////////////////////////////////שאלה מספר 2 שאלות כיתה של שי///////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        int firstElement = 6;
//        int difference =4;
//        int size = 5;
//    }
//    public static int [] createArithmeticRegression(int firstElement,int difference,int size){
//         int [] array = new int[size];
//         array[0] = firstElement;
//         for (int i=1;i< size;i++){
//             array[i] = array[i-1] + difference;
//         }
//        return array;
//    }
//    public static boolean hasArithmeticRegression(int [] numbers,int extra){
//        int minDiff = 100;
//        int maxDiff = -100;
//        for (int i=0;i< numbers.length;i++){
//            int currentDiff = numbers[i] - numbers[i-1];
//            if (currentDiff > maxDiff){
//                maxDiff = currentDiff;
//            }
//            if (currentDiff < minDiff){
//                minDiff = currentDiff;
//            }
//        }
//        for (int i=minDiff;i<=maxDiff;i++){
//            int matches =1;
//            for (int j=0;j< numbers.length;j++){
//                int currentDiff = numbers[j] - numbers[j-1];
//                if (currentDiff == i){
//                    matches++;
//                  if (matches == extra){
//                      return true;
//                    }
//                }else{
//                    matches =0;
//                }
//            }
//        }
//        return false;
//    }
//}
////////////////////////////////////////////////שאלות כיתה של נתי 13.6//////////////////////////////////////
///////////////////////////////////////////////////////1////////////////////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        int []numbers = {1,3,2,5,3};
//        System.out.println(isPretty(numbers));
//        System.out.println(isHandSome(274));
//    }
//    public static boolean isPrimary(int number){
//        boolean prim = true;
//        for (int i=2;i<number;i++){
//            if (number%i ==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isPretty(int []numbers){
//        boolean pretty = false;
//        for (int i=1;i< numbers.length-1;i++){
//            if (i%2 != 0){
//                if (isPrimary(numbers[i]) && numbers[i] == numbers[i-1] + numbers[i+1]){
//                    pretty = true;
//                }else{
//                    return false;
//                }
//            }
//        }
//        return pretty;
//    }
/////////////////////////////////////////////////////////////////2//////////////////////////////////////////////////////
//    public static boolean isHandSome(int number){
//        boolean handSome = false;
//        int sum=0;
//        int num=number;
//        while (num > 0){
//              sum += num%10;
//                   num = num/10;
//        }
//        if (number%sum == 0){
//            handSome = true;
//        }
//        return handSome;
//    }
//}
///////////////////////////////////////////////////////////////3////////////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        String text1 = "Ariel";
//        String text2 = "Margolin";
//        System.out.println(higherAscii(text1,text2));
//    }
//    public static String higherAscii(String text1,String text2){
//        int sum=0;
//        int sum2=0;
//        for (int i=0;i<text1.length();i++){
//            sum += text1.charAt(i);
//        }
//        for (int i=0;i<text2.length();i++){
//            sum2 += text2.charAt(i);
//        }
//        if (sum > sum2){
//            return text1;
//        }
//        else {
//            return text2;
//        }
//    }
//}
/////////////////////////////////////////////////////////4//////////////////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        Bottle bottle = new Bottle("Water",0.5,2);
//        System.out.println(bottle.CurrentLiquid());
//    }
//}
////////////////////////////////////////////////////////5///////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////TwoDarray/////////////////////////////////////////////////////////
//public class Main {
//    public static void main(String[] args) {
//         int col = 2;
//         int row =1;
//         int mat [][] = {{1,9,5,4},
//                        {1,5,3,3},
//                        {0,0,0,0},
//                        {2,7,7,2}};
//        System.out.println(CheckNumber(mat,row,col));
//
//    }
//    public static boolean CheckNumber(int mat [][],int row,int col){
//        for (int i=0;i< mat.length;i++)
//            if (mat[i][col] == mat[row][col] && i != row)
//                return false;
//
//            for (int j=0;j<mat[0].length;j++)
//                if (mat[row][j] == mat[row][col] && j !=col)
//                    return false;
//            return true;
//    }
//}
////////////////////////////////////////////////שאלות כיתה של שי 22.6////////////////////////////////////////////////////
///////////1////////////
//public class Main {
//    public static void main(String[] args) {
//        int[] array = {10, 5, 8, 7, 3, 12,3,6,3,12};
//        System.out.println(partialCouplesArray(array));
//    }
//    //////a////////
//    public static boolean isCouplesArray (int[] array) {
//        boolean result = false;
//          if (array.length > 0){
//              if (array.length % 2 == 0){
//                  int sum = array[0] + array[1];
//                    result = true;
//                 for (int i=2;i < array.length;i+=2){
//                     int currentSum = array[i] + array[i+1];
//                    if (sum != currentSum){
//                        result = false;
//                        break;
//                    }
//                 }
//              }
//          }
//        return result;
//    }
//    ////////b//////////
//    public static boolean partialCouplesArray (int[] array) {
//        boolean result = false;
//        if (array.length > 0) {
//            if (array.length % 2 == 0) {
//                int sum = array[0] + array[1];
//                int couples = 0;
//                int nonCouples = 0;
//                for (int i = 2; i < array.length; i+=2) {
//                    int currentSum = array[i] + array[i + 1];
//                    if (sum == currentSum) {
//                        couples++;
//                    } else {
//                        nonCouples++;
//                    }
//                }
//                if (couples > nonCouples) {
//                    result = true;
//                }
//            }
//        }
//        return  result;
//    }
//    ////////c/////////
//    public static int[] mostCouples (int[] array1, int[] array2) {
//        if (countPartialCouplesArray(array1) > countPartialCouplesArray(array2)) {
//            return array1;
//        } else {
//            return array2;
//        }
//    }
//
//    public static int countPartialCouplesArray (int[] array) {
//        int couples = 0;
//        boolean result = false;
//        if (array.length > 0) {
//            if (array.length % 2 == 0) {
//                int sum = array[0] + array[1];
//                int nonCouples = 0;
//                for (int i = 2; i < array.length; i+=2) {
//                    int currentSum = array[i] + array[i + 1];
//                    if (sum == currentSum) {
//                        couples++;
//                    } else {
//                        nonCouples++;
//                    }
//                }
//                if (couples > nonCouples) {
//                    result = true;
//                }
//            }
//        }
//        return couples;
//    }
//    //////////////2/////////////
//    public static boolean isZigzagArray (int[] array) {
//        boolean result = true;
//        for (int i = 0; i < array.length - 1; i++) {
//            int current = array[i];
//            int next = array[i + 1];
//            if (current * next > 0) {
//                result = false;
//                break;
//            }
//        }
//        return result;
//    }
//}

/////////4///////////
//public class Main{
//    public static void main(String[] args) {
//        Book book1 = new Book("aaa", "bbb", 6);
//        Book book2 = new Book("abc", "bbb", 6);
//        Book book3 = new Book("bcd", "bbb", 6);
//        Library library = new Library(new Book[]{book1, book2, book3});
//        Book[] books = library.getBooks("bc");
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i]);
//        }
//    }
//}

///////////////////////////////////////////////test 07.07 //////////////////////////////////////////////////////////////
////////1////////
//public class Main {
//    public static void main(String[] args) {
//        int max = 9;
//        int mini =4;
//       int []number = numbers(max,mini);
//        if (number != null) {
//            for (int i = 0; i < number.length; i++) {
//               if (number[i] != 0) {
//                   System.out.println(number[i]);
//               }
//            }
//  }
//          else{
//              System.out.println("null");
//          }
//       }
//    public static int []numbers (int max , int mini){
//        int []num = new int[20];
//       if (max == mini || mini > max) {
//           return null;
//       }
//           for (int i = mini; i <= max; i++) {
//               num[i] = i;
//           }
//        return num;
//    }
//}
///////3///////
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(mostPopularLength());
//    }
//    public static int mostPopularLength() {
//        Scanner scanner = new Scanner(System.in);
//        String[] words = new String[50];
//        String word = "";
//        int count = 0;
//        int mostCount = 0;
//        int[] counter = new int[words.length];
//        int[] popularLengths = new int[words.length];
//        for (int i = 0; i < words.length; i++) {
//            System.out.println("Enter a word: ");
//            word = scanner.nextLine();
//            words[i] = word;
//            if (word.isEmpty()) {
//                break;
//            }
//            if (words[i].charAt(0) == words[i].charAt(words[i].length() - 1)) {
//                break;
//            }
//            int length = word.length();
//            counter[length]++;
//            if (counter[length] > mostCount) {
//                mostCount = counter[length];
//            }
//            popularLengths[counter[length]] = length;
//        }
//        return popularLengths[mostCount];
//    }
//}
//////4////
//public class Main {
//    public static void main(String[] args) {
//        String []words = {"Car21","Door","Tab3l","dish","f16h"};
//        System.out.println(howMuchDigits(words));
//    }
//    public static int howMuchDigits(String[] words) {
//        int count = 0;
//        for (int i = 0; i < words.length; i++) {
//            int digitCount = 0;
//            for (int j = 0; j < words[i].length(); j++) {
//                if (Character.isDigit(words[i].charAt(j))) {
//                    digitCount++;
//                }
//            }
//            if (digitCount >= 2) {
//                count++;
//            }
//        }
//        return count;
//    }
//}

