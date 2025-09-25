public class O {
    O(){
        IO.println("Hello");
        super(); // allowed
    }
    O(int a){
        IO.println("hii");
        this();  //allowed
    }
    void main(){
        IO.println("Main");
        O o = new O(10);
    }
}

// In java 25, it is allowed that we can write statements before this() or super() call
// but should not try to use or modify instance variables inside it which we will see it next file
// statements before the super() or this() are called prologue, and statements after super() and this() are called epilogue
// in prologue, you can't use instance members i.e. instance variables and methods except to initialize the uninitialize fields
// IN epilogue, you can write return statement but you should not return anything from it and like always it should be the last line statement


// output
// Hello
// Main
// hii
// Hello
