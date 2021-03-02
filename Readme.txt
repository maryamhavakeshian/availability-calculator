#########################Introduction##################################################
This program is written in java language and aims to calculate time unavailability in minutes per year, with respect to availability percentage.
##########################Running instruction###########################################
availability-calculator project generate its own inputs (tasks which are being executed), and prints the output of the project in the console.
To run the program, it is simply required to execute the Main class.
######################## Compile Instruction###########################################
The project files are available for standalone execution
The project can be complied through either IntelliJ IDEA or Eclipse IDE.

#########################Problem Statement############################################
The code is a calculator which receive the percentage of availability as input (the availability 
mentioned in the question are hard coded in the program is input). Then, it computes the unavailability
percentage, available time (the number of minutes per year, during which the service is available),
and unavailable time (the number of minutes per year, during which the service is unavailable).

#########################Main Class############################################
The availability percentage mentioned in the question are given to the program (are hardcoded as inputs)
in PercentageList variable. Then, in the for loop of the Main method, various methods of calculator are
called to calculate unavailability percentage, available time, and unavailable time. 

#########################Calculator Class############################################
Calculator Class consists of various method including
1)	PercentageComplement:   which calculates the unavailability percentage
2)	AvailabilityInMinute:   which converts the availability time percentage to available time in minute
3)	UnAvailabilityInMinute: which converts the unavailability time percentage to unavailable time in minute.
4)	AvailabilityPercentage: an optional method added, which computes the availability by receiving available minutes in a year, as it input
############################Output##################################################
availability percentage: 99.99%,
				 -------> unavailability percentage: 0.01%,
				 -------> availability time : 525547.44 min in one year,
				 -------> unavailable time: 52.56 min in one year

availability percentage: 95%,
				 -------> unavailability percentage: 5%,
				 -------> availability time : 499320 min in one year,
				 -------> unavailable time: 26280 min in one year

availability percentage: 99.5%,
				 -------> unavailability percentage: 0.5%,
				 -------> availability time : 522972.0 min in one year,
				 -------> unavailable time: 2628.0 min in one year

availability percentage: 99.95%,
				 -------> unavailability percentage: 0.05%,
				 -------> availability time : 525337.20 min in one year,
				 -------> unavailable time: 262.80 min in one year

availability percentage: 99.995%,
				 -------> unavailability percentage: 0.005%,
				 -------> availability time : 525573.720 min in one year,
				 -------> unavailable time: 26.280 min in one year

availability percentage: 99.999%,
				 -------> unavailability percentage: 0.001%,
				 -------> availability time : 525594.744 min in one year,
				 -------> unavailable time: 5.256 min in one year
