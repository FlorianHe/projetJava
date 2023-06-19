class Decipherer  {

    public static String decipherer(final String message) {
        int keyNb = message.length() / 2;
        String subStr = message.substring(5, 5 + keyNb);
        subStr = subStr.replace("@#?", " ");
        StringBuilder reverseSubStr = new StringBuilder(subStr).reverse();
        String retMsg = reverseSubStr.toString();
        return (retMsg);
    }
    public static void main(final String[] args) {
	    String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        System.out.println(decipherer(message1));
        System.out.println(decipherer(message2));
        System.out.println(decipherer(message3));
    }
}
