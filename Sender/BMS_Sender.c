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

Alert_Status_s AlertStat = {NOT_SENT,FILE_ACCESS_FAILURE};
/*Arrays to store file data*/
//static float temp[30];
//static float ChargeRate[30];

Alert_Status_s  readInpDataFile(void)
{
  FILE *fptr;
  int index;
  float TempRead ,ChargerateRead;
  /*Read the input file*/
  fptr=fopen("Sender/Inputdata.txt","r");
  if (fptr != NULL) 
  { 
     for(index=0;fscanf(fptr,"%f\t%f", &TempRead,&ChargerateRead) != EOF;index++)
     {
       //temp[i] =TempRead;
      // ChargeRate[i] =ChargerateRead;
       sendDataToConsole(TempRead,ChargerateRead);
     }
     /*Close the file*/
     fclose(fptr);
     AlertStat.FileReadStatus = FILE_ACCESS_SUCCESS; 
  }
  else
  {
   printf("File access error");
   AlertStat.ConsoleSentStatus = NOT_SENT; 
   AlertStat.FileReadStatus = FILE_ACCESS_FAILURE; 
  }  
 
  return AlertStat;;
 }  


Alert_Status_s  sendDataToConsole(float temp ,float chargeRate)
{
/*Prints temp and charge rate that read from file*/  
 printf("%5.2f;%5.2f\n",temp,chargeRate);
 AlertStat.ConsoleSentStatus = SENT_TO_CONSOLE;
 return AlertStat; 
}


int  main()
{
  readInpDataFile();
  return 0;
}
