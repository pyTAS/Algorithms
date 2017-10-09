#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool isAnagram (string a, string b)
{
    bool isAn = true;
    int aLen = a.length();
    int bLen = b.length();
    std::vector<char> aVect;
    std::vector<char> bVect;
    int i = 0;

    for (int i=0; i<aLen; i++)
    {
        aVect.push_back(a[i]);

    }
    std::sort(aVect.begin(), aVect.end());

    for (int i=0; i<bLen; i++)
    {
        bVect.push_back(b[i]);

    }
    std::sort(bVect.begin(), bVect.end());


    while (i<aVect.size() && isAn)
    {
        if (aVect[i] == bVect[i])
            i = i + 1;
        else
            return isAn = false;
    }

    return isAn;

}

int main ()
{

//    string a = "listen";
//    string b = "silent";
    string a = "acccbc";
    string b = "aabbcc";
//    string a = "abcs";
//    string b = "bca";

    if (isAnagram(a,b))
    {
        cout<<"strings are anagrams"<<endl;
    } else
    {
        cout<<"strings are not anagrams"<<endl;
    }

}
