
public class replace {
    public static void main(String[] args) {
        // replace spaces with _
        String name = "Saptarshi Ulhas Pujari";
        name =name.replace(" ","_");
        System.out.println(name);

        //replacing <|name|> with actual name
        String Name= " Saptarshi";
        String text = "Hey <|name|> , How are u ?";
        text = text.replace("<|name|>", name);
        System.out.println(text);
    }
}
