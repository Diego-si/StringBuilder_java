
package stringbuilder;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class StringBuilder {


    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        
        Comment c1 = new Comment("Tenha uma boa viagem!");
        Comment c2 = new Comment("Uau, isso é incrível!");
        Post p1 = new Post(
                sdf.parse("20/03/2020 13:12:11"),
                "Viajar para a New York",
                "Vou visitar esse país maravilhoso!",
                400);
        p1.addComment(c1);
        p1.addComment(c2);
        
        Comment c3 = new Comment("Boa Noite");
        Comment c4 = new Comment("Até mais");
        Post p2 = new Post (
                sdf.parse("04/05/2020 00:50:01"),
                "Boa noite pessoal",
                "Vejo vocês amanhã",
                200);
        p2.addComment(c3);
        p2.addComment(c4);
        
        System.out.println(p1);
        System.out.println(p2);
    }
}
