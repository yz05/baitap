#include <stdio.h>
#include <stdlib.h>



/* nhap vao n, kiem tra de n>0
	tinh n!
 */

int main(int argc, char *argv[]) {
	printf(" CHUONG TRINH TINH N! MOI \n\n");
	// nhap du lieu
	int n;
	do
	{
		printf(" nhap vao n = "); scanf("%d",&n); fflush(stdin);
	}while (n<0);
	// tinh n!
	unsigned int giaithua=1;
	if(n>0)
		{
			int i;
			for(i=i; i<=n; i++) giaithua*= i;
		}
	// hien thi ket qua
	printf(" \n n! = %u", giaithua);
	return 0;
}

	
