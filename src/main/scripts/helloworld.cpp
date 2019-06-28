#include "log.h"

using namespace std;

int main() 
{
    MOSAIC::TSCES::Log::init();
    LOG_INFO("Hello World!");
  
    return 0;
}