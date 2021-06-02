#define CATCH_CONFIG_MAIN  // This tells Catch to provide a main() - only do this in one cpp file

#include "../test/catch.hpp"
#include "BMS_Sender.h"

TEST_CASE("validate that O/P fed to console") 
{
    streamAlert_Status_s streamAlertTestStat = {NOT_SENT,FILE_ACCESS_FAILURE};
    streamAlertTestStat = sendDataToConsole(11.5, 0.7);
	
    REQUIRE(streamAlertTestStat.ConsoleSentStatus   == SENT_TO_CONSOLE);

}

TEST_CASE("validate that file read and stream data with invalid file") 
{
    streamAlert_Status_s streamAlertTestStat = {SENT_TO_CONSOLE,FILE_ACCESS_SUCCESS};
    char testFilePath[50] = "data.txt"; /*invalid file */
 
    streamAlertTestStat = streamFileInpData(testFilePath);
	
     REQUIRE(streamAlertTestStat.FileReadStatus   == FILE_ACCESS_FAILURE);
     REQUIRE(streamAlertTestStat.ConsoleSentStatus   == NOT_SENT);

}

TEST_CASE("validate that file read and stream data with valid path") 
{
    streamAlert_Status_s streamAlertTestStat = {NOT_SENT,FILE_ACCESS_FAILURE};
    char testFilePath[50] = "Sender/Inputdata.txt";
 
     streamAlertTestStat = streamFileInpData(testFilePath);
	
     REQUIRE(streamAlertTestStat.FileReadStatus   == FILE_ACCESS_SUCCESS);
     REQUIRE(streamAlertTestStat.ConsoleSentStatus   == SENT_TO_CONSOLE);

}

