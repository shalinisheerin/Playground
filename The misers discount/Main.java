#include<iostream>
using namespace std;
int main()
{
    float item1;
  float item2;
  int discount;
  cin>>item1;
  cin>>item2;
  cin>>discount;
  float totalamount=item1+item2;
  float discountedprice=totalamount-(totalamount*discount/100);
  float amountsaved=totalamount-discountedprice;
  cout<<totalamount<<"\n"<<discountedprice<<"\n"<<amountsaved;

}