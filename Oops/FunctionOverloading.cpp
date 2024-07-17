#include <iostream>

class Calculator {
public:
    // Function to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Function to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Function to add two double numbers
    double add(double a, double b) {
        return a + b;
    }
};

int main() {
    Calculator calc;

  
    int sum1 = calc.add(2, 3);
    int sum2 = calc.add(2, 3, 4);
    double sum3 = calc.add(2.5, 3.7);

    std::cout << "Sum 1: " << sum1 << std::endl;
    std::cout << "Sum 2: " << sum2 << std::endl;
    std::cout << "Sum 3: " << sum3 << std::endl;

    return 0;
}
