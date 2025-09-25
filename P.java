public class P {
    // int a = 10; // problem
    int a; // this will execute without problem
    P(){
        a = 20;
        super();  // not allowed gives compilation
    }

    void main(){
        IO.println("abc");
    }

}

// compilation error

// P.java:4: error: cannot assign initialized field 'a' before supertype constructor has been called
//         a = 20;
//         ^
// 1 error
// error: compilation failed
