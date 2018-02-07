import org.apache.log4j.Logger;

public class Mylog {
    final static Logger logger = Logger.getLogger(Mylog.class);
    public static void main(String[] args) {
        System.out.println("hello world");
        logger.info("This is info ");

    }
}
