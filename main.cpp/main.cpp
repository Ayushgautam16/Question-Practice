// #include<iostream>
using namespace std;
int main(){
    int n, k, count = 0;
    cout << "Enter the number of integers: ";
    cin >> n;

    cout << "Enter the integers: ";
    for(int i = 0; i < n; i++){
        cin >> k;
        if(k % 3 == 0 && k % 5 == 0 && k % 7 == 0){
            count++;
        }
    }
return 0;
}   // end of