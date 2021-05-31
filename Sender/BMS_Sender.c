/*--------------------------------------------------------------------------------
---    \file       BMS_Sender.c
---   \author      Naveen Balachandar (RBEI/ECK3) 
---
---     \brief       File to monitor the battery condition based required properties
------------------------------------------------------------------------------------*/
/*------ standard includes -------*/
#include <stdio.h>
#include <stdlib.h>

/*------ Project includes -------*/
#include "BMS_Sender.h"

int readInpDataFile(void)
{
  
FILE *fptr;
char c;

fptr=fopen("Inputdata.txt","r");
if (fptr != NULL) 
{
 while ((c = getc(fptr)) != EOF)
 {
  printf("data read%c",c);
 }       
  fclose(fptr);
}   
   return 0;

}  


void sendDataToConsole(float temp ,float chargeRate)
{
printf("Temperature:%5.2f;chargeRate:%5.2f",temp,chargeRate);
}


int  main()
{
  float temp = 11.5;
  float chargeRate = 15.5;
  readInpDataFile();
  sendDataToConsole(temp ,chargeRate);
  return 0;
}
