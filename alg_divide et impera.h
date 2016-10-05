#divide et impera: maximul dintr-un vector
#include <iostream>
using namespace std;
int v[10], n;
int max(int i, int j)
{
	int a, b, m;
	if (i==j) return v[i];
	else
	{
		m=(i+j)/2;
		a=max(i,m);
		b=max(m+1,j);
		if (a>b) return a;
		else return b;
	}
}
int main()
{
	cout<<"n=";
	cin>>n;
	for (int i=1; i<=n; i++)
	{
		cout<<"v["<<i<<"]=";
		cin>>v[i];
	}
	cout<<"max="<<max(1,n);
	return 0;
}

#divide et impera: cautare binara
#include <iostream>
using namespace std;
int v[100], n, nr;
void caut(int i, int j)
{
	int m=(i+j)/2;
	if (nr==v[m])
		cout<<"gaist, indice= "<<m;
	else
		if (i<j)
			if (nr<v[m])
				caut(i, m-1);
			else
				caut(m+1,j);
		else
			cout<<"nu a fost gasit";
}
int main()
{
	cout<<"n=";
	cin>>n;
	for (int i=1; i<n; i++)
	{
		cout<<"v["<<i<<"]=";
		cin>>v[i];
	}
	cout<<"nr= ";
	cin>>nr;
	caut(0,n);
	return 0;
}



