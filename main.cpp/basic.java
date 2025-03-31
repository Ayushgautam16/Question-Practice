import java.util.*;
public class basic {
public static void main(String[] args) {
    // System.out.println("*");
    // System.out.println("**");
    // System.out.println("***");
    // System.out.println("****");
    // System.out.println("*****");
    // System.out.println("******");

//  System.out.println("*****");
//     System.out.println("    *");
//     System.out.println("   * ");
//     System.out.println("  *  ");
//     System.out.println(" *   ");
//     System.out.println("*****");
   
// *****
//     *
//    *
//   *
//  *
// *****

// */% same priority 
// +- same priority 
// left me jo hoga vo pehle hoga 


// question 

// System.out.println("enter your marks ");
// Scanner sc = new Scanner(System.in);
// int marks = sc.nextInt();

// if(marks> 90){
//     System.out.println("excellent");
// }
// else if(marks> 80){
//     System.out.println("verry goog");
// }
// else if(marks> 70){
//     System.out.println("good");
// }
// else if(marks> 60){
//     System.out.println("Average");
// }
// else if(marks> 50){
//     System.out.println("needs improvement");
// }
// else if(marks> 30){
//     System.out.println("below average");
// }

// Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// String str = sc.nextLine();

// ************int n = Integer.parseInt(sc.nextLine()); ****************
// same line me input string or int bhi 



// // if i wantt both agt same time;
// for(int i = 0 ; i<=n ; i++){
//     System.out.println("dear "+ str +" here is the counting "+n );

// }

// i/p 

// ayush5
// 4

// o/p 

// dear ayush5 here is the counting 4
// dear ayush5 here is the counting 4
// dear ayush5 here is the counting 4
// dear ayush5 here is the counting 4
// dear ayush5 here is the counting 4





// prime or not prime 



// System.out.println("enter the value you wanted to check: ");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int count =0;
// for (int div =1;div<=n ;div++)
// {
//     if(n%div ==0){
//         count++;
//     }
// }
// if(count==2 ){
//     System.out.println("prime ");
// }
// else{
//     System.out.println("not prime ");
// }

// time limit exceeded

// 10to the power 9  operation = 1sec to complete operation 



// optimised way
// System.out.println("enter the value you wanted to check: ");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int count =0;
// for (int div =2 ;div * div<=n ;div++)
// {
//     if(n%div ==0){
//         count++;
// break;                   break add kiya to aagey checkk hi ni karega to time complexity kam lagegi 
//     }
// }
// if(count==0 ){
//     System.out.println("prime ");
// }
// else{
//     System.out.println("not prime ");
// }






// low and high ke beech me jo prime of non prime hai vo print karo 


// mera logic 

// Scanner sc = new Scanner(System.in);
// System.out.println("enter the lower num: ");
// int low  = sc.nextInt();
// System.out.println("enter the higher num : ");
// int high = sc.nextInt();
// int count =0;
// for(int i= low ; i<=high;i++){
//     for(int div = low; div*div<=high; div++){
//         if(low%div==0){
//            count++;
//            break;
// System.out.println(div);
//         }
//     }
//     if(count==0){
//         System.out.println("prime ");
//     }
// else{
//     System.out.println("not prime ");
// }}




// Scanner sc = new Scanner(System.in);
// System.out.println("enter the lower num: ");
// int low  = sc.nextInt();
// System.out.println("enter the higher num : ");
// int high = sc.nextInt();
// for(int n =low ; n<=high;n++){
//     int count =0;

//     for(int div = 2; div*div<=n ; div++){
//         if(n%div==0)
//         count++;
//         break;

//     }

//     if(count ==0){
//         System.out.println("prime number are :"+n);
//     }
    
// }



// fibbonacci number 
// 0,1,1,2,3,5,8

// pehle 2 numko add krke saarey num banted hai 

// Scanner sc = new Scanner(System.in);
// System.out.println("enter the num");
// int n = sc.nextInt();
// int a =0;
// int b=1;

// for(int i = 0 ; i<=n ; i++){
//     System.out.println(a);
//    int c = a+b;
//    a=b;
//    b=c;


// }
// 15
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34
// 55
// 89
// 144
// 233
// 377
// 610


// to count the num of digits

// Scanner sc  =new Scanner(System.in);
// System.out.println("enter the value you wanted to enter: ");
// long n = sc.nextLong();
// int count =0;

// while(n!=0){
//     n=n/10;
//     count++;

    
// }
// System.out.println(count);

// 21245425235241
// 14

// question

// 2424523523 we have to print the num in diffrent line 




        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value you want to enter: ");
        // int n = sc.nextInt();
        // sc.close();  // Closing the scanner to avoid resource leaks

        // int nod = 0;
        // int temp = n;  // Fix: temp should be initialized to n

        // while (temp != 0) {
        //     temp = temp / 10;
        //     nod++;
        // }

        // int div = (int) Math.pow(10, nod - 1);

        // while (div != 0) {
        //     int q = n / div;  // Extract the leftmost digit
        //     System.out.println(q);
        //     n = n % div;  // Remove the leftmost digit
        //     div = div / 10;  // Reduce divisor
        // }
        // 21421412
        // 2
        // 1
        // 4
        // 2
        // 1
        // 4
        // 1
        // 2




// public class Main {
    // public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Printing the number on different lines
        while (number > 0) {
            System.out.println(number % 10);
            number /= 10;
        }

        scanner.close();
    }
}



