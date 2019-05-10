#include <iostream>
#include <cmath>
using namespace std;
class MyUtil
{
public:
    long factorial(int num)
        {
            long result=1;
            for(int i=2;i<=num;i++)
            {
                result*=i;
            }
            return result;
        }
    bool isPrime(long number)
        {
            long numberSqrt = sqrt(number);
            bool result = true;
            for(int i=2; i<numberSqrt && result; i++)
            {
                if(number%i==0)
                {
                    result = false;
                }
            }

            return result;
        }
    bool isTriangle(double num1, double num2, double num3)
        {
            return (num1>(num2+num3) && num2>(num1+num3) && num3>(num2+num1));
        }
};

int main()
{
    MyUtil util1;
    cout << boolalpha;
    cout <<"12, 2 and 8 create a triangle is : " << util1.isTriangle(12,2,8)<<endl;
    cout<<"The factorial of 6 is : " << util1.factorial(6)<<endl;
    cout<<"Saying that 17 is a prime number is : "  << util1.isPrime(17);
    return 0;
}
