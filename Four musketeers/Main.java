#include<iostream>
using namespace std;
int main()
{
 float x1,y1,x2,y2,x3,y3;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  float x=(x1+x2+x3)/3;
  float y=(y1+y2+y3)/3;
  cout<<x<<"\n"<<y;
}