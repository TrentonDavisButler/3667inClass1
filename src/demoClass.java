package src;
import java.util.Scanner;


public class demoClass
{

public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
programmer theProgrammer;

boolean hiring = true;

char yesNoChar = ' ';
String yesNoString = " ";

char inFirstChar = ' ';
String input = " ";

int numFrontEnd = 0;
int numBackEnd = 0;

while(hiring)
{
yesNoChar = ' ';
yesNoString = " ";

inFirstChar = ' ';
input = " ";

System.out.println("Would you like to hire a programmer? (type yes or no)");
yesNoString = scan.next();
yesNoChar = yesNoString.toLowerCase().charAt(0);

if(yesNoChar == 'n')
{
hiring = false;
}

if(yesNoChar == 'y')
{

while(inFirstChar != 'f' && inFirstChar != 'b')
{
System.out.println("Would you like to hire a backend or frontend programmer?");
input = scan.next();
inFirstChar = input.toLowerCase().charAt(0);

if(inFirstChar == 'f')
{
numFrontEnd++;
}

if(inFirstChar == 'b')
{
numBackEnd++;
}



}

}

} //while

if(numFrontEnd != 0)
{
theProgrammer = new frontend();
for(int i = 0; i < numFrontEnd; i++)
{
theProgrammer.program();
theProgrammer.progressMade();
}
}

if(numBackEnd != 0)
{
theProgrammer = new backend();

for(int i = 0; i < numBackEnd; i++)
{
theProgrammer.program();
theProgrammer.progressMade();
}

}


} //main


} //class
