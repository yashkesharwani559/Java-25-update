// void main(){ // allowed
//     IO.println("hello");
// }

void main(String[] args){ // allowed
    System.out.println("hello");
}

// int main(){ // !!! not allowed
//     IO.println("hello");
// }

// void main(int a){ // !!! not allowed
//     IO.println("hello");
// }

// float main(int a){ // !!! not allowed
//     IO.println("hello");
// }

// Here you can see that, in java 25 we can directly write code without creating classes
// But internally java compiler automatically creates the classes with the same name as the filename and it is by default final with default access modifier.
// and we can only create all kind o things without creating a class
// this new main() method doesn't requires the String[] as the argument.

static void pro(){ // allowed
}

// public static void main(String[] args) { //allowed
//     System.out.println("hello");
// }