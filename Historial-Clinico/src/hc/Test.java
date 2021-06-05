import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Pacient P1 = new Pacient(151515, "Diana", "Park", 'F', 18, "Polvo", "");
        String answer;
        try{
            String path = "../Historial-Clinico/src/Patients.txt";
            File fileP = new File(path);

            if (!fileP.exists()){
                fileP.createNewFile();
            }
            FileWriter fWriter = new FileWriter(fileP.getAbsoluteFile(), true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(P1.toString());
            bWriter.close();
            do {
                BufferedReader br = new BufferedReader(new FileReader(fileP));
                System.out.println("Enter DNI to search: ");
                answer="DNI: "+sc.nextLine();
                String linea="";
                boolean found = false;
                while ((linea= br.readLine())!=null) {
        
                    if(linea.equalsIgnoreCase(answer)) {
                        System.out.println(linea);
        
                        for(int i=0;i<7;i++) {
                            System.out.println(br.readLine());
                        }   
                        found = true;
                        break;
                    }
                }
                if(!found) System.out.println("The patient does not exist");
        
                    System.out.println("Wanna write another one?");
                    answer=sc.nextLine();
            }while(answer.equalsIgnoreCase("yes"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
