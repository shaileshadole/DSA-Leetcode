class Main {
    public String removeDuplicates(final String s) {
        final StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); ++i) {
            if(sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        
        Main m1 = new Main();
        System.out.println(m1.removeDuplicates("abaabacz"));
    }
}