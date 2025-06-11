import java.util.Scanner;

public class ConvertNumberToWords {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        DeepSeekApiClient client = new DeepSeekApiClient(ApiKeyManager.getApiKey());
        while(true)
        {
            System.out.print("Enter a number Or type q to quit\n");
            String input = scanner.nextLine();

            if(input.equals("q")) break;

            boolean containsNonDigit = false;
            for (int i = 0; i < input.length(); i++) 
            {
                if (!Character.isDigit(input.charAt(i))) 
                {
                    containsNonDigit = true;
                    break;
                }
            }
            if (containsNonDigit) 
            {
                System.out.println("Only Numbers are allowed (not even dot)\n");
                continue;
            }

            String response = client.sendMessage("Convert this number to words: " + input);
            System.out.println("Converted: " + response + "\n");
        }

        scanner.close();
    }
}
