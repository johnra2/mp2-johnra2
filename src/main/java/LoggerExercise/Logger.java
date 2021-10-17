package LoggerExercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    /**
     * @TODO Add any necessary fields and variables.
     */

    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    private Logger(){}

    /**
     * @return A Logger instance of this class.
     */
    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     */
    public void logInFile(String log) {
        String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
        String filename = "log"+today+".log";
        File file = new File(filename);
        try{
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(log);
            bw.newLine();
            bw.close();
        } catch (IOException e) {}
        
    }
}