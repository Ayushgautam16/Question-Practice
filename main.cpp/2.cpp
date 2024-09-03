// #include<iostream>
// using namespace std;
// int main(){
// int i, n, sum=0;

// cout << "Enter a positive integer: ";
// cin >> n;
// for (int i = 0; i < n; i++)
// {
//     sum = sum +i;
// }

// cout << "Sum of natural numbers from 1 to " << n << " is: " << sum << endl;
// cin >> n; // To take input from user

// return 0;
// }

// prog for finding the factorial of the number

// #include<iostream>
// using namespace std;
// int main(){
// int i, n, fact=1;

// cout << "Enter a positive integer: ";
// cin >> n;

// for (int i = 1; i <= n; i++)

// {
// fact = fact * i;
// }

// cout << "Factorial of " << n << " is: " << fact << endl;
// cin >> n; // To take input from user

// return 0;

// }


// prog for finding the factor of the number

// #include<iostream>
// using namespace std;
// int main(){
// int i,n;

// cout << "Enter a positive integer: ";
// cin >> n;
// for (int i = 1; i < n; i++)
// {
//     if (n % i == 0)
//     {
//         cout << i << " ";
//     }
// }
    

// return 0;
// }

// sum of the factor of the number

// #include<iostream>
// using namespace std;
// int main(){
// int i,n, sum =0;

// cout << "Enter a positive integer: ";
// cin >> n;

// for (int i = 1; i <= n; i++)
// {
//     if (n%i ==0)
//     {
//         sum = sum + i;
//     }
       
// }
// cout<<"sum of the factor are "<<sum;

// return 0;
// }




// prg to find the factor of the num

// #include<iostream>
// using namespace std;
// int main(){
// int i,n, sum =0;

// cout << "Enter a positive integer: ";
// cin >> n;

// for (int i = 1; i <= n; i++)
// {
//     if (n%i ==0)
//     {
//         sum = sum + i;
//     }
       
// }
// cout<<"sum of the factor are "<<sum;

// return 0;
// }

// prg for checking the number is prime of not?

#include<iostream>
using namespace std;
int main(){
int i,n,sum=0;
int count=0;

cout << "Enter a positive integer: ";
cin >> n;
for (int i = 1; i < n; i++)
{
    if (n % i == 0)
    {
        count++;
    }
}

if (count == 2){
    cout << n << " is a prime number." << endl;
}


}