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

#include<iostream>
using namespace std;
int main(){
int i,n;

cout << "Enter a positive integer: ";
cin >> n;
for (int i = 0; i < n; i++)
{
    if (n % i == 0)
    {
        cout << i << " ";
    }
}
    

return 0;
}