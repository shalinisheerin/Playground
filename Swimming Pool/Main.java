#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int l,l1,vol;
  cin>>l>>l1;
  vol=pow(l,3);
  vol=vol*1000;
  if(vol>l1)
    cout<<"Can store";
  else
    cout<<"Cannot store";
  return 0;
}