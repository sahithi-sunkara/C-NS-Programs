#include<stdio.h>
#include<conio.h>
#include<string.h> 
int main()
{
char *str="Hello world"; int length,i;
char result; clrscr();
length = strlen(str);
for(i=0;i<length;i++)
{
result = str[i]^127; printf("%c",result);
}
for(i=0;i<length;i++)
{
result = str[i]&127; printf("%c",result);
}
getch(); return 0;
}
