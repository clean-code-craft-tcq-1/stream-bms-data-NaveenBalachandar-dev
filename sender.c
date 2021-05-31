/*****************************************************************************/
/***    \file        BMS_Sender.c
***     \author      Naveen Balachandar (RBEI/ECK3) 
***
***     \brief       File to monitor the battery condition based required properties
/*****************************************************************************/
/*------ standard includes -------*/

#include <stdio.h>

/*Function to send ouput to console*/
static void SendToConsloe(float temp ,float chargeset);


static void SendToConsloe(float temp ,float chargeset)
{
printf("Yet to be printed");
}

int  main()
{
  float temp = 11.5;
  float chargeset = 15.5;
  SendToConsloe(temp ,chargeset);
  return 0;
}


