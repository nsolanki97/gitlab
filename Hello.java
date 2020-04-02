public class Hello {
    public static void main(String argv[]){
        
        //Partner Edit  
        
        
        // this is an unwanted but staged comment      
        
        String name = "World";
        if(argv.length != 0)
        {
            name = argv[0];
        }
        System.out.println("Hello, "+ name + "!");
    }
}
