int max(int* arr, int a, int b)
{
 
    for (int i = 0; i< n; i++)
        arr[arr[i]%k] += k;
 
 
    int max = arr[0], res = 0;
    for (int i = 1; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
            result = i;
        }
    }
 
 
    return res;
}
 
 
int main()
{
    int arr[] = {2, 3, 3, 5, 3, 4, 1, 7};
    int a = sizeof(arr)/sizeof(arr[0]);
    int b = 8;
 
    cout << "The maximum repeating number is " <<
         max(arr, a, b) << endl;
 
    return 0;
}