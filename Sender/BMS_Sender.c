/*****************************************************************************/
/***    \file        BMS_Sender.c
***     \author      Naveen Balachandar (RBEI/ECK3) 
***
***     \brief       File to monitor the battery condition based required properties
/*****************************************************************************/
/*------ standard includes -------*/

#include <stdio.h>
#include "BMS_Sender.h"

void sendDataToConsole(float temp ,float chargeRate)
{
printf("Temperature:%5.2f;chargeRate:%5.2f",temp,chargeRate);
}

int  main()
{
  float temp = 11.5;
  float chargeRate = 15.5;
  sendDataToConsloe(temp ,chargeRate);
  return 0;
}
