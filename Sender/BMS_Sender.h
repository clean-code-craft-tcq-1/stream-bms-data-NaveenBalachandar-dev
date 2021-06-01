/*****************************************************************************/
/***    \file        BMS_Sender.h
***     \author      Naveen Balachandar (RBEI/ECK3) 
***
***     \brief       Header for BMS parameter streaming project
/*****************************************************************************/

/*enums used forUnit testing*/
typedef enum {
 SENT_TO_CONSOLE,
 NOT_SENT
}ConsoleSentStatus_t;

typedef enum {
 FILE_ACCESS_SUCCESS,
 FILE_ACCESS_FAILURE
}FileReadStatus_t;

typedef enum {
 DATA_MATCHING,
 DATA_NOT_MATCHING
}DataValidStatus_t;

/*Function to send ouput to console*/
int readInpDataFile(void);
/*Function to send ouput to console*/
void sendDataToConsole(float temp ,float chargeRate);
