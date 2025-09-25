// in java 25, we have one more feature that the commonly used classes (like from java.util, java.io  ...) and java API from java.base package are automatically available you don't have to import it

void main(){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    IO.print(s);
}

// like here we are using Scanner class which is in java.util package without importing it
