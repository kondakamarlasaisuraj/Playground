/*#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
}*/

# include <iostream>

using namespace std;

int main() {
	int r, c, a[10][10], b[10][10], i, j;
	cin >> r >> c;
	for(i = 0; i < r; i++)
		for(j = 0; j < c; j++)
			cin >> a[i][j];
	for(i = 0; i < r; i++)
		for(j = 0; j < c; j++){
			cin >> b[i][j];
			a[i][j] += b[i][j];	
		}
	for(i = 0; i < r; i++) {
		for(j = 0; j < c; j++)
			cout << a[i][j] << " ";
		cout <<endl;
	}
	return 0;
}