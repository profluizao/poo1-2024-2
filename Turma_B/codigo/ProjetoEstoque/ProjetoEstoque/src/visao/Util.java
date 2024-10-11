package visao;

public class Util {
    public static void ClearConsole(){
        System.out.print("\033[H\033[2J");   
        System.out.flush();        
    }
}