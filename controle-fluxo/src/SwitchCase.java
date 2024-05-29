public class SwitchCase {
    
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P" ->  {
                System.out.println("PEQUENO.");
            }
            case "M" ->  {
                System.out.println("MEDIO.");
            }
            case "G" ->  {
                System.out.println("GRANDE.");
                break;
            }
            default -> System.out.println("INDEFINIDO.");
        }
    }
}
