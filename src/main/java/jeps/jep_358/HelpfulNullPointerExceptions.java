package jeps.jep_358;

/**
 *
 * @author Rahul
 */
public class HelpfulNullPointerExceptions {
    
    public void demo1() {
        StringWrapper wrapper = null;
        
        try {
            System.out.println("Demo_1 : Length of content is -> " + wrapper.content.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void demo2() {
        StringWrapper wrapper = new StringWrapper(null);
        
        try {
            System.out.println("Demo_2 : Length of the content is -> " + wrapper.content.length());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private class StringWrapper {
        private final String content;

        public StringWrapper(String content) {
            this.content = content;
        }
    }
}
