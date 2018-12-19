package lab5;



public class Word extends SentenceMember{
    private Letter[] letters;
    public Word(String s) {
        letters = new Letter[s.length()];
        for (int i = 0; i < s.length(); i++) {
            letters[i] = new Letter(s.charAt(i));
        }

                }

    public void DeleteLetters() {
        for (int i = 1; i < letters.length; i++) {
            if (letters[i].equals(letters[0])) {
                letters[i] = null;

            }
        }

        }


        @Override
        public String toString () {
            String result = "";
            for (Letter letter : letters) {
                if (letter != null) {
                    result += letter.toString();
                }
            }
            return result;
        }


    }

