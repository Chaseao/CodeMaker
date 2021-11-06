/**
 * package Main;
 * 
 * 
 * import java.io.FileInputStream; import java.io.IOException;
 * 
 * import org.apache.poi.EncryptedDocumentException; import
 * org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.Sheet;
 * import org.apache.poi.ss.usermodel.Workbook; import
 * org.apache.poi.ss.usermodel.WorkbookFactory;
 * 
 * import components.simplereader.SimpleReader; import
 * components.simplereader.SimpleReader1L; import
 * components.simplewriter.SimpleWriter; import
 * components.simplewriter.SimpleWriter1L;
 */
/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
/**
 * public final class ProgramWithIOAndStaticMethod {
 * 
 * private ProgramWithIOAndStaticMethod() { }
 * 
 * 
 * private static String userinput(SimpleWriter out, SimpleReader in) {
 * out.println("something"); String datadoc = in.nextLine(); return datadoc; }
 * 
 * private static void dataReader(String datadoc, SimpleWriter out) throws
 * EncryptedDocumentException, IOException { FileInputStream ip = new
 * FileInputStream(datadoc); Workbook wb = WorkbookFactory.create(ip); Sheet
 * sheet = wb.getSheet("Prescription_Data"); out.println("here"); for (int i =
 * 0; i < sheet.getLastRowNum(); i++) { Cell a = sheet.getRow(9).getCell(4);
 * out.println(a); }
 * 
 * }
 * 
 * 
 * public static void main(String[] args) throws EncryptedDocumentException,
 * IOException { SimpleReader in = new SimpleReader1L(); SimpleWriter out = new
 * SimpleWriter1L();
 * 
 * dataReader(userinput(out, in), out);
 * 
 * in.close(); out.close(); }
 * 
 * }
 */