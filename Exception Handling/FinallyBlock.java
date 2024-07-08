public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int[] nums = {3,5,6,8,9};
            System.out.println(nums[4]);            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //optional block
        finally{
            System.out.println("Done");
        }
    }
}
