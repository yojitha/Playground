int main()
{
float rad,angle;
float len;
scanf("%f%f",&rad,&angle);
len=2*(3.14)*rad*(angle/360);
printf("%.2f",len);
return 0;
}