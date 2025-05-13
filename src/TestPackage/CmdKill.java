package TestPackage;

class CmdKill
{
    public static void main(String args[])
    {
        try {
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
            System.out.println("done");
        } catch (Exception e) {
            e.printStackTrace();  
        }
    }

}