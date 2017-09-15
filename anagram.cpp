#include <iostream>
#include <string>

using namespace std;

int main()
{
  string a;
  string b;
  bool isAnagram = false;
  a = "aabbcc";
  b = "abcabc";
  int aLen = a.length();
  int bLen = b.length();
  //cout<<a.length()<<endl;
  //cout<<b.length()<<endl;
  
  if (aLen==bLen)
  {
      for (int i=0; i<aLen; ++i)
      {
         for (int j=0; j<bLen; ++j)
         {
             if (a[i]==b[j])
                isAnagram=true;
         }
      }
  }
  
  if (isAnagram)
    {
        cout<<"strings are anagrams"<<endl;
    }
  else
  {
      cout<<"strings are not anagrams"<<endl;
      }   
  
}
