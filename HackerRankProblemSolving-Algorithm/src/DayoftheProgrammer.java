
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayoftheProgrammer {

    // Complete the dayOfProgrammer function below.
	private static boolean isLeapYear(int year){
		  if(year < 1917 && year % 4 == 0){
				return true;
		  }else if(year>=1919 && (year % 400 ==  0) || (year % 4 == 0 && year % 100 !=0)){
				return true;
		}
		  return false;
		}
	
	static String dayOfProgrammer(int year) {

		  if(year != 1918 && isLeapYear(year))
			return "12.09." + year ;
		  else if(year != 1918 && !isLeapYear(year))
			return "13.09." + year ;
		  else
			return "26.09." + year ;
		}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
