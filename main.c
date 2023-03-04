#include <stdio.h>

int main() {
    int days, months, remaining_days;
    
    printf("Enter the number of days: ");
    scanf("%d", &days);
    
    months = days / 30;
    remaining_days = days % 30;
    
    printf("Months: %d\n", months);
    printf("Days: %d\n", remaining_days);
    
    return 0;
}
