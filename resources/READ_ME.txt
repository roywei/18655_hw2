READ ME!

name: Lai Wei
ID: laiw
Language: Java with Bonus part implemented using web services (wsdl as in lab1)


Steps to run the project.

1. Load project into eclipse, there are 2 projects:
 'Lab2_XML_Parse' will process the xml file(in ‘xml’ folder) to take 1000 records, save it to  another xml file under ‘bin’ folder, and then read all the data and store them into database.
 'Lab2_Web' is the bonus part where queries to database are made as a web service

2. Properly setup TomCat with the web project: Lab2_Web

3. The 1.68 G ‘dblp.xml’ was not included in the zip, put it under ‘Lab2_XML_PARSE/xml’ folder for processing. check ‘dblp.dtd’ file is under ‘Lab2_XML_PARSE’ folder. The processed xml is generated at ‘Lab2_XML_PARSE/bin’. By default all files exclude the 1.68GB dblp.xml is in the zip.

4. Setup MySQL database, can refer to laiw_dblp.sql in the resource folder for database structure. By default, the 'Lab2_XML_Parse' project should automatically setup database and tables. Just check the 'DBManager' Class in 'db_Util' package for the correct user name, password and port number to connect to the database.

5. Load mysql-connector-java driver jar lib to both projects. the jar file can be found at '/Lab2_XML_Parse' and '/Lab2_Web/WebContent/WEB-INF/lib'

6. For general test cases, you can modify the input in 'TestCase.java' inside 'driver' package for different kinds of queries. I have already put some sample input there, just run it and the query result will be printed on console. Screen-shots are saved in recourses folder

7. For Bonus part, a web service was implemented, run the server, and open 'WebQuery.wsdl' in WebService Explorer by entering the url: "platform:/resource/Lab2_Web/WebContent/wsdl/WebQuery.wsdl". 5 different queries are available for testing. Screen-shots are saved in resource folder.