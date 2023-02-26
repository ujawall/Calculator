cd C:\Users\sunil\OneDrive\Documents\NetBeansProjects\Calculator; "JAVA_HOME=C:\\Program Files\\Java\\jdk-19" cmd /c "\"C:\\Program Files\\NetBeans-16\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=com.mycompany.calculator.Calculator \"-Dexec.executable=C:\\Program Files\\Java\\jdk-19\\bin\\java.exe\" \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-16\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" process-classes org.codehaus.mojo:exec-maven-plugin:3.0.0:exec"
2+1
Scanning for projects...

----------------------< com.mycompany:Calculator >----------------------
Building Calculator 1.0-SNAPSHOT
--------------------------------[ jar ]---------------------------------

--- maven-resources-plugin:2.6:resources (default-resources) @ Calculator ---
Using 'UTF-8' encoding to copy filtered resources.
skip non existing resourceDirectory C:\Users\sunil\OneDrive\Documents\NetBeansProjects\Calculator\src\main\resources

--- maven-compiler-plugin:3.1:compile (default-compile) @ Calculator ---
Changes detected - recompiling the module!
Compiling 1 source file to C:\Users\sunil\OneDrive\Documents\NetBeansProjects\Calculator\target\classes

--- exec-maven-plugin:3.0.0:exec (default-cli) @ Calculator ---
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  23.102 s
Finished at: 2023-02-16T22:22:01+05:30
------------------------------------------------------------------------
