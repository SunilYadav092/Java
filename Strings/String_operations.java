class String_operations
{
    public static void main(String[] args)
    {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;

        System.out.println(str3);

        System.out.println(str3.length());

        System.out.println(str3.toUpperCase());

        System.out.println(str3.toLowerCase());
        
        System.out.println(str3.indexOf("World"));

        System.out.println(str3.substring(6));

        System.out.println(str3.substring(6, 11));

        System.out.println(str3.replace("World", "Universe"));

        System.out.println(str3.startsWith("Hello"));

        System.out.println(str3.endsWith("Universe"));

        System.out.println(str3.charAt(6));

        System.out.println(str3.equals("Hello World"));

        System.out.println(str3.equalsIgnoreCase("hello world"));

        System.out.println(str3.compareTo("Hello World"));

        System.out.println(str3.compareToIgnoreCase("hello world"));

        System.out.println(str3.concat(" Codemithra"));

        System.out.println(str3.trim());

        System.out.println(str3.split(" "));

        System.out.println(str3.isEmpty());

        System.out.println(str3.isBlank());

        System.out.println(str3.getBytes());
        
        // System.out.println(str3.toCharArray());
        // System.out.println(str3.codePointAt(6));
        // System.out.println(str3.codePointBefore(6));
        // System.out.println(str3.codePointCount(0, 11));
        // System.out.println(str3.offsetByCodePoints(0, 6));
        // System.out.println(str3.intern());
        // System.out.println(str3.repeat(3));
        // System.out.println(str3.contains("World"));
        // System.out.println(str3.contentEquals("Hello World"));
        }
}