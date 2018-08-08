PROBLEMA:
int[] a = {1,2,3,4};
int[] b = {2,3,4};
int sumOfA = 0;
for(int i = 0; i < 4; i++){
    sumOfA += a[i];
}
double avgA = sumOfA/4;

int sumOfB = 0;
for(int i = 0; i < 4; i++){
    sumOfB += b[i];
}
double avgB = sumOfB/4;


SOLUCIÓN:
int[] a = {1,2,3,4};
int[] b = {2,3,4};
double calculateAverage(int[] array){
    int sum;
    for(int i = 0; i < array.length; i++){
        sum += array[i];
    }
    return sum/array.length;
}

double avgA = calculateAverage(a);
double avgB = calculateAverage(b);