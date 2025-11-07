#include "driverheader.h"
#include <iostream>

extern "C" {
void helloWorld() {
    std::cout << "Hello World!\n";
}
}
