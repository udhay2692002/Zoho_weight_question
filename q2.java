import java.util.ArrayList;
class q2
{
    public static void main(String []args)
    {
        //NUMBER LIST
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(36);
        list.add(54);
        list.add(89);
        list.add(12);
        //ANNSWER LIST
        ArrayList<String> ans=new ArrayList<>();
        weight a=new weight();
        for(int i=0;i<=list.size()-1;i++)
        {
           int w=a.calculate(list.get(i));
           if(w!=0){
           ans.add("<"+list.get(i)+","+w+">");}
        }
        System.out.println(ans);
    }
}
class weight
{
   int calculate(int numbers)
   {
       int wei=0;
       if(Math.sqrt(numbers)%1==numbers)
       {
          wei=5 ;
       }
       else if(numbers%4==0||numbers%6==0)
        {
            wei=4;
        }
       else if (numbers%2==0)
       {
           wei=3;
       }
       else
       {
           System.out.println(numbers + " IT DOES NOT MATCH ANY CONDITIONS ABOVE SO WEIGHT IS 0");
       }

       return wei;
   }

}
