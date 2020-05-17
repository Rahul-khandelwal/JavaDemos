package jeps.jep_378;

public class TextBlocks {

    public static String htmlBlock() {
        return "<html>\n" +
                "   <head>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "       <element>\n" +
                "       </element>\n" +
                "   </body>\n" +
                "</html>\n";
    }

    public static String htmlTextBlock() {
        return """
                <html>
                   <head>
                   </head>
                   <body>
                       <element>
                       </element>
                   </body>
                </html>
                """;
    }

    public static String javascriptTextBlock() {
        return """
                function echo(text) {
                    alert("Text is : " + text);
                }
                """;
    }
}
