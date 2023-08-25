package GenericUtility;

import java.time.LocalDateTime;

public interface Iautoconstants {
	String EXCELPATH="./src/test/resources/personaldata.xlsx";
	String JDBC_URL="jdbc:mysql://localhost:3306/advanceselenium";
	String JDBC_UN="root";
	String JDBC_PW="root";
	String PROPERTYFILE="./src/test/resources/credential.properties";
	String SSPATH="./errorShot/";
	String TIME = LocalDateTime.now().toString().replace("T", "  Time-").replace(":", "-");
	String DIRECTORY=System.getProperty("user.dir");
	String EXCELPATHFORADDING="./src/test/resources/ADDING MODULE.xlsx";


}
