#include<iostream>
using namespace std;
void inc   (int *x,int &y) { *x++;y++; }

int main(){
    int a =5,b=5;
    inc(&a,b);
    cout<<a<<" "<<b<<endl;
}