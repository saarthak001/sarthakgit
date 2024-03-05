class Table1 extends Thread{

public void run(){

for(int i=0;i<100;i++){
System.out.print(i);
}
}
public void start(){
System.out.println("we are in start");
}

public static void main(String[] args){
Table1 T = new Table1();
T.start();
}
}