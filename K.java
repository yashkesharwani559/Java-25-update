class K{
    K(int a){
        System.out.println(a);
    }
    void main(){
        System.out.println("hello");
    }
}
//if we create the instance main() method inside the class, then it must have the no parameterized constructor to use
// otherwise it will give below error as
// error: can't find no argument constructor in class: K