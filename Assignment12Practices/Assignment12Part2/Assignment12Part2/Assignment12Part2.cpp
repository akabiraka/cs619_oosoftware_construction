
#include <iostream>
#include <stdexcept>
#include <exception>
using namespace std;

class NegativeArraySizeException : public exception
{
	virtual const char* what() const throw()
	{
		return "NegativeArraySizeException";
	}
} negException;

int* copyOf(int* original, int oldLength, int newLength)
{
	if (newLength < 0 || oldLength < 0)
	{
		//throw std::invalid_argument("NegativeArraySizeException");
		throw negException;
	}
	int* newArray;
	newArray = new int[newLength];

	for (int i = 0; i < newLength; i++)
	{
		if (i < oldLength)
		{
			newArray[i] = original[i];
		}
		else
			newArray[i] = 0;
	}
	return newArray;
}

void printArray(int* arr, int length) 
{
	for (int i = 0; i < length; i++) {
		cout << arr[i] << endl;
	}
}
int main()
{
	try {
		int original[5] = { 100, 2, 3, 4, 5 };
		int* newArray = copyOf(original, 5, 10);
		printArray(newArray, 10);
		newArray = copyOf(original, 5, 0);
		printArray(newArray, 0);
		newArray = copyOf(original, 5, -1);
		printArray(newArray, -1);

	}
	//catch (const std::invalid_argument & e) {
	catch (exception & e) {
		cout << "Standard exception: " << e.what() << endl;
	}
	return 0;
}
