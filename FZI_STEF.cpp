#include <iostream>
using namespace std;

int main() {

long long numberOfCity;
long long sumCities = 0;
long long maxMoneyProfit = 0;	
cin >> numberOfCity;
long long eachCity[ numberOfCity ];

for(int i=0;i<numberOfCity;i++)
{
	cin >> eachCity[i];
}

for(int i=0;i<numberOfCity;i++)
{
	sumCities += eachCity[i];
	if (sumCities>maxMoneyProfit)
		maxMoneyProfit=sumCities;
	else if(sumCities<0)
		sumCities=0;
}

cout << maxMoneyProfit;
}