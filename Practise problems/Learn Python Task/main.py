import os

os.getcwd()

with open('avengers.txt','r') as avengers_file:
    # Created a list from the contents in the avengers.txt file
    fileContent = avengers_file.readlines() 

# Function to create a new alive.txt, dusted.txt, died.txt files
def create_file(param1):
    
    fileName = param1+".txt"

    newFile = open(fileName, 'w+')

    # Create a new list to store the elements from the 'fileContent' list and remove the unwanted suffix like <alive>,<died>,<dusted>
    param1_list = [i.strip().replace("<"+param1+">","").title() for i in fileContent if param1 in i] 

    param1_list.sort()

    # Removing Duplicates in the existing list
    param1_new_list = list(dict.fromkeys(param1_list)) 

    # For loop to go through the each elements in the 'param1_new_list' and write the elements as a line in the new file.
    for index, line in enumerate(param1_new_list):
        newFile.write(line)
        if index < len(param1_new_list) - 1:
            newFile.write('\n')

    newFile.close()

create_file("alive")
create_file("dusted")
create_file("died")
