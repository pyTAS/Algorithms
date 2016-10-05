#algoritm "Divide et impera"
int prezent (int x, int v[], int n)
{
	int mini, maxi, mijloc;
	mini=0;
	maxi=n-1;
	while (mini<=maxi)
	{
		mijloc=(mini+maxi)/2;
		if (x<v[mijloc])
			maxi=mijloc-1;
		else if (x> v[mijloc])
			mini=mijloc+1;
		else
			return mijloc;
	}
}