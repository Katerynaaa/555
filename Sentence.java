package lab5;

public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ",.!?";
    private SentenceMember[] sentenceMembers;


    public Sentence(String s) {
        String[] split = s.split("(?=,|\\.|!|\\?)");
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (PUNCTUATION_SYMBOLS.contains(split[i])) {
                sentenceMembers[i] = new Punctuation(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);

            }
        }
    }

    public String toString() {
        String result = "";
        SentenceMember currentSentenceMember;
        for (int i = 0; i < sentenceMembers.length; i++) {
            currentSentenceMember = sentenceMembers[i];
            result += (currentSentenceMember instanceof Word && i != 0 ? " " : "") +
                    currentSentenceMember.toString();
        }
        return result;
    }


    public String Sentmemb() {
        for (SentenceMember k : sentenceMembers) {
            if (k instanceof Word) {
                ((Word)k).DeleteLetters();
            }
        }
    }
}
