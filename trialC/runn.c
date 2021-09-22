#include<stdio.h>
int main(){
    int n, s[1001],i,t,j;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&s[i]);

}
for(int i=0;i<n;i++)
    for(int j=1;j<n;j++)
        if(s[j]<s[i]){
            t = s[j];
            s[j] = s[i];
            s[i] = t;
        }
        int c = n/2-1;
        int d =(n+1)/2-1;
if(n%2 !=0)
printf("%d",s[d]);
else
printf("%d",s[c]);
    
    }
