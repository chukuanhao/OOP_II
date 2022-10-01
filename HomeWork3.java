public class HomeWork3 {
    public static void main(String[] args) {
        ticketClass ta= new ticketClass("A");
        ticketClass tb= new ticketClass("B");
        ticketClass tc= new ticketClass("C");
        ticketClass td= new ticketClass("D");
    }
}

class ticketClass implements Runnable{
    
    static int AllTicket=100000;
    int tTicket;
    Thread t;
    int countTicket=0;
    public ticketClass(String name){
        tTicket=0;
        t=new Thread(this, name);
        t.start();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(grabTicket()){
            tTicket=(int)(Math.random()*4)+1;

            if((AllTicket-tTicket)>=0){
                AllTicket-=tTicket;
                System.out.println(t.getName()+" buys "+tTicket+" tickets.");
                countTicket+=tTicket;
            }else{
                break;
            }
    
        }
        System.out.println(t.getName()+" total sells "+countTicket+" tickets.");
    }

    synchronized private static boolean grabTicket(){
        if(AllTicket>0){
            return true;
        }else{
            return false;
        }
    }
}
