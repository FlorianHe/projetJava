class Movie {

    public static void main(final String[] args) {
	    String[] movieArray = {
            "Raiders of the Lost Ark", 
            "Indiana Jones and the Temple of Doom" ,
            "Indiana Jones and the Kingdom of the Crystal Skull"
        };
        final String[][] actorArray = new String[][] {
            {
                "Harrison Ford", 
                "Karen Allen",
                "Alfred Molina"
            }, 
            {
                "Harrison Ford",
                 "Kate Capshaw",
                 "Roy Chiao"
            },
            {
                "Harrison Ford",
                "Cate Blanchett",
                "Shia LaBeouf"
            }
        };
        for (int i = 0; i < movieArray.length; i++) {
            String retStr = "Dans le film ";
            retStr += movieArray[i] + ", les principaux acteurs sont : ";
            for (int j = 0; j < actorArray[i].length;j++) {
                if (j < actorArray[i].length -1)
                    retStr += actorArray[i][j] + ', ';
                else 
                    retStr += actorArray[i][j];
            }
            System.out.println(retStr);
        }
    }
}
