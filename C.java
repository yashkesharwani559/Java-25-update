C(){  // not allowed
    IO.println("abcd");
}

void main(){
    IO.println("Hello");
}

// means directly we can't create constructor in the file
// C.java:1: error: invalid method declaration; return type required
// C(){  
// ^
// 1 error
// error: compilation failed