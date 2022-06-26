#include <stdio.h>
 
int main() {
    double r = 0;
    double PI = 3.14159;
    scanf("%lf",&r);
    double area = r * r * PI;
    printf("A = %.4f\n", area);
    return 0;
}