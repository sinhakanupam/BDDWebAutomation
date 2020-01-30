import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class anupam {

    public void m1(){
        System.out.println("m1");
    }

//0 1 1 2 3 5 8
//i k j
//  i k j
//    i k j

    public void fibbonacci(int n){
        int i=0;
        int k=1;
        int j=0;
        //int [] bb= new int[]
        while (j<=n){

            j=i+k;
            if(j>n){break;}
            System.out.println(j);
            i=k;
            k=j;

        }
    }

    public static void main(String args[]) {

        char [][]a = new char[10][10];
        a[0][1]='e';
        a[1][2]='d';
        a[2][3]='c';
        String av = new String(String.valueOf(a));
        System.out.println(av);






        anupam o = new anupam();
        o.fibbonacci(13);
        try {
            FileInputStream inputStream = new FileInputStream(new File("src/main/resources/anupam.xlsx"));
            Workbook workbook=new XSSFWorkbook(inputStream);
            InputStream inputStream1= inputStream;

            FileReader fileReader = new FileReader(new File("src/main/resources/anupam.txt"));

           

                    int i;

            while ((i=fileReader.read())!=-1){
                System.out.println((char) i);
            }
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String kddd;
            while ((kddd=bufferedReader.readLine())!=null){
                System.out.println(kddd);
            }





            Writer writer= new FileWriter("src/main/resources/anupam.txt");
            writer.append("laptop");
            writer.close();


        }catch (IOException e){System.out.println(e);}




    }

    class nnbb extends anupam{
                   public void m1(){
                       System.out.println("m2");
                   }


    }

}
