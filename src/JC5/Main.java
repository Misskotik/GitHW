package JC5;
import java.io.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {
            PrintWriter pw = new PrintWriter(new File("new.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("header1");
            sb.append(";");
            sb.append("header2");
            sb.append(";");
            sb.append("header3");
            sb.append(";");
            sb.append("\n");

            sb.append("500");
            sb.append(";");
            sb.append("1000");
            sb.append(";");
            sb.append("350");
            sb.append(";");
            sb.append("\n");

            sb.append("5");
            sb.append(";");
            sb.append("5");
            sb.append(";");
            sb.append("5");
            sb.append(";");
            sb.append("\n");

            pw.write(sb.toString());
            pw.close();
            System.out.println("finished");
        } catch (Exception e) {
        }

        String path = "new.csv";
        String line = " ";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
 }
}



//        List<AppData> appList;
//       try { BufferedReader reader = new BufferedReader(new FileReader(
//               "newFile.csv"));
//
//
//
//
//           String line = null;
//           Scanner scanner = null;
//           int index = 0;
//           appList =new ArrayList<>();
//
//            while((line =reader.readLine())!=null)
//
//           {
//
//               AppData app = new AppData();
//               scanner = new Scanner(line);
//               scanner.useDelimiter(";");
//               while (scanner.hasNext()) {
//                   String data = scanner.next();
//                   if (index == 0)
//                       app.setHeader(data);
//                   else if (index == 1)
//                       app.setData(Integer.parseInt(data));
//                   else if (index == 2)
//                       app.setData(Integer.parseInt(data));
//                   else
//                       System.out.println("Incorrect data::" + data);
//                   index++;
//               }
//               index = 0;
//               appList.add(app);
//
//
//               reader.close();
//               System.out.println(appList);
//           }
//
//
//
//
//
//
//       }
//        catch (Exception e) {
//        }
//
//
//










