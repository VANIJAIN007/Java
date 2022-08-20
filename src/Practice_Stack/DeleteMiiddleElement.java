package Practice_Stack;

public class DeleteMiiddleElement
{
    public static void main(String[] args) throws Exception {
        StackQPS obj=new StackQPS();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        int curr=0;
        middleElement(obj,curr);
    }
    public static void middleElement(StackQPS s,int curr) throws Exception {

        if(s.isEmpty() || curr==s.size())
        {
            return;
        }
        int x=s.pop();
        
        if(curr!= s.size()/2)
        {
            s.push(x);
        }
    }
}
