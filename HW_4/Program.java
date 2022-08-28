package HW_4;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.PrintWriter;
public class Program {

    public static void main(String[] args) {

        Interface<HighPriority> hp = new Interface<>();
        hp.addTask(new HighPriority("Point 1"));
        hp.addTask(new HighPriority("Point 2"));
        hp.addTask(new HighPriority("Point 3"));

        Interface<MediumPriority> mp = new Interface<>();
        mp.addTask(new MediumPriority("Point 1"));
        mp.addTask(new MediumPriority("Point 2"));
        mp.addTask(new MediumPriority("Point 3"));

        Interface<LowPriority> lp = new Interface<>();
        lp.addTask(new LowPriority("Point 1"));
        lp.addTask(new LowPriority("Point 1"));
        lp.addTask(new LowPriority("Point 1"));

        hp.count();
        lp.PrintTaskList();
    }
    // public class CsvWriter {
    //     public void Print_File(String[] args) {
      
    //       try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
      
    //         StringBuilder sb = new StringBuilder();
    //         sb.append("HW_4.Task");
    //         sb.append('\n');
      
    //         writer.write(sb.toString());
      
    //         System.out.println("done!");
      
    //       } catch (FileNotFoundException e) {
    //         System.out.println(e.getMessage());
    //       }
      
    //     }
    // }
}